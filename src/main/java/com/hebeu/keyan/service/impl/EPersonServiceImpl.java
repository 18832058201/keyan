package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.EPersonEditMapper;
import com.hebeu.keyan.dao.EPersonMapper;
import com.hebeu.keyan.dao.SysUserMapper;
import com.hebeu.keyan.dao.customMapper.EPersonMapperCustom;
import com.hebeu.keyan.po.*;
import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.po.customPO.EPersonCustom;
import com.hebeu.keyan.po.customPO.EPersonEditCustom;
import com.hebeu.keyan.service.EPersonService;
import com.hebeu.keyan.utils.FileHandle;
import com.hebeu.keyan.utils.PersonInfoEditCode;
import com.hebeu.keyan.vo.AuditObjectVo;
import com.hebeu.keyan.vo.PersonInfoSearchVO;
import org.apache.ibatis.jdbc.Null;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017-08-18  15:01
 * 描述：人员信息详情 相关接口实现类
 */
@Service
public class EPersonServiceImpl implements EPersonService {
    private final EPersonMapperCustom ePersonMapperCustom;
    private final EPersonMapper ePersonMapper;
    private final EPersonEditMapper ePersonEditMapper;
    private final PersonInfoEditCode personInfoEditCode;
    private final SysUserMapper sysUserMapper;

    @Autowired
    public EPersonServiceImpl(EPersonMapperCustom ePersonMapperCustom, EPersonMapper ePersonMapper, EPersonEditMapper ePersonEditMapper, PersonInfoEditCode personInfoEditCode,SysUserMapper sysUserMapper) {
        this.ePersonMapperCustom = ePersonMapperCustom;
        this.ePersonMapper = ePersonMapper;
        this.ePersonEditMapper = ePersonEditMapper;
        this.personInfoEditCode = personInfoEditCode;
        this.sysUserMapper = sysUserMapper;
    }

    /**
     * 通过登录人工号查询该工号的详情
     *
     * @param workNum 工号
     * @return ePersonCustom 个人信息对象
     */
    @Override
    public EPersonCustom findPersonInfoByWorkNum(String workNum) {
        return ePersonMapperCustom.selectPersonInfoByWorkNum(workNum);
    }

