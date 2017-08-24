package com.hebeu.keyan.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者：陈德华
 * 时间：2017/7/27
 * 描述：主页
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequiresPermissions("user:personal")
    @RequestMapping("personalIndex.action")
    public String personIndex(){

        return "index/personalIndex";
    }

    @RequestMapping("collegeIndex.action")
    public String collegeIndex(){

        return "index/collegeIndex";
    }
    @RequestMapping("scientificIndex.action")
    public String scientificIndex(){

        return "index/scientificIndex";
    }
    @RequestMapping("platformIndex.action")
    public String platformIndex(){

        return "index/platformIndex";
    }
    @RequestMapping("systemIndex.action")
    public String systemIndex(){

        return "index/systemIndex";
    }
}
