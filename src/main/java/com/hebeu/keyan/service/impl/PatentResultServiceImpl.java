package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.EPatentMapper;
import com.hebeu.keyan.dao.RPersonProjectResultMapper;
import com.hebeu.keyan.dao.customMapper.EPatentMapperCustom;
import com.hebeu.keyan.po.EPatent;
import com.hebeu.keyan.po.EPatentExample;
import com.hebeu.keyan.po.RPersonProjectResult;
import com.hebeu.keyan.po.RPersonProjectResultExample;
import com.hebeu.keyan.po.customPO.EPatentCustom;
import com.hebeu.keyan.service.PatentResultService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.utils.FileHandle;
import com.hebeu.keyan.utils.SchoolNumberGenerate;
import com.hebeu.keyan.utils.UUIDUtils;
import com.hebeu.keyan.vo.PatentResultVO;
import com.hebeu.keyan.vo.PersonListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/8/10.
 */
@Service
public class PatentResultServiceImpl implements PatentResultService {

    private EPatentMapperCustom ePatentMapperCustom;
    private SchoolNumberGenerate schoolNumberGenerate;
    private EPatentMapper ePatentMapper;
    private PersonListService personListService;
    private RPersonProjectResultMapper rPersonProjectResultMapper;
    @Autowired
    public PatentResultServiceImpl(EPatentMapperCustom ePatentMapperCustom,SchoolNumberGenerate schoolNumberGenerate,EPatentMapper ePatentMapper,PersonListService personListService,RPersonProjectResultMapper rPersonProjectResultMapper){
        this.ePatentMapperCustom = ePatentMapperCustom;
        this.schoolNumberGenerate = schoolNumberGenerate;
        this.ePatentMapper = ePatentMapper;
        this.personListService = personListService;
        this.rPersonProjectResultMapper = rPersonProjectResultMapper;
    }
    @Override
    public List<EPatentCustom> findPatentResultListByWorkNum(String workNum) {
        return ePatentMapperCustom.selectPatentByWorkNum(workNum);
    }

    @Override
    public void insertPatentResult(PatentResultVO patentResultVO) {
        if(this.patentNameIsExisted(patentResultVO)){
            throw new RuntimeException("该专利成果名称已存在");
        }
        try {
            List<PersonListVO> personListVOList = patentResultVO.getPersonListVOList();
            if ("submit".equals(patentResultVO.getSubmitType())) {
                schoolNumberGenerate.setSchoolNumber(patentResultVO);                         //提交时生成 著作成果 编号
                System.out.println();
                patentResultVO.setAuditStatusId(2);                                           //保存时将状态设置为2 ，即待学院审核状态
            } else if ("save".equals(patentResultVO.getSubmitType())) {
                patentResultVO.setAuditStatusId(1);                                           //保存时将状态设置为1 ，即未提交状态
            }
            patentResultVO.setPatentId(UUIDUtils.getUUID());                                 //生成 著作成果 主键
            if ("-3".equals(personListVOList.get(0).getWorkNum())) {
                patentResultVO.setLeader("校外人员：" + personListVOList.get(0).getWorkName());
                System.out.println();
            } else if ("-2".equals(personListVOList.get(0).getWorkNum())) {
                patentResultVO.setLeader("学生：" + personListVOList.get(0).getWorkName());
            } else {
                patentResultVO.setLeader(personListVOList.get(0).getWorkName() + "(" + personListVOList.get(0).getWorkNum() + ")");
            }

            patentResultVO.setAttachment(FileHandle.fileUpload(FileHandle.PATENTREULT, patentResultVO.getFile(), patentResultVO.getPatentId())); //保存文件并得到文件名
            patentResultVO.setPersonList(patentResultVO.getPersonListVO().getWorkName());          //设置人员列表字符串
            patentResultVO.setInsertTime(new Date());                                         //设置当前系统时间为插入时间
            patentResultVO.setLastTime(new Date());                                           //设置当前系统时间为最后更新时间
            System.out.println(patentResultVO.toString());
            ePatentMapper.insertSelective(patentResultVO);                                   //向数据库插入 著作成果 数据
            RPersonProjectResult r = new
                    RPersonProjectResult(patentResultVO.getPatentId(), 13, patentResultVO.getPatentName(), patentResultVO.getEmpowerDate());
            personListService.insertRPersonProjectResult(personListVOList, r);        //传入人员列表和对应项目中的属性对象
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("插入数据失败");
        }
    }