    /**
     * 编辑人员信息
     *
     * @param ePersonCustom 项目值对象
     */
    @Override
    public void updatePersonInfo(EPersonCustom ePersonCustom) {
        try {
            //创建一个ePersonEdit对象
            EPersonEdit ePersonEdit = new EPersonEdit();
            //从e_person表中查询出更改之前的数据
            EPersonExample ePersonExample = new EPersonExample();
            EPersonExample.Criteria criteria = ePersonExample.createCriteria();
            criteria.andWorkNumEqualTo(ePersonCustom.getWorkNum());
            List<EPerson> ePersonList = ePersonMapper.selectByExample(ePersonExample);
            if (ePersonList.size() > 0) {
                EPerson ePerson = ePersonList.get(0);//实例化EPerson对象，接收返回的结果
                //判断ePerson对象和ePersonCustom对象中关键性值是否一致
                if ((!ePersonCustom.getCollegeId2().equals(ePerson.getCollegeId2())) || (!ePersonCustom.getWorkName().equals(ePerson.getWorkName())) || (!ePersonCustom.getTitleTypeId().equals(ePerson.getTitleTypeId())) || (!ePersonCustom.getTitleLevelId().equals(ePerson.getTitleLevelId())) || (!ePersonCustom.getPostTypeId().equals(ePerson.getPostTypeId())) || (!ePersonCustom.getPostLevelId().equals(ePerson.getPostLevelId()))) {
                    ePersonEdit.setWorkNum(ePersonCustom.getWorkNum());
                    String editContent = "";//编辑内容
                    //判断哪些关键性值不一致，赋值到ePersonEdit对象
                    if (ePerson.getCollegeId2()!=null) {
                        if (!ePersonCustom.getCollegeId2().equals(ePerson.getCollegeId2())) {
                            ePersonEdit.setCollegeId2(ePersonCustom.getCollegeId2());
                            editContent = "科研所属学院";
                        } else if (ePerson.getCollegeId2().equals(ePersonCustom.getCollegeId2())) {
                            ePersonEdit.setCollegeId2(ePerson.getCollegeId2());
                        }
                    }else {
                        ePersonEdit.setCollegeId2(ePersonCustom.getCollegeId2());
                        editContent = "科研所属学院";
                    }
                    if (!ePersonCustom.getWorkName().equals(ePerson.getWorkName())) {
                        ePersonEdit.setWorkName(ePersonCustom.getWorkName());
                        if ("".equals(editContent)) {
                            editContent = "姓名";
                        } else {
                            editContent += ",姓名";
                        }
                    }
                    if (!ePersonCustom.getTitleTypeId().equals(ePerson.getTitleTypeId())) {
                        ePersonEdit.setTitleTypeId(ePersonCustom.getTitleTypeId());
                        if ("".equals(editContent)) {
                            editContent = "职称类型";
                        } else {
                            editContent += ",职称类型";
                        }
                    }
                    if (!ePersonCustom.getTitleLevelId().equals(ePerson.getTitleLevelId())) {
                        ePersonEdit.setTitleLevelId(ePersonCustom.getTitleLevelId());
                        if ("".equals(editContent)) {
                            editContent = "职称等级";
                        } else {
                            editContent += ",职称等级";
                        }
                    }
                    if (!ePersonCustom.getPostTypeId().equals(ePerson.getPostTypeId())) {
                        ePersonEdit.setPostTypeId(ePersonCustom.getPostTypeId());
                        if ("".equals(editContent)) {
                            editContent = "绩效类型";
                        } else {
                            editContent += ",绩效类型";
                        }
                    }
                    if (!ePersonCustom.getPostLevelId().equals(ePerson.getPostLevelId())) {
                        ePersonEdit.setPostLevelId(ePersonCustom.getPostLevelId());
                        if ("".equals(editContent)) {
                            editContent = "绩效等级";
                        } else {
                            editContent += ",绩效等级";
                        }
                    }
                    ePersonEdit.setPersonEditId(personInfoEditCode.getPersonInfoEditCode());//设置编辑个人信息详情编号
                    ePersonEdit.setEditContent(editContent);//设置编辑内容
                    ePersonEdit.setAuditStatusId(1);//设置审核状态
                    ePersonEdit.setLastTime(new Date());//设置当前时间为最后操作时间
                    ePersonEditMapper.insertSelective(ePersonEdit);//向e_person_edit插入数据
                }
                //不变动原来的关键性值
                ePersonCustom.setCollegeId2(ePerson.getCollegeId2());
                ePersonCustom.setWorkName(ePerson.getWorkName());
                ePersonCustom.setPostTypeId(ePerson.getPostTypeId());
                ePersonCustom.setPostLevelId(ePerson.getPostLevelId());
                ePersonCustom.setTitleTypeId(ePerson.getTitleTypeId());
                ePersonCustom.setTitleLevelId(ePerson.getTitleLevelId());
                //不涉及到关键性信息的修改，直接更新e_person表数据
                ePersonMapper.updateByPrimaryKeySelective(ePersonCustom);//更新e_person表数据
            }

            /*start：第一次登良路提交时更新信息状态*/
            EPersonCustom ePersonCustom1 = new EPersonCustom();
            ePersonCustom1.setWorkNum(ePersonCustom.getWorkNum());
            ePersonCustom1.setInformationStatus(1); //设置信息状态为1
            ePersonMapper.updateByPrimaryKeySelective(ePersonCustom1);//更新信息状态
            /*end：第一次登良路提交时更新信息状态*/

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("编辑数据失败");
        }
    }

    /**
     * 从e_person_edit查询待审核的编辑
     *
     * @param workNum 工号
     */
    @Override
    public EPersonEditCustom findEPersonEditByWorkNum(String workNum) {
        return ePersonMapperCustom.selectEPersonEditByWorkNum(workNum);
    }

    /**
     * 从e_person_edit查询待审核的编辑
     *
     * @param personEditId
     */
    @Override
    public EPersonEditCustom findEPersonEditByPersonEditId(String personEditId) {
        return ePersonMapperCustom.selectEPersonEditByPersonEditId(personEditId);
    }

