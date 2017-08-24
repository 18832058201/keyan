package com.hebeu.keyan.controller;

import com.hebeu.keyan.po.BudgetMoney;
import com.hebeu.keyan.po.ProEconomicsIndustry2;
import com.hebeu.keyan.po.ProEconomicsIndustry3;
import com.hebeu.keyan.po.ProProjectType2;
import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.po.customPO.EProjectCustom;
import com.hebeu.keyan.service.BasicParameterService;
import com.hebeu.keyan.service.LengthWaysProjectService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.utils.DateToString;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.ProjectVO;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作者：陈德华
 * 时间：2017/7/31 15:48
 * 描述：纵向项目相关控制器
 */
@Controller
@RequestMapping("/project/")
public class LengthwaysProjectController {
    private final BasicParameterService basicParameterService;
    private final PersonListService personListService;
    private final LengthWaysProjectService lengthWaysProjectService;

    @Autowired
    public LengthwaysProjectController(BasicParameterService basicParameterService, PersonListService personListService, LengthWaysProjectService lengthWaysProjectService) {
        this.basicParameterService = basicParameterService;
        this.personListService = personListService;
        this.lengthWaysProjectService = lengthWaysProjectService;
    }

    /**
     * 查看个人纵向项目列表
     * @return 返回纵向项目列表页面
     */
    @RequestMapping("lengthwaysProjectList.action")
    public String lengthwaysProjectList(HttpSession session,Model model){
        //从session中取到用户信息
        ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
//        System.out.println("当前登录用户为"+activeUser.getUserId());
        model.addAttribute("ds",new DateToString());
        model.addAttribute("projectList",lengthWaysProjectService.findProjectListByWorkNum(activeUser.getUserId()));//将查询到的项目集合放到model中
        return "project/personalLengthwaysProjectList";
    }


    /**
     * 查看指定项目详情
     * @param projectId 项目id
     * @return 返回到项目详情页面
     */
    @RequestMapping("viewLengthWaysProjectInfo.action")
    public String viewLengthWaysProjectInfo(Model model,String projectId){
        model.addAttribute("projectInfo",lengthWaysProjectService.findProjectById(projectId));  //项目详细信息
        model.addAttribute("personList",lengthWaysProjectService.findPersonListByProjectId(projectId));//项目对应的人员列表
        model.addAttribute("budgetMoney",lengthWaysProjectService.findBudgetMoneyByProjectId(projectId));//项目对应的经费预算信息
        model.addAttribute("ds",new DateToString());    //时间格式化对象
        return "project/personalLengthwaysProjectInfo";
    }

    /**
     * 新增项目表单
     * @return 跳转到新增项目表单
     */
    @RequestMapping("toAddLengthwaysProject.action")
    public String toAddProject(Model model){
        /*start：基础表参数设置，其中部分参数不需要在此设置，需要通过ajax异步请求方式来设置*/
        model.addAttribute("subjectTypeList",basicParameterService.findSubjectType());                 //学科门类
        model.addAttribute("organizationFormList",basicParameterService.findProOrganizationForm());    //组织形式
        model.addAttribute("economicsTargetList",basicParameterService.findProEconomicsTarget());      //社会经济目标
        model.addAttribute("cooperationTypeList",basicParameterService.findProCooperationType());      //独立/合作研究类型
        model.addAttribute("economicsIndustry1List",basicParameterService.findProEconomicsIndustry1());//经济行业一级
        model.addAttribute("proResultFormList", basicParameterService.findProResultForm());            //预期成果形式
        model.addAttribute("projectDomainList",basicParameterService.findProProjectDomain());          //项目所属领域
        model.addAttribute("projectGradeList",basicParameterService.findProProjectGrade());            //项目等级
        /*end：基础表参数设置*/

        model.addAttribute("ds",new DateToString());                                                   //时间格式化工具类
        model.addAttribute("collegeList",personListService.findECollege());                            //学院列表
        return "project/personalLengthwaysProjectAdd";
    }

