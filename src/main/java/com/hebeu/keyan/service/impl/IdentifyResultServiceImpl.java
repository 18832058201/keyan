package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.EIdentifyMapper;
import com.hebeu.keyan.dao.RPersonProjectResultMapper;
import com.hebeu.keyan.dao.customMapper.EIdentifyMapperCustom;
import com.hebeu.keyan.po.EIdentify;
import com.hebeu.keyan.po.EIdentifyExample;
import com.hebeu.keyan.po.RPersonProjectResult;
import com.hebeu.keyan.po.RPersonProjectResultExample;
import com.hebeu.keyan.po.customPO.EIdentifyCustom;
import com.hebeu.keyan.service.IdentifyResultService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.utils.FileHandle;
import com.hebeu.keyan.utils.SchoolNumberGenerate;
import com.hebeu.keyan.utils.UUIDUtils;
import com.hebeu.keyan.vo.IdentifyResultVO;
import com.hebeu.keyan.vo.PersonListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/8  11:24
 * 描述：鉴定成果  业务处理实现类
 */
@Service
public class IdentifyResultServiceImpl implements IdentifyResultService{
    private final EIdentifyMapper eIdentifyMapper;
    private final SchoolNumberGenerate schoolNumberGenerate;
    private final EIdentifyMapperCustom eIdentifyMapperCustom;
    private final RPersonProjectResultMapper rPersonProjectResultMapper;
    private final PersonListService personListService;

    @Autowired
    public IdentifyResultServiceImpl(EIdentifyMapper eIdentifyMapper,SchoolNumberGenerate schoolNumberGenerate,EIdentifyMapperCustom eIdentifyMapperCustom,RPersonProjectResultMapper rPersonProjectResultMapper,PersonListService personListService){
        this.eIdentifyMapper = eIdentifyMapper;
        this.schoolNumberGenerate = schoolNumberGenerate;
        this.eIdentifyMapperCustom = eIdentifyMapperCustom;
        this.personListService = personListService;
        this.rPersonProjectResultMapper = rPersonProjectResultMapper;
    }

    /**
     * 通过 工号 查询 鉴定成果 集合
     *
     * @param workNum 指定查询的工号
     * @return 返回指定 工号 的 鉴定成果 集合
     */
    @Override
    public List<EIdentifyCustom> findIdentifyResultListByWorkNum(String workNum){
        return eIdentifyMapperCustom.selectIdentifyResultByWorkNum(workNum);
    }

