package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.ESoftwareMapper;
import com.hebeu.keyan.dao.RPersonProjectResultMapper;
import com.hebeu.keyan.dao.customMapper.ESoftwareMapperCustom;
import com.hebeu.keyan.po.*;
import com.hebeu.keyan.po.customPO.ESoftwareCustom;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.service.SoftwareResultService;
import com.hebeu.keyan.utils.FileHandle;
import com.hebeu.keyan.utils.SchoolNumberGenerate;
import com.hebeu.keyan.utils.UUIDUtils;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.SoftwareResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/8/17.
 */
@Service
public class SoftwareResultServiceImpl implements SoftwareResultService{
    private ESoftwareMapperCustom eSoftwareMapperCustom;

    @Autowired
    private SchoolNumberGenerate schoolNumberGenerate;
    @Autowired
    private PersonListService personListService;
    @Autowired
    private ESoftwareMapper eSoftwareMapper;
    @Autowired
    private RPersonProjectResultMapper rPersonProjectResultMapper;
    @Autowired
    public SoftwareResultServiceImpl(ESoftwareMapperCustom eSoftwareMapperCustom){
        this.eSoftwareMapperCustom = eSoftwareMapperCustom;
    }
    @Override
    public List<ESoftwareCustom> findSoftwareResultListByWorkNum(String workNum) {
        return eSoftwareMapperCustom.selectSoftwareByWorkNum(workNum);
    }

    @Override
    public void insertSoftwareResult(SoftwareResultVO softwareResultVO) {
        if(this.softwareNameIsExisted(softwareResultVO)){
            throw new RuntimeException("该软件成果名称已存在");
        }
        try {
            List<PersonListVO> personListVOList = softwareResultVO.getPersonListVOList();
            if ("submit".equals(softwareResultVO.getSubmitType())) {
                schoolNumberGenerate.setSchoolNumber(softwareResultVO);                         //提交时生成 著作成果 编号
                softwareResultVO.setAuditStatusId(2);                                           //保存时将状态设置为2 ，即待学院审核状态
            } else if ("save".equals(softwareResultVO.getSubmitType())) {
                softwareResultVO.setAuditStatusId(1);                                           //保存时将状态设置为1 ，即未提交状态
            }
            softwareResultVO.setSoftwareId(UUIDUtils.getUUID());                                 //生成 著作成果 主键
            if ("-3".equals(personListVOList.get(0).getWorkNum())) {
                softwareResultVO.setLeader("校外人员：" + personListVOList.get(0).getWorkName());
                System.out.println();
            } else if ("-2".equals(personListVOList.get(0).getWorkNum())) {
                softwareResultVO.setLeader("学生：" + personListVOList.get(0).getWorkName());
            } else {
                softwareResultVO.setLeader(personListVOList.get(0).getWorkName() + "(" + personListVOList.get(0).getWorkNum() + ")");
            }

            softwareResultVO.setAttachment(FileHandle.fileUpload(FileHandle.SOFTWARERESULT, softwareResultVO.getFile(), softwareResultVO.getSoftwareId())); //保存文件并得到文件名
            softwareResultVO.setPersonList(softwareResultVO.getPersonListVO().getWorkName());          //设置人员列表字符串
            softwareResultVO.setInsertTime(new Date());                                         //设置当前系统时间为插入时间
            softwareResultVO.setLastTime(new Date());                                           //设置当前系统时间为最后更新时间
            System.out.println(softwareResultVO.toString());
            eSoftwareMapper.insertSelective(softwareResultVO);                                   //向数据库插入 著作成果 数据
            RPersonProjectResult r = new
                    RPersonProjectResult(softwareResultVO.getSoftwareId(), 15, softwareResultVO.getSoftwareName(), softwareResultVO.getPublishDate());
            personListService.insertRPersonProjectResult(personListVOList, r);        //传入人员列表和对应项目中的属性对象
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("插入数据失败");
        }
    }

