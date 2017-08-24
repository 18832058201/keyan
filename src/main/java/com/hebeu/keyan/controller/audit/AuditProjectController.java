package com.hebeu.keyan.controller.audit;

import com.hebeu.keyan.po.BudgetMoney;
import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.service.AuditService;
import com.hebeu.keyan.service.LengthWaysProjectService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.utils.DateToString;
import com.hebeu.keyan.vo.AuditObjectVo;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.ProjectVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者：陈德华
 * 时间：2017/8/11 11:03
 * 描述：项目和成果审核控制器
 * 审核流程都有四个操作：
 * 1.查看审核的项目或成果列表
 * 2.提交审核请求
 * 3.查看待审核的项目或成果的详情
 * 4.编辑待审核的项目或成果
 */
@Controller
@RequestMapping("/audit/")
public class AuditProjectController {
    private final AuditService auditService;
    private final LengthWaysProjectService lengthWaysProjectService;
    private final PersonListService personListService;

    @Autowired
    public AuditProjectController(AuditService auditService, LengthWaysProjectService lengthWaysProjectService, PersonListService personListService) {
        this.auditService = auditService;
        this.lengthWaysProjectService = lengthWaysProjectService;
        this.personListService = personListService;
    }


    /*start: 纵向项目审核控制*/
    /**
     * 纵向项目审核
     * @return 返回项目列表页面
     */
    @RequestMapping("toLengthWaysProjectListAudit.action")
    public String toLengthWaysProjectListAudit(AuditObjectVo auditObjectVo, Model model){
        //主体
        Subject subject = SecurityUtils.getSubject();
        //从主体中取出身份信息
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        //如果是学院管理员就加入学院id条件
        if(subject.hasRole("collegeAdmin")){
            auditObjectVo.setCollegeId(activeUser.getUserInfo().getCollegeId2());
        }
        //调用审核项目业务查询对应学院对应审核状态的项目集合
        model.addAttribute("projectList",auditService.findLengthWaysProjectList(auditObjectVo));

        model.addAttribute("auditType",auditObjectVo.getAuditType()); //设置审核状态
        model.addAttribute("ds",new DateToString());
        return "project/auditLengthWaysProjectList";
    }

    /**
     * 提交审核
     * @param auditObjectVo 审核对象
     * @return 重定向到纵向项目列表
     */
    @RequestMapping("submitLengthWaysProjectAudit.action")
    public String submitLengthWaysProjectAudit(AuditObjectVo auditObjectVo){
        System.out.println(auditObjectVo.toString());
        auditService.updateProjectAuditStatus(auditObjectVo);  //调用审核业务更新审核状态
        return "redirect:/audit/toLengthWaysProjectListAudit.action?auditType=1";
    }

    /**
     * 查看项目详情
     * @param projectId  项目id
     * @param auditType 审核状态
     * @return 返回到纵向项目详情页
     */
    @RequestMapping("viewLengthWaysProjectInfo.action")
    public String viewLengthWaysProjectInfo(String projectId,Integer auditType,Model model){
        model.addAttribute("projectInfo",lengthWaysProjectService.findProjectById(projectId));  //项目详细信息
        model.addAttribute("personList",lengthWaysProjectService.findPersonListByProjectId(projectId));//项目对应的人员列表
        model.addAttribute("budgetMoney",lengthWaysProjectService.findBudgetMoneyByProjectId(projectId));//项目对应的经费预算信息
        model.addAttribute("ds",new DateToString());    //时间格式化对象
        model.addAttribute("auditType",auditType);      //审核状态
        return "project/auditLengthWaysProjectInfo";
    }

    /**
     * 审核时编辑项目
     * @param projectVO 项目值对象
     * @param personListVO 人员列表
     * @param budgetMoney 预算经费
     * @param auditObjectVo 审核信息
     * @return 重定向到待审核列表页面
     */
    @RequestMapping("updateLengthWaysProjectAtAudit.action")
    public String updateLengthWaysProjectAtAudit(ProjectVO projectVO, PersonListVO personListVO, BudgetMoney budgetMoney, AuditObjectVo auditObjectVo){
        //将PersonListVO对象设置到projectVO对象中
        projectVO.setPersonListVO(personListVO);
        //将经费信息设置到projectVO对象中
        projectVO.setBudgetMoney(budgetMoney);
        //将personListVO转成集合后设置到projectVO对象中
        projectVO.setPersonListVOList(personListService.getPersonList(personListVO));
        auditService.updateProject(projectVO,auditObjectVo);      //更新项目
        return "redirect:/audit/toLengthWaysProjectListAudit.action?auditType=1";
    }
    /*end: 纵向项目审核控制*/







}
