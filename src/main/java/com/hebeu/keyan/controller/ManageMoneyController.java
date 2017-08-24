package com.hebeu.keyan.controller;

import com.hebeu.keyan.po.ManageMoneyApply;
import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.service.BasicParameterService;
import com.hebeu.keyan.service.ManageMoneyService;
import com.hebeu.keyan.utils.DateToString;
import com.hebeu.keyan.vo.AuditObjectVo;
import com.hebeu.keyan.vo.MoneySearchVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.servlet.http.HttpSession;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/11  16:12
 * 描述：
 */
@Controller
@RequestMapping("/manageMoney/")
public class ManageMoneyController {
    private final ManageMoneyService manageMoneyService;
    private final BasicParameterService basicParameterService;

    @Autowired
    public ManageMoneyController(ManageMoneyService manageMoneyService, BasicParameterService basicParameterService) {
        this.manageMoneyService = manageMoneyService;
        this.basicParameterService = basicParameterService;
    }

    /**
     * 查看指定“工号”的《科研管理费申请》列表
     *
     * @return 返回科研管理费申请列表页面
     */
    @RequestMapping("toApplyList.action")
    public String toApplyList(HttpSession session, Model model) {
        //从session中取到用户信息
        ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
        //System.out.println("当前登录用户为"+activeUser.getUserId());
        model.addAttribute("ds", new DateToString());
        model.addAttribute("manageMoneyApplyList", manageMoneyService.findApplyByWorkNum(activeUser.getUserId()));
        return "money/manageMoneyApplyList";
    }

    /**
     * “新增”科研管理费申请表单
     *
     * @return 跳转到新增科研管理费页面
     */
    @RequestMapping("toAddApply.action")
    public String toAddApply(Model model) {
        /*start：基础表参数设置*/
        model.addAttribute("applyTypeList", basicParameterService.findManageApplyType());                 //申请类型
        model.addAttribute("allYearList", manageMoneyService.findAllYear());                               //所有年份
        model.addAttribute("allPersonList", manageMoneyService.findAllPeople());                           //所有在职人员列表，格式为姓名（工号）
        /*end：基础表参数设置*/
        model.addAttribute("ds", new DateToString());    //时间格式化对象
        return "money/manageMoneyApplyAdd";
    }

    /**
     * 新增：科研管理费申请保存、提交
     *
     * @param manageMoneyApply 科研管理费申请传值对象
     * @return 保存成功就重定向到科研管理费申请列表，失败就返回科研管理费新增表单
     */
    @RequestMapping("insertApply.action")
    public String insertApply(ManageMoneyApply manageMoneyApply, RedirectAttributesModelMap model) {
        try {
            //调用处理业务插入信息到数据库中
            manageMoneyService.insertApply(manageMoneyApply);
        } catch (Exception e) {
            e.printStackTrace();
            if ("插入数据失败".equals(e.getMessage())) {
                return "redirect:/manageMoney/toAddApply.action";
            } else if ("输入的申请金额超出最大可申请金额，请确认后重新输入".equals(e.getMessage())) {
                model.addFlashAttribute("exceptionMessage", "提示：输入的申请金额超出最大可申请金额，请确认后重新输入！");
                return "redirect:/manageMoney/toAddApply.action";
            }
        }
        return "redirect:/manageMoney/toApplyList.action";
    }

    /**
     * 通过ajax验证填写的申请金额是否大于可申请最大金额
     *
     * @param applyMoney 申请金额
     * @return 返回true表示已存在，返回false表示不存在
     */
    @RequestMapping("applyMoneyIsOut.action")
    @ResponseBody  //表示这是ajax响应体
    public boolean applyMoneyIsOut(HttpSession session, Double applyMoney, Integer applyYear, Integer applyTypeId, String submitType, String applyId) {
        //从session中取到用户信息
        ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
        ManageMoneyApply manageMoneyApply = new ManageMoneyApply();
        manageMoneyApply.setApplyMoney(applyMoney);
        manageMoneyApply.setApplyYear(applyYear);
        manageMoneyApply.setApplyTypeId(applyTypeId);
        manageMoneyApply.setCollegeId(activeUser.getUserInfo().getCollegeId2());
        if (applyId != null) {
            manageMoneyApply.setApplyId(applyId);
        }
        return manageMoneyService.applyMoneyIsOut(manageMoneyApply, submitType);
    }

