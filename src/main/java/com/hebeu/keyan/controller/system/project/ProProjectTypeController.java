package com.hebeu.keyan.controller.system.project;

import com.hebeu.keyan.po.ProProjectType1;
import com.hebeu.keyan.po.ProProjectType2;
import com.hebeu.keyan.po.SubjectType;
import com.hebeu.keyan.service.BasicParameterService;
import com.hebeu.keyan.service.ProProjectTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 作者：张程
 * 时间：2017/8/3
 * 描述：项目类型控制器
 */
@Controller
@RequestMapping("/")
public class ProProjectTypeController {

    private ProProjectTypeService proProjectTypeService;
    private BasicParameterService basicParameterService;

    @Autowired
    public ProProjectTypeController(ProProjectTypeService proProjectTypeService,BasicParameterService basicParameterService){
        this.proProjectTypeService = proProjectTypeService;
        this.basicParameterService = basicParameterService;
    }

    @RequestMapping("toProProjectType.action")
    public String toProProjectType(Model model){
        List<ProProjectType1> type1List = proProjectTypeService.findProProjectType1List();
        List<ProProjectType2> type2List = proProjectTypeService.findProProjectType2List();
        List<SubjectType> subjectTypeList = basicParameterService.findSubjectType();
        Integer count = proProjectTypeService.findProProjectType2Count();
        model.addAttribute("type1List",type1List);
        model.addAttribute("type2List",type2List);
        model.addAttribute("SubjectTypeList",subjectTypeList);
        model.addAttribute("count",count);
        return "system/project/proProjectTypeList";
    }
    @RequestMapping("insertProProjectType.action")
    public String insertProProjectType(HttpServletRequest request, RedirectAttributesModelMap modelMap){
        String projectType1Name = request.getParameter("projectType1Name");
        String subjectTypeId = request.getParameter("subjectTypeId");
        ProProjectType1 proProjectType1 = new ProProjectType1();
        proProjectType1.setProjectType1Name(projectType1Name);
        proProjectType1.setSubjectTypeId(Integer.valueOf(subjectTypeId));
        proProjectType1.setIsEffective(1);
        if(!projectType1Name.equals("")){
            try {
                proProjectTypeService.insertProProjectType1(proProjectType1);
            }catch (Exception e){
                e.printStackTrace();
                modelMap.addFlashAttribute("exceptionMessage",e.getMessage());
                return "redirect:toProProjectType.action";
            }
        }
        String projectType1Id = request.getParameter("projectType1Id");
        String projectType2Name = request.getParameter("projectType2Name");
        String isEffective = request.getParameter("isEffective");
        ProProjectType2 proProjectType2 = new ProProjectType2();
        proProjectType2.setProjectType1Id(Integer.valueOf(projectType1Id));
        proProjectType2.setProjectType2Name(projectType2Name);
        proProjectType2.setIsEffective(Integer.valueOf(isEffective));
        if(!projectType2Name.equals("")){
            try{
                proProjectTypeService.insertProProjectType2(proProjectType2);
            }catch (Exception e){
                e.printStackTrace();
                modelMap.addFlashAttribute("exceptionMessage",e.getMessage());
                return "redirect:toProProjectType.action";
            }
        }
        return "redirect:toProProjectType.action";
    }
    @RequestMapping("updateProProjectType.action")
    public String updateProProjectType(HttpServletRequest request,RedirectAttributesModelMap modelMap){
        String projectType2Id = request.getParameter("projectType2Id");
        String projectType1Name = request.getParameter("projectType1Name");
        String projectType2Name = request.getParameter("projectType2Name");
        String projectType1Id = request.getParameter("projectType1Id");
        String subjectTypeId = request.getParameter("subjectTypeId");
        ProProjectType1 proProjectType1 = new ProProjectType1();
        ProProjectType2 proProjectType2 = new ProProjectType2();
        proProjectType1.setProjectType1Id(Integer.valueOf(projectType1Id));
        proProjectType1.setProjectType1Name(projectType1Name);
        proProjectType1.setSubjectTypeId(Integer.valueOf(subjectTypeId));
        proProjectType2.setProjectType2Id(Integer.valueOf(projectType2Id));
        proProjectType2.setProjectType2Name(projectType2Name);
        try {
            proProjectTypeService.updateProProjectType1(proProjectType1);
            proProjectTypeService.updateProProjectType2(proProjectType2);
        }catch (Exception e){
            e.printStackTrace();
            modelMap.addFlashAttribute("exceptionMessage",e.getMessage());
            return "redirect:toProProjectType.action";
        }
        return "redirect:toProProjectType.action";
    }
    @RequestMapping("updateIsEffective.action")
    public String updateIsEffective(ProProjectType2 proProjectType2,RedirectAttributesModelMap modelMap){
        try{
            proProjectTypeService.updateProProjectType2(proProjectType2);
        }catch (Exception e){
            e.printStackTrace();
            modelMap.addFlashAttribute("exceptionMessage",e.getMessage());
        }
        return "redirect:toProProjectType.action";
    }
}
