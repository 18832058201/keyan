package com.hebeu.keyan.controller;

import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.service.*;
import com.hebeu.keyan.utils.DateToString;
import com.hebeu.keyan.vo.IncludeListVO;
import com.hebeu.keyan.vo.PaperResultVO;
import com.hebeu.keyan.vo.PersonListVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 作者：冯嘉龙
 * 时间：2017-08-22  8:40
 * 描述：论文相关控制器
 */
@Controller
@RequestMapping("/result/paperResult/")
public class PaperResultController {
    private final BasicParameterService basicParameterService;
    private final PersonListService personListService;
    private final PaperResultService paperResultService;
    private final CommonService commonService;
    private final ManageMoneyService manageMoneyService;
    private final IncludeListService includeListService;

    @Autowired
    public PaperResultController(BasicParameterService basicParameterService, PersonListService personListService, PaperResultService paperResultService, CommonService commonService, ManageMoneyService manageMoneyService, IncludeListService includeListService) {
        this.basicParameterService = basicParameterService;
        this.personListService = personListService;
        this.paperResultService = paperResultService;
        this.commonService = commonService;
        this.manageMoneyService = manageMoneyService;
        this.includeListService = includeListService;
    }

    /**
     * 查看个人 论文 列表
     *
     * @return 返回 论文 列表页面
     */
    @RequestMapping("toPaperResultList.action")
    public String toPaperResultList(Model model) {
        //创建主体并从主体中获取身份信息
        Subject subject = SecurityUtils.getSubject();
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        model.addAttribute("paperResultList", paperResultService.findPaperResultListByWorkNum(activeUser.getUserId()));
        model.addAttribute("ds", new DateToString());
        return "result/paperResult/personalPaperResultList";
    }

    /**
     * 新增 论文 表单
     *
     * @return 跳转到新增 论文 表单
     */
    @RequestMapping("toAddPaperResult.action")
    public String toAddPaperResult(Model model) {
        //创建主体并从主体中获取身份信息
        Subject subject = SecurityUtils.getSubject();
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        /*start：基础表参数设置，其中部分参数不需要在此设置，需要通过ajax异步请求方式来设置*/
        model.addAttribute("subjectTypeList", basicParameterService.findSubjectType());//学科门类
        model.addAttribute("signList", basicParameterService.findPubSign());//署名情况
        model.addAttribute("publishTypeList", basicParameterService.findPaperPublishType());//刊物类型
        model.addAttribute("publishRangeList", basicParameterService.findPaperPublishRange());//发表范围
        model.addAttribute("publishLevelList", basicParameterService.findPaperPublishLevel());//刊物等级
        model.addAttribute("allPersonList", manageMoneyService.findAllPeople());//所有在职人员列表，格式为姓名（工号）
        /*end：基础表参数设置*/
        //查询登录人的参与的所有项目（科研处审核通过的）
        model.addAttribute("allProjectList", commonService.findAllProjectByWorkNum(activeUser.getUserId()));
        model.addAttribute("includeToolList", includeListService.findAllEIncludeTool());//收录工具
        model.addAttribute("collegeList", personListService.findECollege());   //学院
        return "result/paperResult/personalPaperResultAdd";
    }

    /**
     * 通过ajax异步请求改变学科门类时更改与其关联的项
     *
     * @param subjectTypeId 学科门类编号
     * @return 返回存放与学科门类相关联的map集合
     */
    @RequestMapping("subjectTypeChange.action")
    @ResponseBody
    public Map<String, List> subjectTypeChange(Integer subjectTypeId) {
        Map<String, List> map = new HashMap<>();
        map.put("subjectFirstList", basicParameterService.findPerSubjectFirst(subjectTypeId));//所属学科
        map.put("researchTypeList", basicParameterService.findPubResearchType(subjectTypeId));//研究类型
        return map;
    }