    /**
     * 插入 鉴定成果（包括保存和提交）
     *
     * @param identifyResultVO 鉴定成果 值对象
     */
    @Override
    public void insertIdentifyResult(IdentifyResultVO identifyResultVO) {
        if (this.identifyNameIsExisted(identifyResultVO)) {
            throw new RuntimeException("输入的名称已存在，请重新输入");
        }
        try {
            //通过 鉴定成果 信息中的人员字符串得到人员列表集合
            List<PersonListVO> personListVOList = identifyResultVO.getPersonListVOList();
            /*start：设置 鉴定成果 的属性值并保存到数据库*/
            //判断操作类型，为submit提交就 生成校内编号，并且将审核状态设置为1
            if ("submit".equals(identifyResultVO.getSubmitType())) {
                schoolNumberGenerate.setSchoolNumber(identifyResultVO);                         //提交时生成 鉴定成果 编号
                identifyResultVO.setAuditStatusId(2);                                           //保存时将状态设置为2 ，即待学院审核状态
            } else if ("save".equals(identifyResultVO.getSubmitType())) {
                identifyResultVO.setAuditStatusId(1);                                           //保存时将状态设置为1 ，即未提交状态
            }
            //下边设置保存提交都相同的属性
            identifyResultVO.setIdentifyId(UUIDUtils.getUUID());                               //生成 鉴定成果 主键
            //取集合中第一个为负责人并设置到 鉴定成果 信息
            //-3表示校外人员，-2表示学生，其他情况表示校内教师
            if ("-3".equals(personListVOList.get(0).getWorkNum())) {
                identifyResultVO.setLeader("校外人员：" + personListVOList.get(0).getWorkName());
            } else if ("-2".equals(personListVOList.get(0).getWorkNum())) {
                identifyResultVO.setLeader("学生：" + personListVOList.get(0).getWorkName());
            } else {
                identifyResultVO.setLeader(personListVOList.get(0).getWorkName() + "(" + personListVOList.get(0).getWorkNum() + ")");
            }
            identifyResultVO.setAttachment(FileHandle.fileUpload(FileHandle.IDENTIFYRESULT, identifyResultVO.getFile(), identifyResultVO.getIdentifyId())); //保存文件并得到文件名
            identifyResultVO.setPersonList(identifyResultVO.getPersonListVO().getWorkName());          //设置人员列表字符串
            identifyResultVO.setInsertTime(new Date());                                         //设置当前系统时间为插入时间
            identifyResultVO.setLastTime(new Date());                                           //设置当前系统时间为最后更新时间
            eIdentifyMapper.insertSelective(identifyResultVO);                                   //向数据库插入 鉴定成果 数据
            /*end：设置 鉴定成果 的属性值并保存到数据库*/
            /*start：向人员项目成果关系表中插数据*/
            //创建关系表对象，需要初始化 （项目或成果id，类型，项目或成果名称，关键性时间）四个属性值
            RPersonProjectResult r = new
                    RPersonProjectResult(identifyResultVO.getIdentifyId(), 11, identifyResultVO.getProjectName(), identifyResultVO.getIdentifyDate());
            personListService.insertRPersonProjectResult(personListVOList, r);        //传入人员列表和对应项目中的属性对象
            /*end：向人员项目成果关系表中插数据*/
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("插入数据失败");
        }
    }

    /**
     * 通过主键id查询成果的详细信息
     *
     * @param identifyId 鉴定成果id
     * @return 返回鉴定成果对象
     */
    @Override
    public EIdentifyCustom findIdentifyResultByIdentifyId(String identifyId) {
        return eIdentifyMapperCustom.selectIdentifyResultInfoByIdentifyId(identifyId);
    }

    /**
     * 通过指定主键id查询对应的人员列表
     *
     * @param identifyId 鉴定成果id
     * @return 返回人员列表集合
     */
    @Override
    public List<PersonListVO> findPersonListByIdentifyId(String identifyId) {
        return eIdentifyMapperCustom.selectPersonListByIdentifyId(identifyId);
    }