    /**
     * 查看指定申请编号的“管理费详情”
     *
     * @param applyId 申请编号
     * @return 返回到 “管理费详情”
     */
    @RequestMapping("toApplyInfo.action")
    public String toApplyInfo(Model model, String applyId) {
        model.addAttribute("applyInfo", manageMoneyService.findApplyInfoByApplyId(applyId));
        model.addAttribute("ds", new DateToString());//时间格式化对象
        return "money/manageMoneyApplyInfo";
    }

    /**
     * 编辑 "科研管理费" 表单
     *
     * @param applyId 科研管理费
     * @return 跳转到编辑 科研管理费 表单
     */
    @RequestMapping("toEditApply.action")
    public String toEditApply(Model model, String applyId) {
        /*start：基础表参数设置，其中部分参数不需要在此设置，需要通过ajax异步请求方式来设置*/
        model.addAttribute("manageMoneyApply", manageMoneyService.findApplyInfoByApplyId(applyId));
        model.addAttribute("applyTypeList", basicParameterService.findManageApplyType());                 //申请类型
        model.addAttribute("allYearList", manageMoneyService.findAllYear());                               //所有年份
        model.addAttribute("allPersonList", manageMoneyService.findAllPeople());                           //所有在职人员列表，格式为姓名（工号）
        /*end：基础表参数设置*/
        model.addAttribute("ds", new DateToString());    //时间格式化对象
        return "money/manageMoneyApplyEdit";
    }

    /**
     * 编辑：科研管理费保存、提交
     *
     * @param manageMoneyApply 科研管理费 传值对象
     * @return 保存成功就重定向到 科研管理费 列表，失败就返回 科研管理费新增表单
     */
    @RequestMapping("updateApply.action")
    public String updateApply(ManageMoneyApply manageMoneyApply, RedirectAttributesModelMap model) {
        try {
            manageMoneyService.updateApply(manageMoneyApply);
        } catch (Exception e) {
            e.printStackTrace();
            if ("编辑数据失败".equals(e.getMessage())) {
                return "redirect:/manageMoney/toEditApply.action?applyId=" + manageMoneyApply.getApplyId() + "";
            } else if ("输入的申请金额超出最大可申请金额，请确认后重新输入".equals(e.getMessage())) {
                model.addFlashAttribute("exceptionMessage", "提示：输入的申请金额超出最大可申请金额，请确认后重新输入！");
                return "redirect:/manageMoney/toEditApply.action?applyId=" + manageMoneyApply.getApplyId() + "";
            }
        }
        return "redirect:/manageMoney/toApplyInfo.action?applyId=" + manageMoneyApply.getApplyId() + "";
    }