    /*-----------------------以下为审核部分所需方法------------------------*/

    /**
     * 按指定条件查询 个人信息详情更改
     *
     * @param personInfoSearchVO
     * @return 返回指定查询的个人信息详情更改
     */
    @Override
    public List<EPersonEditCustom> findEPersonEditCustom(PersonInfoSearchVO personInfoSearchVO) {
        return ePersonMapperCustom.selectEPersonEditCustom(personInfoSearchVO);
    }

    /**
     * 更新审核状态
     *
     * @param auditObjectVo 审核对象
     */
    @Override
    public void updatePersonalInfoAuditStatus(AuditObjectVo auditObjectVo) {
        try {
            //实例化主体并从主体获取信息
            Subject subject = SecurityUtils.getSubject();
            ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
            //查询出选择的集合，然后遍历集合
            EPersonEditExample ePersonEditExample = new EPersonEditExample();
            EPersonEditExample.Criteria criteria = ePersonEditExample.createCriteria();
            criteria.andPersonEditIdIn(auditObjectVo.getAuditObjectId());
            List<EPersonEdit> ePersonEditList = ePersonEditMapper.selectByExample(ePersonEditExample);
            for (EPersonEdit ePersonEdit : ePersonEditList){
                //根据操作来设置审核状态值
                if ("agree".equals(auditObjectVo.getOperation())) {
                    ePersonEdit.setAuditStatusId(2);//通过
                    //查询出对应工号的e_person表数据
                    EPerson ePerson = ePersonMapper.selectByPrimaryKey(ePersonEdit.getWorkNum());
                    //将ePersonEdit对象中非空的数据更新到ePerson对象中
                    if (ePersonEdit.getWorkName()!=null){
                        ePerson.setWorkName(ePersonEdit.getWorkName());//姓名
                        //从sys_user表查询出对应工号的数据
                        System.out.println("++++++++++++++++++++++++++++++++++++++++++---------------------------------------------dd");
                        SysUser sysUser = sysUserMapper.selectByPrimaryKey(ePersonEdit.getWorkNum());
                        System.out.println("++++++++++++++++++++++++++++++++++++++++++---------------------------------------------dd"+sysUser.getUsername());
                        sysUser.setUsername(ePersonEdit.getWorkName());//修改姓名
                        sysUserMapper.updateByPrimaryKeySelective(sysUser);//提交到sys_user表
                    }
                    if (ePersonEdit.getCollegeId2()!=null){
                        ePerson.setCollegeId2(ePersonEdit.getCollegeId2());//科研所属学院
                    }
                    if (ePersonEdit.getTitleTypeId()!=null){
                        ePerson.setTitleTypeId(ePersonEdit.getTitleTypeId());//职称类型
                    }
                    if (ePersonEdit.getTitleLevelId()!=null){
                        ePerson.setTitleLevelId(ePersonEdit.getTitleLevelId());//职称等级
                    }
                    if (ePersonEdit.getPostTypeId()!=null){
                        ePerson.setPostTypeId(ePersonEdit.getPostTypeId());//绩效类型
                    }
                    if (ePersonEdit.getPostLevelId()!=null){
                        ePerson.setPostLevelId(ePersonEdit.getPostLevelId());//绩效等级
                    }
                    ePersonMapper.updateByPrimaryKeySelective(ePerson);//更新到e_person表
                } else if ("refuse".equals(auditObjectVo.getOperation())) {
                    ePersonEdit.setAuditStatusId(3);//不通过
                }
                ePersonEdit.setAuditPoinion(auditObjectVo.getAuditOpinion() == null ? "" : auditObjectVo.getAuditOpinion());//设置审核意见
                ePersonEdit.setAuditPersonId(activeUser.getWorkNameAndNum());//设置审核人姓名+工号
                ePersonEdit.setLastTime(new Date());//设置最后更新时间
                ePersonEditMapper.updateByPrimaryKeySelective(ePersonEdit);//更新表e_person_edit
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("审核失败");
        }
    }
}
