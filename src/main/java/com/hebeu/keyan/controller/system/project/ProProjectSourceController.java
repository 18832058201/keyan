package com.hebeu.keyan.controller.system.project;

import com.hebeu.keyan.po.ProProjectSource;
import com.hebeu.keyan.service.BasicParameterService;
import com.hebeu.keyan.service.ProProjectSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

/**
 * Created by Administrator on 2017/8/2.
 */
@Controller
@RequestMapping("/")
public class ProProjectSourceController {
    private ProProjectSourceService proProjectSourceService;
    private BasicParameterService basicParameterService;
    @Autowired
    public ProProjectSourceController(ProProjectSourceService proProjectSourceService, BasicParameterService basicParameterService){
        this.proProjectSourceService = proProjectSourceService;
        this.basicParameterService = basicParameterService;
    }
    @RequestMapping("toProProjectSource.action")
    public String toProProjectSource(Model model){
        model.addAttribute("ProProjectSourceList",proProjectSourceService.fidProProjectSourceList());
        model.addAttribute("SubjectTypeList",basicParameterService.findSubjectType());
        model.addAttribute("count",proProjectSourceService.findProProjectSourceCount());
        return "system/project/proProjectSourceList";
    }
    @RequestMapping("insertProProjectSource.action")
    public String insertProProjectSource(ProProjectSource proProjectSource, RedirectAttributesModelMap modelMap){
        try {
            proProjectSourceService.insertProProjectSource(proProjectSource);
        }catch (Exception e){
            e.printStackTrace();
            if("该项目来源已经存在".equals(e.getMessage())){
                modelMap.addAttribute("exceptionMessage","该项目来源已经存在");
                return "redirect:toProProjectSource.action";
            }else {
                modelMap.addAttribute("exceptionMessage","新增出现异常");
                return "redirect:toProProjectSource.action";
            }
        }
        return "redirect:toProProjectSource.action";
    }
    @RequestMapping("updateProProjectSource.action")
    public String updateProProjectSource(ProProjectSource proProjectSource,RedirectAttributesModelMap modelMap){
        try {
            proProjectSourceService.updateProProjectSource(proProjectSource);
        }catch (Exception e){
            e.printStackTrace();
            if ("该项目来源已存在".equals(e.getMessage())){
                modelMap.addAttribute("exceptionMessage","该项目来源已存在");
                return "redirect:toProProjectSource.action";
            }
            else {
                modelMap.addAttribute("exceptionMessage","更新出现异常");
                return "redirect:toProProjectSource.action";
            }
        }
        return "redirect:toProProjectSource.action";
    }
}