    /**
     * 编辑成果信息
     *
     * @param identifyResultVO 成果值对象
     */
    @Override
    public void updateIdentifyResult(IdentifyResultVO identifyResultVO){
        if (this.identifyNameIsExisted(identifyResultVO)) {
            throw new RuntimeException("输入的名称已存在，请重新输入");
        }
        try {
            //通过 成果对象 信息中的人员字符串得到人员列表集合
            List<PersonListVO> personListVOList = identifyResultVO.getPersonListVOList();
            /*start：设置 鉴定成果 的属性值并保存到数据库*/
            //判断操作类型，为submit提交就 生成校内编号，并且将审核状态设置为1
            if ("submit".equals(identifyResultVO.getSubmitType())) {
                schoolNumberGenerate.setSchoolNumber(identifyResultVO);                         //提交时生成 鉴定成果 编号
                identifyResultVO.setAuditStatusId(2);                                           //保存时将状态设置为2 ，即待学院审核状态
            } else if ("save".equals(identifyResultVO.getSubmitType())) {
                identifyResultVO.setAuditStatusId(1);                                           //保存时将状态设置为1 ，即未提交状态
            }
            //下边设置保存提交都相同的属性
            //取集合中第一个为负责人并设置到 鉴定成果 信息
            //-3表示校外人员，-2表示学生，其他情况表示校内教师
            if ("-3".equals(personListVOList.get(0).getWorkNum())) {
                identifyResultVO.setLeader("校外人员：" + personListVOList.get(0).getWorkName());
            } else if ("-2".equals(personListVOList.get(0).getWorkNum())) {
                identifyResultVO.setLeader("学生：" + personListVOList.get(0).getWorkName());
            } else {
                identifyResultVO.setLeader(personListVOList.get(0).getWorkName() + "(" + personListVOList.get(0).getWorkNum() + ")");
            }
            identifyResultVO.setAttachment(FileHandle.fileUpload(FileHandle.IDENTIFYRESULT, identifyResultVO.getFile(), identifyResultVO.getIdentifyId())); //保存文件并得到文件名
            identifyResultVO.setPersonList(identifyResultVO.getPersonListVO().getWorkName());          //设置人员列表字符串
            identifyResultVO.setLastTime(new Date());                                         //设置当前系统时间为最后更新时间
            System.out.println(identifyResultVO.toString());
            eIdentifyMapper.updateByPrimaryKeySelective(identifyResultVO);                        //更新 鉴定成果 数据
            /*end：设置 鉴定成果 的属性值并保存到数据库*/
            /*start：删除人员项目成果关系表中需此鉴定成果id的所有数据*/
            RPersonProjectResultExample rPersonProjectResultExample = new RPersonProjectResultExample();
            RPersonProjectResultExample.Criteria criteria = rPersonProjectResultExample.createCriteria();
            criteria.andIdEqualTo(identifyResultVO.getIdentifyId());
            rPersonProjectResultMapper.deleteByExample(rPersonProjectResultExample);
            /*end：删除人员项目成果关系表中需此鉴定成果id的所有数据*/

            /*start：向人员项目关系表中插数据*/
            //创建关系表对象，需要初始化 （项目或成果id，类型，项目或成果名称，关键性时间）四个属性值
            RPersonProjectResult r = new
                    RPersonProjectResult(identifyResultVO.getIdentifyId(), 11, identifyResultVO.getProjectName(), identifyResultVO.getIdentifyDate());
            personListService.insertRPersonProjectResult(personListVOList, r);        //传入人员列表和对应项目中的属性对象
            /*end：向人员项目关系表中插数据*/

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("插入数据失败");
        }
    }


    /**
     * 检查是否存在同名鉴定成果输入的名称
     *
     * @param identifyResultVO 项目对象
     * @return 存在就返回true  ，不存在返回false
     */
    @Override
    public boolean identifyNameIsExisted(IdentifyResultVO identifyResultVO) {
        //传入的鉴定成果输入的项目名为空时返回false表示不存在
        if (identifyResultVO.getProjectName() == null) {
            return false;
        }
        EIdentifyExample eIdentifyExample = new EIdentifyExample();
        EIdentifyExample.Criteria criteria = eIdentifyExample.createCriteria();
        criteria.andProjectNameEqualTo(identifyResultVO.getProjectName());
        //排除自身进行查重
        if (identifyResultVO.getIdentifyId() != null) {
            criteria.andIdentifyIdNotEqualTo(identifyResultVO.getIdentifyId());
        }
        return eIdentifyMapper.selectByExample(eIdentifyExample).size() > 0;  //大于0返回true表示存在该名称
    }

    /**
     * 删除指定id的鉴定成果
     *
     * @param identifyId 鉴定成果编号
     */
    public void deleteIdentifyResultByIdentifyId(String identifyId) {
        try {
            //先查询出要删除的鉴定成果
            EIdentify eIdentify = eIdentifyMapper.selectByPrimaryKey(identifyId);
            //从e_reward表删除鉴定成果
            eIdentifyMapper.deleteByPrimaryKey(identifyId);
            //删除人员项目成果关系表的数据
            RPersonProjectResultExample rPersonProjectResultExample = new RPersonProjectResultExample();
            RPersonProjectResultExample.Criteria criteria = rPersonProjectResultExample.createCriteria();
            criteria.andIdEqualTo(identifyId);
            rPersonProjectResultMapper.deleteByExample(rPersonProjectResultExample);
            //删除相关的附件，最后进行删除附件操作，如果前面删除失败就不会删除附件
            FileHandle.deleteFile(FileHandle.IDENTIFYRESULT, eIdentify.getAttachment());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("删除该成果失败");
        }
    }
}