    /**
     * 编辑项目表单
     * @param projectId 项目id
     * @param editType 编辑类型  个人编辑 or 审核编辑
     * @return 返回到编辑项目表单
     */
    @RequestMapping("toEditLengthWaysProject.action")
    public String toEditProject(String projectId,Model model,String editType){
        EProjectCustom projectInfo = lengthWaysProjectService.findProjectById(projectId);                //项目详细信息
        model.addAttribute("projectInfo",projectInfo);
        model.addAttribute("personList",lengthWaysProjectService.findPersonListByProjectId(projectId));//项目的人员列表
        model.addAttribute("budgetMoney",lengthWaysProjectService.findBudgetMoneyByProjectId(projectId));//项目相关的经费信息
        model.addAttribute("collegeList",personListService.findECollege());                            //学院列表

        /*start：基础表参数设置，其中部分参数不需要在此设置，需要通过ajax异步请求方式来设置*/
        model.addAttribute("subjectTypeList",basicParameterService.findSubjectType());                                                    //学科门类
        model.addAttribute("ProProjectSourceList",basicParameterService.findProProjectSource());                                          //项目来源
        model.addAttribute("subjectFirstList",basicParameterService.findPerSubjectFirst(projectInfo.getSubjectTypeId()));                 //所属学科
        model.addAttribute("projectType1List",basicParameterService.findProProjectType1(projectInfo.getSubjectTypeId()));                 //项目类型1
        model.addAttribute("projectType2List",basicParameterService.findProProjectType2(projectInfo.getProjectType1Id()));                //项目类型2
        model.addAttribute("researchTypeList",basicParameterService.findPubResearchType(projectInfo.getSubjectTypeId()));                 //研究类别
        model.addAttribute("organizationFormList",basicParameterService.findProOrganizationForm());                                       //组织形式
        model.addAttribute("economicsTargetList",basicParameterService.findProEconomicsTarget());                                         //社会经济目标
        model.addAttribute("cooperationTypeList",basicParameterService.findProCooperationType());                                         //独立/合作研究类型
        model.addAttribute("economicsIndustry1List",basicParameterService.findProEconomicsIndustry1());                                   //经济行业一级
        model.addAttribute("economicsIndustry2List",basicParameterService.findProEconomicsIndustry2(projectInfo.getEconomicsIndustry1Id()));//经济行业二级
        model.addAttribute("economicsIndustry3List",basicParameterService.findProEconomicsIndustry3(projectInfo.getEconomicsIndustry2Id()));//经济行业三级
        model.addAttribute("proResultFormList", basicParameterService.findProResultForm());                                               //预期成果形式
        model.addAttribute("projectDomainList",basicParameterService.findProProjectDomain());                                             //项目所属领域
        model.addAttribute("projectGradeList",basicParameterService.findProProjectGrade());                                               //项目等级
        /*end：基础表参数设置*/

        model.addAttribute("ds",new DateToString());             //时间转化工具

        //判断编辑类型，如果为审核人编辑就进入到审核人编辑项目页面
        if("audit".equals(editType)){
            return "project/auditLengthWaysProjectEdit";
        }
        //进入个人编辑页面
        return "project/personalLengthwaysProjectEdit";
    }


    /**
     * 通过ajax异步请求改变学科门类时更改与其关联的项
     * @param subjectTypeId 学科门类编号
     * @return  返回存放与学科门类相关联的map集合
     */
    @RequestMapping("subjectTypeChange.action")
    @ResponseBody
    public Map<String,List> subjectTypeChange(Integer subjectTypeId){
        Map<String,List> map = new HashMap<>();
        map.put("subjectFirstList",basicParameterService.findPerSubjectFirst(subjectTypeId));        //所属学科
        map.put("ProProjectSourceList",basicParameterService.findProProjectSource(subjectTypeId));   //项目来源
        map.put("projectType1List",basicParameterService.findProProjectType1(subjectTypeId));        //项目类型1
        map.put("researchTypeList",basicParameterService.findPubResearchType(subjectTypeId));        //研究类别
        return map;
    }

    /**
     * 通过ajax异步请求改变项目类型1更改时关联的项目类型2
     * @param projectType1Id  项目类型1的编号
     * @return  返回对应的项目类型2集合
     */
    @RequestMapping("proProjectType1Change.action")
    @ResponseBody
    public List<ProProjectType2> proProjectType1Change(Integer projectType1Id){
        return basicParameterService.findProProjectType2(projectType1Id);
    }

    /**
     * 通过ajax异步请求改变经济行业一级时关联经济行业二级
     * @param economicsIndustry1Id 经济行业一级编号
     * @return 返回对应的经济行业二级集合
     */
    @RequestMapping("proEconomicsIndustry1Change.action")
    @ResponseBody
    public List<ProEconomicsIndustry2> proEconomicsIndustry1Change(String economicsIndustry1Id){
        return basicParameterService.findProEconomicsIndustry2(economicsIndustry1Id);
    }

    /**
     * 通过ajax异步请求改变经济行业二级时关联经济行业三级
     * @param economicsIndustry2Id 经济行业二级编号
     * @return 返回对应的经济行业三级集合
     */
    @RequestMapping("proEconomicsIndustry2Change.action")
    @ResponseBody
    public List<ProEconomicsIndustry3> proEconomicsIndustry2Change(String economicsIndustry2Id){
        return basicParameterService.findProEconomicsIndustry3(economicsIndustry2Id);
    }


