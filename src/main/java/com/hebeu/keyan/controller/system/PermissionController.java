package com.hebeu.keyan.controller.system;

import com.hebeu.keyan.po.UserInfo;
import com.hebeu.keyan.service.LoginService;
import com.hebeu.keyan.service.PermissionService;
import com.hebeu.keyan.vo.RoleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/8/22 16:50
 * 描述：权限管理控制器
 */
@Controller
@RequestMapping("/system/permission/")
public class PermissionController {
    private final PermissionService permissionService;
    private final LoginService loginService;

    @Autowired
    public PermissionController(PermissionService permissionService, LoginService loginService) {
        this.permissionService = permissionService;
        this.loginService = loginService;
    }


    /**
     * 查看所有的人员列表
     * @return 返回到人员列表
     */
    @RequestMapping("toPersonList.action")
    public String toPersonList(Model model){
        model.addAttribute("personList",permissionService.findPersonList());
        return "system/permission/personList";
    }


    /**
     * 设置人员角色
     * @param workNum 工号
     * @return 返回到人员角色设置页
     */
    @RequestMapping("toSetPersonRole.action")
    public String toSetPersonRole(String workNum,Model model){
        model.addAttribute("userInfo",loginService.findUserInfoByUserId(workNum));  //查询人员信息
        model.addAttribute("personRole",loginService.findSysRoleByUserId(workNum)); //设置人员角色集合
        System.out.println(loginService.findSysRoleByUserId(workNum).toString());
        model.addAttribute("allRoleList",permissionService.findAllRole());          //设置所有的角色
        return "system/permission/setPersonRole";
    }

    /**
     * 重置所有人员角色信息
     * @return 返回到人员列表
     */
    @RequestMapping("resetRole.action")
    public String resetRole(){
        permissionService.updateAllRole();
        return "redirect:/system/permission/toPersonList.action";
    }


    /**
     * 更新人员角色
     * @return 重定向到人员列表
     */
    @RequestMapping("saveRoleSettings.action")
    public String saveRoleSettings(RoleVO roleVO){
        try {
            System.out.println(roleVO.toString());
            permissionService.updateRole(roleVO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/system/permission/toPersonList.action";
    }

    /**
     * 重置密码
     * @param workNum 工号
     * @return 重定向到人员列表
     */
    @RequestMapping("resetPassword.action")
    public String resetPassword(String workNum){
        permissionService.updatePassword(workNum);
        return "redirect:/system/permission/toPersonList.action";
    }
}
