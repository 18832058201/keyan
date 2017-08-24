package com.hebeu.keyan.controller.system.project;

import com.hebeu.keyan.po.ProProjectDomain;
import com.hebeu.keyan.service.ProProjectDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

/**
 * 作者：张程
 * 时间：2017/8/1
 * 描述：项目所属领域控制器
 */
@Controller
@RequestMapping("/")
public class ProProjectDomainController {
    private ProProjectDomainService proProjectDomainService;
    @Autowired
    public ProProjectDomainController(ProProjectDomainService proProjectDomainService){
        this.proProjectDomainService = proProjectDomainService;
    }

    @RequestMapping("toProProjectDomain.action")
    public String toProProjectDomain(Model model){
        model.addAttribute("ProProjectDomainList",proProjectDomainService.findProProjectDomainList());
        model.addAttribute("ProProjectDomainCount",proProjectDomainService.findProProjectDomainCount());
        return "system/project/ProProjectDomainList";
    }
    @RequestMapping("insertProProjectDomain.action")
    public String insertProProjectDomain(ProProjectDomain proProjectDomain,RedirectAttributesModelMap modelMap){
        try {
            proProjectDomainService.insertProProjectDomain(proProjectDomain);
        }catch (Exception e){
            e.printStackTrace();
            if("proProjectDomain重复插入".equals(e.getMessage())){
                modelMap.addFlashAttribute("exceptionMessage","重复插入");
                return "redirect:toProProjectDomain.action";
            }else {
                modelMap.addFlashAttribute("exceptionMessage","插入数据异常");
                return "redirect:toProProjectDomain.action";
            }
        }
        return "redirect:toProProjectDomain.action";
    }
    @RequestMapping("updateProProjectDomain.action")
    public String updateProProjectDomain(ProProjectDomain proProjectDomain,RedirectAttributesModelMap modelMap){
        try{
            proProjectDomainService.updateProProjectDomain(proProjectDomain);
        }catch (Exception e){
            e.printStackTrace();
            if("更新数据异常".equals(e.getMessage())){
                modelMap.addFlashAttribute("exceptionMessage","更新数据异常");
                return "redirect:toProProjectDomain.action";
            }
        }
        return "redirect:toProProjectDomain.action";
    }
}