    /**
     * 项目保存
     * @param projectVO  项目值对象
     * @param personListVO 人员列表对象
     * @return 保存成功就重定向到项目列表，失败就返回项目表单
     */
    @RequestMapping("insertLengthwaysProject.action")
    public String insertProject(ProjectVO projectVO, PersonListVO personListVO, BudgetMoney budgetMoney, RedirectAttributesModelMap model){
        System.out.println("人员列表对象为："+personListVO);
        //将PersonListVO对象设置到projectVO对象中
        projectVO.setPersonListVO(personListVO);
        //将经费信息设置到projectVO对象中
        projectVO.setBudgetMoney(budgetMoney);
        //将personListVO转成集合后设置到projectVO对象中
        projectVO.setPersonListVOList(personListService.getPersonList(personListVO));
        //判断预算经费总额是否超出批准经费
        if(lengthWaysProjectService.isExcess(budgetMoney,projectVO)){
            model.addFlashAttribute("error","预算经费总额超出批准经费");
            model.addFlashAttribute("projectInfo",projectVO);    //将项目信息回显到页面
            model.addFlashAttribute("budgetMoney",budgetMoney);  //将经费信息回显到页面
            return "redirect:/project/toAddLengthwaysProject.action";
        }
        try {
            lengthWaysProjectService.insertProject(projectVO);  //调用纵向项目处理业务插入项目信息到数据库中
        } catch (Exception e) {
            e.printStackTrace();
            if("插入数据失败".equals(e.getMessage())){
                model.addFlashAttribute("error","插入数据失败");
                model.addFlashAttribute("projectInfo",projectVO);    //将项目信息回显到页面
                model.addFlashAttribute("budgetMoney",budgetMoney);  //将经费信息回显到页面
                return "redirect:/project/toAddLengthwaysProject.action";
            }else if("已存在同名项目".equals(e.getMessage())){
                model.addFlashAttribute("error","已存在该项目名称");
                model.addFlashAttribute("projectInfo",projectVO);    //将项目信息回显到页面
                model.addFlashAttribute("budgetMoney",budgetMoney);  //将经费信息回显到页面
                return "redirect:/project/toAddLengthwaysProject.action";
            }
        }
        return "redirect:/project/lengthwaysProjectList.action";
    }


    /**
     * 项目更新
     * @param projectVO  项目值对象
     * @param personListVO 人员列表对象
     * @return 保存成功就重定向到项目详情，失败就返回项目编辑表单
     */
    @RequestMapping("updateLengthwaysProject.action")
    public String updateProject(ProjectVO projectVO,PersonListVO personListVO, BudgetMoney budgetMoney,RedirectAttributesModelMap model){
        //将PersonListVO对象设置到projectVO对象中
        projectVO.setPersonListVO(personListVO);
        //将经费信息设置到projectVO对象中
        projectVO.setBudgetMoney(budgetMoney);
        //将personListVO转成集合后设置到projectVO对象中
        projectVO.setPersonListVOList(personListService.getPersonList(personListVO));
        //判断预算经费总额是否超出批准经费
        if(lengthWaysProjectService.isExcess(budgetMoney,projectVO)){
            model.addFlashAttribute("error","预算经费总额超出批准经费");
            return "redirect:/project/toEditLengthWaysProject.action?projectId="+projectVO.getProjectId()+"";
        }
        try {
            lengthWaysProjectService.updateProject(projectVO);  //调用纵向项目处理业务更新项目信息到数据库中
        } catch (Exception e) {
            e.printStackTrace();
            if("更新数据失败".equals(e.getMessage())){
                model.addFlashAttribute("error","更新数据失败");
                return "redirect:/project/toEditLengthWaysProject.action?projectId="+projectVO.getProjectId()+"";
            }else if("已存在同名项目".equals(e.getMessage())){
                model.addFlashAttribute("error","已存在该项目名称");
                return "redirect:/project/toEditLengthWaysProject.action?projectId="+projectVO.getProjectId()+"";
            }
        }
        return "redirect:/project/viewLengthWaysProjectInfo.action?projectId="+projectVO.getProjectId()+"";
    }


    /**
     * 新增时调用此方法
     * 通过ajax查询是否存在同名项目
     * @param validateName 需要查验的名字
     * @return 存在就返回true，不存在就返回false
     */
    @RequestMapping("addIsExistedLengthWaysProject.action")
    @ResponseBody
    public boolean isExistedProject(String validateName){
        System.out.println("新增查重");
        ProjectVO projectVO = new ProjectVO();
        projectVO.setProjectName(validateName);
        return lengthWaysProjectService.isExistedProject(projectVO);
    }


    /**
     * 编辑时调用此方法
     * 通过ajax查询是否存在同名项目
     * @param validateName 需要查验的名字
     * @return 存在就返回true，不存在就返回false
     */
    @RequestMapping("editIsExistedLengthWaysProject.action")
    @ResponseBody
    public boolean isExistedProject(String validateName,String projectId){
        System.out.println("编辑查重");
        ProjectVO projectVO = new ProjectVO();
        projectVO.setProjectName(validateName);
        projectVO.setProjectId(projectId);
        return lengthWaysProjectService.isExistedProject(projectVO);
    }


    /**
     * 删除指定项目
     * @param projectId 项目id
     * @return 返回项目列表
     */
    @RequestMapping("deleteLengthWaysProject.action")
    public String deleteProject(String projectId){
        try {
            lengthWaysProjectService.deleteProject(projectId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/project/lengthwaysProjectList.action";
    }

}