    @Override
    public boolean softwareNameIsExisted(SoftwareResultVO softwareResultVO) {
        if (softwareResultVO.getSoftwareName() == null) {
            return false;
        }
        ESoftwareExample eSoftwareExample = new ESoftwareExample();
        ESoftwareExample.Criteria criteria = eSoftwareExample.createCriteria();
        criteria.andSoftwareNameEqualTo(softwareResultVO.getSoftwareName());
        //排除自身进行查重
        if (softwareResultVO.getSoftwareId() != null) {
            criteria.andSoftwareIdNotEqualTo(softwareResultVO.getSoftwareId());
        }
        return eSoftwareMapper.selectByExample(eSoftwareExample).size() > 0;
    }

    @Override
    public void deleteSoftwareResult(String softwareId) {
        try {
            ESoftware eSoftware = eSoftwareMapper.selectByPrimaryKey(softwareId);
            eSoftwareMapper.deleteByPrimaryKey(softwareId);
            //删除人员项目成果关系表的数据
            RPersonProjectResultExample rPersonProjectResultExample = new RPersonProjectResultExample();
            RPersonProjectResultExample.Criteria criteria = rPersonProjectResultExample.createCriteria();
            criteria.andIdEqualTo(softwareId);
            rPersonProjectResultMapper.deleteByExample(rPersonProjectResultExample);
            //删除项目相关的附件，最后进行删除附件操作，如果前面删除项目失败就不会删除附件
            FileHandle.deleteFile(FileHandle.SOFTWARERESULT, eSoftware.getAttachment());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("删除软件成果失败");
        }
    }

    @Override
    public List<PersonListVO> findPersonListBySoftwareId(String softwareId) {
        return eSoftwareMapperCustom.selectPersonListBySoftwareId(softwareId);
    }

    @Override
    public ESoftwareCustom findSoftwareResult(String softwareId) {
        return eSoftwareMapperCustom.selectSoftwareResultInfoById(softwareId);
    }

    @Override
    public void updateSoftwareResult(SoftwareResultVO softwareResultVO) {
        if(this.softwareNameIsExisted(softwareResultVO)){
            throw new RuntimeException("该软件成果名称已存在");
        }
        try {
            List<PersonListVO> personListVOList = softwareResultVO.getPersonListVOList();
            if ("submit".equals(softwareResultVO.getSubmitType())) {
                schoolNumberGenerate.setSchoolNumber(softwareResultVO);

                softwareResultVO.setAuditStatusId(2);
            } else if ("save".equals(softwareResultVO.getSubmitType())) {

                softwareResultVO.setAuditStatusId(1);
            }

            if ("-3".equals(personListVOList.get(0).getWorkNum())) {
                softwareResultVO.setLeader("校外人员：" + personListVOList.get(0).getWorkName());
            } else if ("-2".equals(personListVOList.get(0).getWorkNum())) {
                softwareResultVO.setLeader("学生：" + personListVOList.get(0).getWorkName());
            } else {
                softwareResultVO.setLeader(personListVOList.get(0).getWorkName() + "(" + personListVOList.get(0).getWorkNum() + ")");
            }

            softwareResultVO.setAttachment(FileHandle.fileUpload(FileHandle.SOFTWARERESULT, softwareResultVO.getFile(), softwareResultVO.getSoftwareId()));
            softwareResultVO.setPersonList(softwareResultVO.getPersonListVO().getWorkName());
            softwareResultVO.setInsertTime(new Date());
            softwareResultVO.setLastTime(new Date());
            System.out.println(softwareResultVO.toString());
            eSoftwareMapper.updateByPrimaryKeySelective(softwareResultVO);

            RPersonProjectResultExample rPersonProjectResultExample = new RPersonProjectResultExample();
            RPersonProjectResultExample.Criteria criteria = rPersonProjectResultExample.createCriteria();
            criteria.andIdEqualTo(softwareResultVO.getSoftwareId());
            rPersonProjectResultMapper.deleteByExample(rPersonProjectResultExample);

            RPersonProjectResult r = new
                    RPersonProjectResult(softwareResultVO.getSoftwareId(), 15, softwareResultVO.getSoftwareName(), softwareResultVO.getPublishDate());
            personListService.insertRPersonProjectResult(personListVOList, r);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("编辑数据失败");
        }
    }
}
