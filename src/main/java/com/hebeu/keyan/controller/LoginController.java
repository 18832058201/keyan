package com.hebeu.keyan.controller;

import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 作者：陈德华
 * 时间：2017/7/24.
 * 描述：登录控制器
 */
@Controller
@RequestMapping("/")
public class LoginController {
    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    /**
     * 通过shiro处理登录操作
     * @param model  视图对象
     * @param request 请求
     * @return 返回页面
     * @throws Exception
     */
    @RequestMapping("login.action")
    public String loginSubmit(Model model, HttpServletRequest request)
            throws Exception {

        // shiro在认证过程中出现错误后将异常类路径通过request返回
        String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
        if(exceptionClassName!=null){
            if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
                model.addAttribute("loginResult","账号不存在");
                return "login";
            } else if (IncorrectCredentialsException.class.getName().equals(
                    exceptionClassName)) {
                model.addAttribute("loginResult","用户名/密码错误");
                return "login";
            } else{
                model.addAttribute("loginResult","服务器异常");
                return "login";
            }
        }
        return "login";
    }

    /**
     * 登录成功后进入主页
     * @return  返回对应的主页
     */
    @RequestMapping("index.action")
    public String index (HttpServletRequest request,Model model){
        //主体
        Subject subject = SecurityUtils.getSubject();
        //身份
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        //如果个人信息状态值为0，跳转到个人信息编辑页
        if(loginService.findUserInfoByUserId(activeUser.getUserId()).getInformationStatus()== 0){
            return "redirect:/personal/toEditPersonalInfo.action";
        }
        HttpSession session =  request.getSession();
        session.setAttribute("activeUser",activeUser); //将当前在线用户信息放到session中
        model.addAttribute("roles",loginService.findSysRoleByUserId(activeUser.getUserId()));

        //科研院管理员
        if(subject.hasRole("projectSection1")||subject.hasRole("projectSection2")
                ||subject.hasRole("projectSection3")||subject.hasRole("projectSection4")
                ||subject.hasRole("resultSection")||subject.hasRole("schoolLeader")){
            model.addAttribute("role","scientific");
            return "menuScientific";
        }
        //学院管理员
        if(subject.hasRole("collegeLeader")||subject.hasRole("collegeAdmin")){
            model.addAttribute("role","college");
            return "menuCollege";
        }
        //平台管理员
        if(subject.hasRole("platformAdmin")){
            model.addAttribute("role","platform");
            return "menuPlatform";
        }
        //系统管理员
        if(subject.hasRole("systemAdmin")){
            model.addAttribute("role","system");
            return "menuSystem";
        }
        model.addAttribute("role","personal");
        return "menuPersonal";
    }

    /**
     * 无权操作时跳转到拒绝访问页
     * @return 返回到拒绝访问页
     */
    @RequestMapping("refuse.action")
    public String refuse (){
        return "refuse";
    }

}
