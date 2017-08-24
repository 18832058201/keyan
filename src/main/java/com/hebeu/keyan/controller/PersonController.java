package com.hebeu.keyan.controller;

import com.hebeu.keyan.po.*;
import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.po.customPO.EPersonCustom;
import com.hebeu.keyan.service.BasicParameterService;
import com.hebeu.keyan.service.EPersonService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.utils.DateToString;
import com.hebeu.keyan.vo.AuditObjectVo;
import com.hebeu.keyan.vo.PersonInfoSearchVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017-08-18  15:53
 * 描述：人员信息 相关控制器
 */
@Controller
@RequestMapping("/personal/")
public class PersonController {
    private final EPersonService ePersonService;
    private final BasicParameterService basicParameterService;
    private final PersonListService personListService;
    @Autowired
    public PersonController(EPersonService ePersonService,BasicParameterService basicParameterService,PersonListService personListService){
        this.ePersonService = ePersonService;
        this.basicParameterService = basicParameterService;
        this.personListService = personListService;
    }

    /**
     * 查看登录人的人员信息详情
     * @return 返回到 人员信息 详情页面
     */
    @RequestMapping("toPersonInfo.action")
    public String toPersonInfo(Model model) {
        //创建主体并从主体中获取身份信息
        Subject subject = SecurityUtils.getSubject();
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        model.addAttribute("personInfo", ePersonService.findPersonInfoByWorkNum(activeUser.getUserId()));
        //查询该工号是否存在待审核的信息编辑内容
        model.addAttribute("ePersonEdit", ePersonService.findEPersonEditByWorkNum(activeUser.getUserId()));
        model.addAttribute("ds", new DateToString());           //时间格式化对象
        return "personal/personalInfo";
    }

    /**
     * 编辑 个人信息 表单
     * @return 跳转到编辑 个人信息 表单
     */
    @RequestMapping("toEditPersonalInfo.action")
    public String toEditPersonalInfo(Model model) {
        //创建主体并从主体中获取身份信息
        Subject subject = SecurityUtils.getSubject();
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();

        /*start：基础表参数设置，其中部分参数不需要在此设置，需要通过ajax异步请求方式来设置*/
        model.addAttribute("personInfo", ePersonService.findPersonInfoByWorkNum(activeUser.getUserId()));//指定工号的个人信息详情
        model.addAttribute("subjectTypeList", basicParameterService.findSubjectType());//学科门类下拉框
        model.addAttribute("titleTypeList",basicParameterService.findPerTitleType());//职称类别
        model.addAttribute("educationList",basicParameterService.findPerEducation());//学历
        model.addAttribute("degreeList",basicParameterService.findPerDegree());//学位
        model.addAttribute("college2List",personListService.findECollege());//属于教学单位的学院
        model.addAttribute("dutyList",basicParameterService.findPerDuty());//职务
        model.addAttribute("postTypeList",basicParameterService.findPerPostType());//绩效类型
        model.addAttribute("countryList",basicParameterService.findPerCountry());//国家
        model.addAttribute("nationList",basicParameterService.findPerNation());//民族
        model.addAttribute("tutorTypeList",basicParameterService.findPerTutorType());//导师类型
        model.addAttribute("foreignLanguageList",basicParameterService.findPerForeignLanguage());//外语
        model.addAttribute("languageLevelList",basicParameterService.findPerLanguageLevel());//外语水平
        //以下内容为存在级联关系的下拉列表的内容
        EPersonCustom ePersonCustom = ePersonService.findPersonInfoByWorkNum(activeUser.getUserId());//登录人信息对象

        model.addAttribute("titleLevelList",basicParameterService.findPerTitleLevel(ePersonCustom.getTitleTypeId()));//指定职称类别id的职称等级
        model.addAttribute("subjectFirstList", basicParameterService.findPerSubjectFirst(ePersonCustom.getSubjectTypeId()));//指定学科门类的一级学科
        model.addAttribute("subjectSecondList", basicParameterService.findPerSubjectSecond(ePersonCustom.getSubjectFirstId()));//指定一级学科ID的二级学科
        model.addAttribute("subjectThirdList", basicParameterService.findPerSubjectThird(ePersonCustom.getSubjectSecondId()));//指定二级学科ID的三级学科
        model.addAttribute("departmentList",personListService.findEDepartmentByCollegeId(ePersonCustom.getCollegeId2()));//指定学院的教研室
        model.addAttribute("postLevelList",basicParameterService.findPerPostLevel(ePersonCustom.getPostTypeId()));//指定绩效类型id的绩效等级
        /*end：基础表参数设置*/
        model.addAttribute("ds", new DateToString());    //时间格式化对象
        return "personal/personalInfoEdit";
    }

    /**
     * 通过ajax异步请求改变学科门类时改变一级学科
     * @param subjectTypeId 学科门类的编号
     * @return 返回对应的 一级学科 集合
     */
    @RequestMapping("subjectTypeChange.action")
    @ResponseBody
    public List<PerSubjectFirst> subjectTypeChange(Integer subjectTypeId) {
        return basicParameterService.findPerSubjectFirst(subjectTypeId);
    }

