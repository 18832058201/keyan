package com.hebeu.keyan.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者：陈德华
 * 时间：2017/7/27
 * 描述：角色转换导航
 */
@Controller
@RequestMapping("/")
public class RoleController {


    @RequestMapping("personal.action")
    @RequiresPermissions("user:personal")
    public String personal(Model model){
        model.addAttribute("role","personal");
        return "menuPersonal";
    }

    @RequestMapping("college.action")
    @RequiresPermissions("user:college")
    public String college(Model model){
        model.addAttribute("role","college");
        return "menuCollege";
    }


    @RequestMapping("scientific.action")
    @RequiresPermissions("user:keyan")
    public String scientific(Model model){
        model.addAttribute("role","scientific");
        return "menuScientific";
    }

    @RequestMapping("platform.action")
    public String platform(Model model){
        model.addAttribute("role","platform");
        return "menuPlatform";
    }

    @RequestMapping("system.action")
    public String system(Model model){
        model.addAttribute("role","system");
        return "menuSystem";
    }



}