    /**
     * 新增：论文成果保存、提交
     *
     * @param paperResultVO 论文成果 传值对象
     * @param personListVO  人员列表对象
     * @return 保存成功就重定向到 论文成果 列表，失败就返回 论文成果新增表单
     */
    @RequestMapping("insertPaperResult.action")
    public String insertPaperResult(PaperResultVO paperResultVO, PersonListVO personListVO, IncludeListVO includeListVO, RedirectAttributesModelMap model) {
            //将includeListVO对象转换为集合之后设置到paperResultVO对象中
            paperResultVO.setIncludeListVO(includeListService.getIncludeList(includeListVO));
        //将PersonListVO对象设置到paperResultVO对象中
        paperResultVO.setPersonListVO(personListVO);
        //将personListVO转成集合后设置到paperResultVO对象中
        paperResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        try {
            //调用处理业务插入论文成果信息到数据库中
            paperResultService.insertPaperResult(paperResultVO);
        } catch (Exception e) {
            e.printStackTrace();
            if ("插入数据失败".equals(e.getMessage())) {
                return "redirect:/result/paperResult/toAddPaperResult.action";
            } else if ("输入的名称已存在，请重新输入".equals(e.getMessage())) {
                model.addFlashAttribute("exceptionMessage", "输入的名称已存在，请重新输入！");
                return "redirect:/result/paperResult/toAddPaperResult.action";
            }
        }
        return "redirect:/result/paperResult/toPaperResultList.action";
    }

    /**
     * 查看指定论文编号的论文成果详情
     *
     * @param paperId 论文成果id
     * @return 返回到 论文成果 详情页面
     */
    @RequestMapping("toPaperResultInfo.action")
    public String toPaperResultInfo(Model model, String paperId) {
        model.addAttribute("paperResultInfo", paperResultService.findPaperResultByPaperId(paperId));//论文成果详细信息
        model.addAttribute("personList", paperResultService.findPersonListByPaperId(paperId));//论文成果对应的人员列表
        model.addAttribute("includeList", paperResultService.findIncludeListByPaperId(paperId));//收录集合
        model.addAttribute("ds", new DateToString());//时间格式化对象
        return "result/paperResult/personalPaperResultInfo";
    }

    /**
     * 编辑 论文成果 表单
     *
     * @param paperId 论文成果编号
     * @return 跳转到编辑 论文成果 表单
     */
    @RequestMapping("toEditPaperResult.action")
    public String toEditPaperResult(Model model, String paperId, String editType) {
        /*start：基础表参数设置，其中部分参数不需要在此设置，需要通过ajax异步请求方式来设置*/
        model.addAttribute("paperResult", paperResultService.findPaperResultByPaperId(paperId));//查询指定id的论文成果
        model.addAttribute("subjectTypeList", basicParameterService.findSubjectType());//学科门类下拉框
        model.addAttribute("subjectTypeList", basicParameterService.findSubjectType());//学科门类
        model.addAttribute("signList", basicParameterService.findPubSign());//署名情况
        model.addAttribute("publishTypeList", basicParameterService.findPaperPublishType());//刊物类型
        model.addAttribute("publishRangeList", basicParameterService.findPaperPublishRange());//发表范围
        model.addAttribute("publishLevelList", basicParameterService.findPaperPublishLevel());//刊物等级
        Integer subjectTypeId = paperResultService.findPaperResultByPaperId(paperId).getSubjectTypeId();//获取该论文成果的学科门类编号
        //以下为获取未改变学科门类时，各个下拉框的内容
        model.addAttribute("subjectFirstList", basicParameterService.findPerSubjectFirst(subjectTypeId));//所属学科
        model.addAttribute("researchTypeList", basicParameterService.findPubResearchType(subjectTypeId));//研究类型
        /*end：基础表参数设置*/
        model.addAttribute("allPersonList", manageMoneyService.findAllPeople());//所有在职人员列表，格式为姓名（工号）
        model.addAttribute("personList", paperResultService.findPersonListByPaperId(paperId));//该论文成果的人员列表
        model.addAttribute("includeList", paperResultService.findIncludeListByPaperId(paperId));//收录集合
        model.addAttribute("includeToolList", includeListService.findAllEIncludeTool());//收录工具
        model.addAttribute("ds", new DateToString());//时间格式化对象
        model.addAttribute("collegeList", personListService.findECollege());//学院
        //判断编辑类型，如果为审核人编辑就进入到审核人编辑页面
        if ("audit".equals(editType)) {
            return "result/paperResult/auditPaperResultEdit";
        }
        return "result/paperResult/personalPaperResultEdit";
    }