    /**
     * 删除指定id的科研管理费申请
     *
     * @param applyId 申请id
     * @return 返回列表
     */
    @RequestMapping("deleteApply.action")
    public String deleteApply(String applyId) {
        try {
            manageMoneyService.deleteApplyByApplyId(applyId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/manageMoney/toApplyList.action";
    }


    /*-------------------审核内容------------------*/

    /**
     * audit--------------根据“姓名（工号）”查询可审核的科研管理费申请列表
     * @param auditType 状态
     * @return 返回指定“姓名（工号）”的可审核的科研管理费申请列表
     */
    @RequestMapping("toAuditApplyList.action")
    public String toAuditApplyList(Integer auditType,Model model) {
        //创建主体并从主体中获取身份信息
        Subject subject = SecurityUtils.getSubject();
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        //创建查询条件对象并设置查询条件
        MoneySearchVO moneySearchVO = new MoneySearchVO();
        moneySearchVO.setAuditType(auditType);
        moneySearchVO.setWorkNameAndNum(activeUser.getWorkNameAndNum());
        model.addAttribute("auditApplyList", manageMoneyService.findApplyByMoneySearchVO(moneySearchVO));
        model.addAttribute("auditType",auditType);
        model.addAttribute("ds", new DateToString());
        return "money/manageMoneyAuditList";
    }

    /**
     * audit--------------提交审核
     * @param auditObjectVo 审核对象
     * @return 重定向到纵向项目列表
     */
    @RequestMapping("submitAuditApply.action")
    public String submitAuditApply(AuditObjectVo auditObjectVo,RedirectAttributesModelMap model){
        try {
            manageMoneyService.updateApplyStatus(auditObjectVo);//调用审核业务更新审核状态
        } catch (Exception e) {
            e.printStackTrace();
            if ("所选科研管理费申请的申请金额大于目前可申请金额，撤销失败！".equals(e.getMessage())) {
                model.addFlashAttribute("error", "提示：所选科研管理费申请的申请金额大于目前可申请金额，撤销失败！");
                return "redirect:/manageMoney/toAuditApplyList.action?auditType=2";
            }else if ("不可越级操作，撤销失败！".equals(e.getMessage())){
                model.addFlashAttribute("error","不可越级操作，撤销失败！");
            }
        }

        return "redirect:/manageMoney/toAuditApplyList.action?auditType=1";
    }

    /**
     * audit--------------查看指定申请编号的“管理费详情”
     * @param applyId 申请编号
     * @return 返回到 “管理费详情”
     */
    @RequestMapping("toAuditApplyInfo.action")
    public String toAuditApplyInfo(Model model, String applyId) {
        model.addAttribute("applyInfo", manageMoneyService.findApplyInfoByApplyId(applyId));
        model.addAttribute("ds", new DateToString());//时间格式化对象
        return "money/auditManageApplyInfo";
    }

    /**
     * audit--------------编辑 "科研管理费" 表单
     *
     * @param applyId 科研管理费
     * @return 跳转到编辑 科研管理费 表单
     */
    @RequestMapping("toEditAuditApply.action")
    public String toEditAuditApply(Model model, String applyId) {
        /*start：基础表参数设置，其中部分参数不需要在此设置，需要通过ajax异步请求方式来设置*/
        model.addAttribute("manageMoneyApply", manageMoneyService.findApplyInfoByApplyId(applyId));
        model.addAttribute("applyTypeList", basicParameterService.findManageApplyType());                 //申请类型
        model.addAttribute("allYearList", manageMoneyService.findAllYear());                               //所有年份
        model.addAttribute("allPersonList", manageMoneyService.findAllPeople());                           //所有在职人员列表，格式为姓名（工号）
        /*end：基础表参数设置*/
        model.addAttribute("ds", new DateToString());    //时间格式化对象
        return "money/auditManageApplyEdit";
    }

    /**
     * audit--------------编辑：科研管理费保存、提交
     *
     * @param manageMoneyApply 科研管理费 传值对象
     * @return 保存成功就重定向到 科研管理费 列表，失败就返回 科研管理费新增表单
     */
    @RequestMapping("updateAuditApply.action")
    public String updateAuditApply(ManageMoneyApply manageMoneyApply, RedirectAttributesModelMap model) {
        try {
            manageMoneyService.updateApply(manageMoneyApply);
        } catch (Exception e) {
            e.printStackTrace();
            if ("编辑数据失败".equals(e.getMessage())) {
                return "redirect:/manageMoney/toEditAuditApply.action?applyId=" + manageMoneyApply.getApplyId() + "";
            } else if ("输入的申请金额超出最大可申请金额，请确认后重新输入".equals(e.getMessage())) {
                model.addFlashAttribute("exceptionMessage", "提示：输入的申请金额超出最大可申请金额，请确认后重新输入！");
                return "redirect:/manageMoney/toEditAuditApply.action?applyId=" + manageMoneyApply.getApplyId() + "";
            }
        }
        return "redirect:/manageMoney/toAuditApplyInfo.action?applyId=" + manageMoneyApply.getApplyId() + "";
    }
}