    /**
     * 通过ajax异步请求改变 一级学科 时改变 二级学科
     * @param subjectFirstId 一级学科 的编号
     * @return 返回对应的 二级学科 集合
     */
    @RequestMapping("subjectFirstChange.action")
    @ResponseBody
    public List<PerSubjectSecond> subjectFirstChange(Integer subjectFirstId) {
        return basicParameterService.findPerSubjectSecond(subjectFirstId);
    }

    /**
     * 通过ajax异步请求改变 二级学科 时改变 三级学科
     * @param subjectSecondId 二级学科 的编号
     * @return 返回对应的 三级学科 集合
     */
    @RequestMapping("subjectSecondChange.action")
    @ResponseBody
    public List<PerSubjectThird> subjectSecondChange(Integer subjectSecondId) {
        return basicParameterService.findPerSubjectThird(subjectSecondId);
    }

    /**
     * 通过ajax异步请求改变 职称类型 时改变 职称等级
     * @param titleTypeId 职称类型 的编号
     * @return 返回对应的 职称等级 集合
     */
    @RequestMapping("titleTypeChange.action")
    @ResponseBody
    public List<PerTitleLevel> titleTypeChange(Integer titleTypeId) {
        return basicParameterService.findPerTitleLevel(titleTypeId);
    }
    /**
     * 通过ajax异步请求改变 科研所属单位 时改变 所属教研室
     * @param collegeId2 科研所属单位 的编号
     * @return 返回对应的 所属教研室 集合
     */
    @RequestMapping("college2Change.action")
    @ResponseBody
    public List<EDepartment> college2Change(Integer collegeId2) {
        return personListService.findEDepartmentByCollegeId(collegeId2);
    }

    /**
     * 通过ajax异步请求改变 绩效类型 时改变 绩效等级
     * @param postTypeId 绩效类型 的编号
     * @return 返回对应的 绩效等级 集合
     */
    @RequestMapping("postTypeChange.action")
    @ResponseBody
    public List<PerPostLevel> postTypeChange(Integer postTypeId) {
        return basicParameterService.findPerPostLevel(postTypeId);
    }

    /**
     * 编辑：人员信息保存
     * @param ePersonCustom 人员信息传值对象
     * @return 保存成功就重定向到 人员信息详情 ，失败就返回 人员信息编辑
     */
    @RequestMapping("updatePersonInfo.action")
    public String updatePersonInfo(EPersonCustom ePersonCustom,String submitType) {
        try {
            ePersonService.updatePersonInfo(ePersonCustom);
            //第一次登录提交编辑
            if("firstLogin".equals(submitType)){
                return "redirect:/index.action";
            }
        } catch (Exception e) {
            e.printStackTrace();
            if ("编辑数据失败".equals(e.getMessage())) {
                return "redirect:/personal/toEditPersonalInfo.action";
            }
        }
        return "redirect:/personal/toPersonInfo.action";
    }

    /*--------------------审核内容---------------------*/
    /**
     * audit--------------根据“姓名（工号）”查询可审核的科研管理费申请列表
     * @param auditType 状态
     * @return 返回指定“姓名（工号）”的可审核的科研管理费申请列表
     */
    @RequestMapping("toAuditPersonalInfoList.action")
    public String toAuditPersonalInfoList(Integer auditType,Model model) {
        //创建主体并从主体中获取身份信息
        Subject subject = SecurityUtils.getSubject();
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        PersonInfoSearchVO personInfoSearchVO = new PersonInfoSearchVO();
        personInfoSearchVO.setAuditType(auditType);
        personInfoSearchVO.setCollegeId2(activeUser.getUserInfo().getCollegeId2());
        //创建查询条件对象并设置查询条件
        model.addAttribute("ePersonEditList",ePersonService.findEPersonEditCustom(personInfoSearchVO));
        model.addAttribute("auditType",auditType);
        model.addAttribute("ds", new DateToString());
        return "personal/auditPersonalInfoList";
    }

    /**
     * 提交审核
     * @param auditObjectVo 审核对象
     * @return 重定向到审核列表
     */
    @RequestMapping("submitAuditPersonalInfo.action")
    public String submitAuditPersonalInfo(AuditObjectVo auditObjectVo){
        ePersonService.updatePersonalInfoAuditStatus(auditObjectVo);//调用审核业务更新审核状态
        return "redirect:/personal/toAuditPersonalInfoList.action?auditType=1";
    }

    /**
     * 个人信息修改审核详情
     * @param
     */
    @RequestMapping("toAuditPersonalInfo.action")
    public String toAuditPersonalInfo(Model model, String personEditId) {
        //创建主体并从主体中获取身份信息
        Subject subject = SecurityUtils.getSubject();
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        model.addAttribute("personInfo",ePersonService.findPersonInfoByWorkNum(activeUser.getUserId()));
        model.addAttribute("ePersonEdit",ePersonService.findEPersonEditByPersonEditId(personEditId));
        model.addAttribute("ds", new DateToString());//时间格式化对象
        return "personal/auditPersonalInfo";
    }
}
