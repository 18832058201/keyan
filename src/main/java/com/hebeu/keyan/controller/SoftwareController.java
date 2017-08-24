package com.hebeu.keyan.controller;

import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.service.BasicParameterService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.service.SoftwareResultService;
import com.hebeu.keyan.utils.DateToString;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.SoftwareResultVO;
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
 * 作者：张程
 * 时间：2017/8/15  14:43
 * 描述：软件成功控制器
 */
@Controller
@RequestMapping("/result/softwareResult/")
public class SoftwareController {
    private SoftwareResultService softwareResultService;
    private BasicParameterService basicParameterService;
    private PersonListService personListService;
    @Autowired
    public SoftwareController(SoftwareResultService softwareResultService,BasicParameterService basicParameterService,PersonListService personListService){
        this.softwareResultService = softwareResultService;
        this.basicParameterService = basicParameterService;
        this.personListService = personListService;
    }

    @RequestMapping("softwareResultList.action")
    public String softwareResultList(Model model, HttpSession session){
        ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
        model.addAttribute("ds", new DateToString());
        model.addAttribute("softwareResultList",softwareResultService.findSoftwareResultListByWorkNum(activeUser.getUserId()));
        return "result/softwareResult/personalSoftwareResultList";
    }

    @RequestMapping("toAddSoftwareResult.action")
    public String toAddSoftwareResult(Model model){
        model.addAttribute("subjectTypeList",basicParameterService.findSubjectType());
        model.addAttribute("collegeList",personListService.findECollege());
        return "result/softwareResult/personalSoftwareResultAdd";
    }

    @RequestMapping("insertSoftwareResult.action")
    public String insertSoftwareResult(PersonListVO personListVO, SoftwareResultVO softwareResultVO, RedirectAttributesModelMap modelMap){
        softwareResultVO.setPersonListVO(personListVO);
        softwareResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        try {
            softwareResultService.insertSoftwareResult(softwareResultVO);
        }catch (Exception e){
            System.out.println("出现异常");
            e.printStackTrace();
            if("该软件成果名称已存在".equals(e.getMessage())){
                modelMap.addFlashAttribute("exceptionMessage","该软件成果名称已存在");
                return "redirect:/result/softwareResult/toAddSoftwareResult.action";
            }else{
                modelMap.addFlashAttribute("exceptionMessage","插入数据失败");
                return "redirect:/result/softwareResult/toAddSoftwareResult.action";
            }
        }
        return "redirect:/result/softwareResult/softwareResultList.action";
    }

    @RequestMapping("deleteSoftwareResult.action")
    public String deleteSoftwareResult(String softwareId){
        try {
            softwareResultService.deleteSoftwareResult(softwareId);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/result/softwareResult/softwareResultList.action";
    }
    @RequestMapping("personalSoftwareResultInfo.action")
    public String personalSoftwareResultInfo(Model model,String softwareId){
        model.addAttribute("softwareResultInfo",softwareResultService.findSoftwareResult(softwareId));
        model.addAttribute("personList", softwareResultService.findPersonListBySoftwareId(softwareId));//著作成果对应的人员列表
        model.addAttribute("ds", new DateToString());
        return "/result/softwareResult/personalSoftwareResultInfo";
    }
    @RequestMapping("toEditSoftwareResult.action")
    public String toEditSoftwareResult(Model model,String softwareId,String editType){
        model.addAttribute("softwareResultVO",softwareResultService.findSoftwareResult(softwareId));
        Integer subjectTypeId = softwareResultService.findSoftwareResult(softwareId).getSubjectTypeId();
        model.addAttribute("subjectFirstList",basicParameterService.findPerSubjectFirst(subjectTypeId));
        model.addAttribute("subjectTypeList", basicParameterService.findSubjectType());
        /*end：基础表参数设置*/
        model.addAttribute("personList",softwareResultService.findPersonListBySoftwareId(softwareId));
        model.addAttribute("ds", new DateToString());
        model.addAttribute("collegeList", personListService.findECollege());
        //审核时编辑
        if("audit".equals(editType)){
            return "result/softwareResult/auditSoftwareResultEdit";
        }
        return "/result/softwareResult/personalSoftwareResultEdit";
    }
    @RequestMapping("updateSoftwareResult.action")
    public String updateSoftwareResult(SoftwareResultVO softwareResultVO,PersonListVO personListVO,RedirectAttributesModelMap modelMap){
        System.out.println("进入Controller，softwareId="+softwareResultVO.getSoftwareId());
        System.out.println("进入控制器，软件名称="+softwareResultVO.getSoftwareName());
        softwareResultVO.setPersonListVO(personListVO);
        softwareResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        try {
            softwareResultService.updateSoftwareResult(softwareResultVO);
        } catch (Exception e) {
            e.printStackTrace();
            if ("编辑数据失败".equals(e.getMessage())) {
                modelMap.addFlashAttribute("exceptionMessage","编辑数据失败");
                return "redirect:/result/softwareResult/toEditSoftwareResult.action?softwareId=" + softwareResultVO.getSoftwareId() + "";
            }else if ("该软件成果名称已存在".equals(e.getMessage())) {
                modelMap.addFlashAttribute("exceptionMessage","输入的名称已存在，请重新输入！");
                return "redirect:/result/softwareResult/toEditSoftwareResult.action?softwareId=" + softwareResultVO.getSoftwareId() + "";
            }
        }
        System.out.println("无异常："+softwareResultVO.getSoftwareId());
        return "redirect:/result/softwareResult/personalSoftwareResultInfo.action?softwareId=" + softwareResultVO.getSoftwareId() + "";

    }
    @RequestMapping("subjectTypeChange.action")
    @ResponseBody
    public Map<String, List> subjectTypeChange(Integer subjectTypeId) {
        System.out.println("subjectTypeChange成功");
        Map<String, List> map = new HashMap<>();
        map.put("subjectFirstList", basicParameterService.findPerSubjectFirst(subjectTypeId));        //所属学科
        //map.put("bookTypeList", basicParameterService.findBookType(subjectTypeId));        //著作类型
        return map;
    }

    @ResponseBody
    @RequestMapping("softwareNameIsExisted.action")
    public boolean softwareNameIsExisted(String validateName,String softwareId){
        SoftwareResultVO softwareResultVO = new SoftwareResultVO();
        softwareResultVO.setSoftwareName(validateName);
        if(softwareId!=null){
            softwareResultVO.setSoftwareId(softwareId);
        }
        return softwareResultService.softwareNameIsExisted(softwareResultVO);
    }
}
