package com.hebeu.keyan.controller.system;

import com.hebeu.keyan.po.PerPostLevel;
import com.hebeu.keyan.po.PerTitleLevel;
import com.hebeu.keyan.service.PerPostService;
import com.hebeu.keyan.service.PerTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

/**
 * 作者：冯嘉龙
 * 时间：2017/7/31  11:56
 * 描述：职称 处理
 */
@Controller
@RequestMapping("/")
public class PerTitleController {
    //定义SystemService
    private final PerTitleService perTitleService;

    //通过构造方法形式自动注入SystemService对象，spring容器就会自动去实例化此对象
    @Autowired
    public PerTitleController(PerTitleService perTitleService) {
        this.perTitleService = perTitleService;
    }

    /**
     * 查看 职称 列表页面
     * @param model 视图对象，通过model对象可以向前台传值，作用相当于request对象
     * @return 返回 职称 列表页面
     */
    @RequestMapping("toPerTitleList.action")
    public String toPerTitle(Model model){
        model.addAttribute("perTitleTypeList", perTitleService.findPerTitleTypeList());//将 职称类别 集合传到前台
        model.addAttribute("perTitleLevelList", perTitleService.findPerTitleLevelList());//将 职称等级 集合传到前台
        model.addAttribute("perTitleCount", perTitleService.findPerTitleLevelCount());//设置记录总数
        return "system/person/perTitleList";
    }
    /**
     * 更新 职称 数据
     * @param perTitleLevel 更新的 职称 对象，springMVC会根据input标签名自动对对象属性进行赋值
     * @param model 视图对象，通过model对象可以向前台传值，作用相当于request对象
     * @return 重定向到 职称 列表
     */
    @RequestMapping("updatePerTitleLevel.action")
    public String updatePerTitleLevel(PerTitleLevel perTitleLevel, RedirectAttributesModelMap model){
        try {
            perTitleService.updatePerTitleLevel(perTitleLevel);
        } catch (Exception e) {
            e.printStackTrace();
            //异常处理，返回更新数据失败信息
            if ("更新数据异常".equals(e.getMessage())){
                model.addFlashAttribute("exceptionMessage","更新数据异常");
                return "redirect:toPerTitleList.action";
            }
        }
        return "redirect:toPerTitleList.action";
    }
}
