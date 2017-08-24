package com.hebeu.keyan.controller.system.project;

import com.hebeu.keyan.po.ProProjectGrade;
import com.hebeu.keyan.service.ProProjectGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

/**
 * 作者：张程
 * 时间：2017/8/1
 * 描述：项目等级控制器
 */
@Controller
@RequestMapping("/")
public class ProProjectGradeController {
    private ProProjectGradeService proProjectGradeService;

    @Autowired
    public ProProjectGradeController(ProProjectGradeService proProjectGradeService){
        this.proProjectGradeService = proProjectGradeService;
    }
    @RequestMapping("toProProjectGrade.action")
    public String toProProjectGrade(Model model){
        model.addAttribute("ProProjectGradeList",proProjectGradeService.findProProjectGradeList());
        model.addAttribute("ProProjectGradeCount",proProjectGradeService.findProProjectGradeCount());
        return "system/project/proProjectGradeList";
    }
    @RequestMapping("insertProProjectGrade.action")
    public String insertProProjectGrade(ProProjectGrade proProjectGrade,RedirectAttributesModelMap modelMap){
        try {
            proProjectGradeService.insertProProjectGrade(proProjectGrade);
        }catch (Exception e){
            e.printStackTrace();
            if("ProProjectGrade重复插入".equals(e.getMessage())){
                modelMap.addFlashAttribute("exceptionMessage","数据重复插入");
                return "redirect:toProProjectGrade.action";
            }else{
                modelMap.addFlashAttribute("exceptionMessage","数据插入异常");
                return "redirect:toProProjectGrade.action";
            }
        }
        return "redirect:toProProjectGrade.action";
    }
    @RequestMapping("updateProProjectGrade.action")
    public String updateProProjectGrade(ProProjectGrade proProjectGrade,RedirectAttributesModelMap redirectAttributesModelMap){
        try {
            proProjectGradeService.updateProProjectGrade(proProjectGrade);
        }catch (Exception e){
            e.printStackTrace();
            if("更新数据异常".equals(e.getMessage())){
                redirectAttributesModelMap.addFlashAttribute("exceptionMessage","更新数据异常");
                return "redirect:toProProjectGrade.action";
            }
        }
        return "redirect:toProProjectGrade.action";
    }
}