    public boolean patentNameIsExisted(PatentResultVO patentResultVO){
        if(patentResultVO.getPatentName()==null){
            return false;
        }

        EPatentExample ePatentExample = new EPatentExample();
        EPatentExample.Criteria criteria = ePatentExample.createCriteria();
        criteria.andPatentNameEqualTo(patentResultVO.getPatentName());
        if(patentResultVO.getPatentId()!=null){
            criteria.andPatentIdNotEqualTo(patentResultVO.getPatentId());
        }
        return ePatentMapper.selectByExample(ePatentExample).size() > 0;
    }

    @Override
    public EPatentCustom findPatentResultById(String patentId) {
        return ePatentMapperCustom.selectPatentResultInfoById(patentId);
    }

    @Override
    public List<PersonListVO> findPersonalListById(String patentId) {
        return ePatentMapperCustom.selectPersonListByPatentId(patentId);
    }

    @Override
    public void updatePatentResult(PatentResultVO patentResultVO) {
        if(this.patentNameIsExisted(patentResultVO)){
            throw new RuntimeException("该专利成果名称已存在");
        }
        try{
            List<PersonListVO> personListVOList = patentResultVO.getPersonListVOList();
            if ("submit".equals(patentResultVO.getSubmitType())) {
                schoolNumberGenerate.setSchoolNumber(patentResultVO);                         //提交时生成 著作成果 编号
                patentResultVO.setAuditStatusId(2);
            } else if ("save".equals(patentResultVO.getSubmitType())) {
                patentResultVO.setAuditStatusId(1);                                           //保存时将状态设置为1 ，即未提交状态
            }

            if ("-3".equals(personListVOList.get(0).getWorkNum())) {
                patentResultVO.setLeader("校外人员：" + personListVOList.get(0).getWorkName());
                System.out.println();
            } else if ("-2".equals(personListVOList.get(0).getWorkNum())) {
                patentResultVO.setLeader("学生：" + personListVOList.get(0).getWorkName());
            } else {
                patentResultVO.setLeader(personListVOList.get(0).getWorkName() + "(" + personListVOList.get(0).getWorkNum() + ")");
            }

            patentResultVO.setAttachment(FileHandle.fileUpload(FileHandle.PATENTREULT, patentResultVO.getFile(), patentResultVO.getPatentId())); //保存文件并得到文件名
            patentResultVO.setPersonList(patentResultVO.getPersonListVO().getWorkName());          //设置人员列表字符串
            patentResultVO.setInsertTime(new Date());                                         //设置当前系统时间为插入时间
            patentResultVO.setLastTime(new Date());                                           //设置当前系统时间为最后更新时间
            System.out.println(patentResultVO.toString());
            ePatentMapper.updateByPrimaryKeySelective(patentResultVO);

            /*start：删除人员项目成果关系表中需此著作成果id的所有数据*/
            RPersonProjectResultExample rPersonProjectResultExample = new RPersonProjectResultExample();
            RPersonProjectResultExample.Criteria criteria = rPersonProjectResultExample.createCriteria();
            criteria.andIdEqualTo(patentResultVO.getPatentId());
            rPersonProjectResultMapper.deleteByExample(rPersonProjectResultExample);
            /*end：删除人员项目成果关系表中需此著作成果id的所有数据*/

            /*start：向人员项目关系表中插数据*/
            //创建关系表对象，需要初始化 （项目或成果id，类型，项目或成果名称，关键性时间）四个属性值
            RPersonProjectResult r = new
                    RPersonProjectResult(patentResultVO.getPatentId(), 13, patentResultVO.getPatentName(), patentResultVO.getEmpowerDate());
            personListService.insertRPersonProjectResult(personListVOList, r);        //传入人员列表和对应项目中的属性对象
            /*end：向人员项目关系表中插数据*/
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("插入数据失败");
        }
    }

    @Override
    public void deletePatentResult(String patentId) {
        try {
            EPatent ePatent = ePatentMapper.selectByPrimaryKey(patentId);
            ePatentMapper.deleteByPrimaryKey(patentId);
            RPersonProjectResultExample rPersonProjectResultExample = new RPersonProjectResultExample();
            RPersonProjectResultExample.Criteria criteria = rPersonProjectResultExample.createCriteria();
            criteria.andIdEqualTo(patentId);
            rPersonProjectResultMapper.deleteByExample(rPersonProjectResultExample);
            FileHandle.deleteFile(FileHandle.PATENTREULT, ePatent.getAttachment());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
