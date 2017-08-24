package com.hebeu.keyan.controller.system.project;

import com.hebeu.keyan.po.ProEconomicsTarget;
import com.hebeu.keyan.service.ProEconomicsTargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
@Controller
@RequestMapping("/")
public class ProEconomicsTargetController {
    private ProEconomicsTargetService proEconomicsTargetService;
    @Autowired
    public ProEconomicsTargetController(ProEconomicsTargetService proEconomicsTargetService){
        this.proEconomicsTargetService = proEconomicsTargetService;
    }

    /**
     * 获取社会经济目标列表和记录数
     * @param model
     * @return 转发到jsp
     */
    @RequestMapping("toProEconomicsTargetList.action")
    public String toProEconomicsTarget(Model model){
        List<ProEconomicsTarget> proEconomicsTargetList = proEconomicsTargetService.findProEconomicsTargetList();
        model.addAttribute("proEconomicsTargetList",proEconomicsTargetList);
        model.addAttribute("ProEconomicsTargetCount",proEconomicsTargetService.findProEconomicsTargetCount());
        return "system/project/economicsTargetList";
    }

    /**
     * 插入一条社会经济目标
     * @param proEconomicsTarget
     * @return 重定向到列表
     */
    @RequestMapping("insertProEconomicsTarget.action")
    public String insertProEconomicsTarget(ProEconomicsTarget proEconomicsTarget,RedirectAttributesModelMap modelMap){
        try {
           proEconomicsTargetService.insertProEconomicsTarget(proEconomicsTarget);
        }catch (Exception e){
            e.printStackTrace();
            if("proEconomicsTarget插入重复".equals(e.getMessage())){
                modelMap.addFlashAttribute("exceptionMessage","数据重复插入");
                return "redirect:toProEconomicsTargetList.action";
            }else{
                modelMap.addFlashAttribute("exceptionMessage","数据插入异常");
                return "redirect:toProEconomicsTargetList.action";
            }
        }
        return "redirect:toProEconomicsTargetList.action";
    }

    /**
     * 修改ProEconomicsTarget数据
     * @param proEconomicsTarget
     * @param modelMap
     * @return 重定向到社会经济目标列表
     */
    @RequestMapping("updateProEconomicsTarget.action")
    public String updateProEconomicsTarget(ProEconomicsTarget proEconomicsTarget,RedirectAttributesModelMap modelMap){
        try {
            proEconomicsTargetService.updateProEconomicsTarget(proEconomicsTarget);
        }catch (Exception e){
            e.printStackTrace();
            if("更新数据异常".equals(e.getMessage())){
                modelMap.addFlashAttribute("exceptionMessage","更新数据异常");
                return "redirect:toProEconomicsTargetList.action";
            }
        }
        return "redirect:toProEconomicsTargetList.action";
    }
}
