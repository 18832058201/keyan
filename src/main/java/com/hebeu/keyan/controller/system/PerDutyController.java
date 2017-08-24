package com.hebeu.keyan.controller.system;

import com.hebeu.keyan.po.PerDuty;
import com.hebeu.keyan.service.PerDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

/**
 * 作者：冯嘉龙
 * 时间：2017/7/30  17:29
 * 描述：职务控制器
 */
@Controller
@RequestMapping("/")
public class PerDutyController {
    //定义PerDutyService
    private final PerDutyService perDutyService;

    //通过构造方法形式自动注入SystemService对象，spring容器就会自动去实例化此对象
    @Autowired
    public PerDutyController(PerDutyService perDutyService) {
        this.perDutyService = perDutyService;
    }

    /**
     * 查看 职务 列表页面
     *
     * @param model 视图对象，通过model对象可以向前台传值，作用相当于request对象
     * @return 返回 职务 列表页面
     */
    @RequestMapping("toPerDutyList.action")
    public String toPerDuty(Model model) {
        model.addAttribute("perDutyList", perDutyService.findPerDutyList());
        model.addAttribute("perDutyCount", perDutyService.findPerDutyCount());//设置记录总数
        return "system/person/perDutyList";
    }

    /**
     * 插入 职务 数据
     *
     * @param perDuty 获奖类别对象，springMVC会根据input标签名自动对对象属性进行赋值
     * @param model   重定向视图对象，使用此对象在重定向中也能传值
     * @return 重定向到获奖类别列表
     */
    @RequestMapping("insertPerDuty.action")
    public String insertPerDuty(PerDuty perDuty, RedirectAttributesModelMap model) {
        try {
            perDutyService.insertPerDuty(perDuty);
        } catch (Exception e) {
            e.printStackTrace();
            if ("插入数据异常".equals(e.getMessage())) {
                model.addFlashAttribute("exceptionMessage", "插入数据异常");
                return "redirect:toPerDutyList.action";
            } else if ("该职务已存在".equals(e.getMessage())) {
                model.addFlashAttribute("exceptionMessage", "该职务已存在，插入失败");
                return "redirect:toPerDutyList.action";
            }
        }
        return "redirect:toPerDutyList.action";
    }

    /**
     * 更新 职务 数据
     * @param perDuty 更新的 职务 对象，springMVC会根据input标签名自动对对象属性进行赋值
     * @param model 视图对象，通过model对象可以向前台传值，作用相当于request对象
     * @return 重定向到获奖类别列表
     */
    @RequestMapping("updatePerDuty.action")
    public String updateRewClass(PerDuty perDuty,RedirectAttributesModelMap model){
        try {
            perDutyService.updatePerDuty(perDuty);
        } catch (Exception e) {
            e.printStackTrace();
            if ("更新数据异常".equals(e.getMessage())) {
                model.addFlashAttribute("exceptionMessage", "更新数据异常");
                return "redirect:toPerDutyList.action";
            } else if ("该职务已存在".equals(e.getMessage())) {
                model.addFlashAttribute("exceptionMessage", "该职务已存在，更新失败");
                return "redirect:toPerDutyList.action";
            }
        }
        return "redirect:toPerDutyList.action";
    }

    /**
     * 通过ajax来判断输入的dutyName是否存在
     * @param validateName 输入的 职务 名称
     * @return 返回true表示已存在，返回false表示不存在
     */
    @RequestMapping("perDutyIsExisted.action")
    @ResponseBody  //表示这是ajax响应体
    public boolean isExisted(String validateName){
        return perDutyService.findPerDutyIsExisted(validateName);
    }
}