    /**
     * 编辑：论文成果保存、提交
     *
     * @param paperResultVO 论文成果 传值对象
     * @param personListVO  人员列表对象
     * @return 保存成功就重定向到 论文成果 列表，失败就返回 论文成果新增表单
     */
    @RequestMapping("updatePaperResult.action")
    public String updatePaperResult(PaperResultVO paperResultVO, PersonListVO personListVO, IncludeListVO includeListVO, RedirectAttributesModelMap model) {
        //将includeListVO对象转换为集合之后设置到paperResultVO对象中
        paperResultVO.setIncludeListVO(includeListService.getIncludeList(includeListVO));
        //将PersonListVO对象设置到identifyResultVO对象中
        paperResultVO.setPersonListVO(personListVO);
        //将personListVO转成集合后设置到identifyResultVO对象中
        paperResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        try {
            paperResultService.updatePaperResult(paperResultVO);//调用处理业务更新论文成果信息到数据库中
        } catch (Exception e) {
            e.printStackTrace();
            if ("编辑数据失败".equals(e.getMessage())) {
                return "redirect:/result/paperResult/toEditPaperResult.action?paperId=" + paperResultVO.getPaperId() + "";
            } else if ("输入的名称已存在，请重新输入".equals(e.getMessage())) {
                model.addFlashAttribute("exceptionMessage", "输入的名称已存在，请重新输入！");
                return "redirect:/result/paperResult/toEditPaperResult.action?paperId=" + paperResultVO.getPaperId() + "";
            }
        }
        return "redirect:/result/paperResult/toPaperResultInfo.action?paperId=" + paperResultVO.getPaperId() + "";
    }

    /**
     * 通过ajax来判断输入的validateName是否存在
     *
     * @param validateName 输入的 论文 名称
     * @param paperId      论文成果编号
     * @return 返回true表示已存在，返回false表示不存在
     */
    @RequestMapping("paperNameIsExisted.action")
    @ResponseBody  //表示这是ajax响应体
    public boolean paperNameIsExisted(String validateName, String paperId) {
        PaperResultVO paperResultVO = new PaperResultVO();
        paperResultVO.setPaperName(validateName);
        if (paperId != null) {
            paperResultVO.setPaperId(paperId);
        }
        return paperResultService.paperNameIsExisted(paperResultVO);
    }

    /**
     * 删除指定id的论文成果
     *
     * @param paperId 论文成果id
     * @return 返回论文成果列表
     */
    @RequestMapping("deletePaperResult.action")
    public String deletePaperResult(String paperId) {
        try {
            paperResultService.deletePaperResultByPaperId(paperId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/result/paperResult/toPaperResultList.action";
    }

    /*------------------Start:论文收录相关处理------------------*/
    /**
     * 查看指定论文编号的收录集合
     * @param paperId 论文成果id
     * @return 返回到 收录集合 页面
     */
    @RequestMapping("toPaperInclude.action")
    public String toPaperInclude(Model model, String paperId) {
        model.addAttribute("paperInfo",paperResultService.findPaperResultByPaperId(paperId));//论文信息
        model.addAttribute("includeList", paperResultService.findIncludeListByPaperId(paperId));//收录集合
        model.addAttribute("includeToolList", includeListService.findAllEIncludeTool());//收录工具
        model.addAttribute("ds", new DateToString());//时间格式化对象
        return "result/paperResult/personalIncludeEdit";
    }

    /**
     * 论文收录单独提交
     * @param paperResultVO 论文成果 传值对象
     * @return 指定论文编号的收录集合
     */
    @RequestMapping("updateInclude.action")
    public String updateInclude(PaperResultVO paperResultVO, IncludeListVO includeListVO) {
        if (includeListVO.getIncludeNumber()!=null){
            //将includeListVO对象转换为集合之后设置到paperResultVO对象中
            paperResultVO.setIncludeListVO(includeListService.getIncludeList(includeListVO));
        }
        try {
            paperResultService.updateInclude(paperResultVO);//调用处理业务更新论文成果信息到数据库中
        } catch (Exception e) {
            e.printStackTrace();
            if ("编辑数据失败".equals(e.getMessage())) {
                return "redirect:/result/paperResult/toPaperInclude.action?paperId=" + paperResultVO.getPaperId() + "";
            }
        }
        return "redirect:/result/paperResult/toPaperInclude.action?paperId=" + paperResultVO.getPaperId() + "";
    }
    /*------------------ End:论文收录相关处理 ------------------*/
}
