package com.hebeu.keyan.controller.system;

import com.hebeu.keyan.po.PerPostLevel;
import com.hebeu.keyan.service.PerPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

/**
 * 作者：冯嘉龙
 * 时间：2017/7/31  11:56
 * 描述：绩效
 */
@Controller
@RequestMapping("/")
public class PerPostController {
    //定义SystemService
    private final PerPostService perPostService;

    //通过构造方法形式自动注入SystemService对象，spring容器就会自动去实例化此对象
    @Autowired
    public PerPostController(PerPostService perPostService) {
        this.perPostService = perPostService;
    }

    /**
     * 查看 绩效 列表页面
     * @param model 视图对象，通过model对象可以向前台传值，作用相当于request对象
     * @return 返回 绩效 列表页面
     */
    @RequestMapping("toPerPostList.action")
    public String toPerPost(Model model){
        model.addAttribute("perPostTypeList", perPostService.findPerPostTypeList());//将 绩效类别 集合传到前台
        model.addAttribute("perPostLevelList", perPostService.findPerPostLevelList());//将 绩效等级 集合传到前台
        model.addAttribute("perPostCount", perPostService.findPerPostLevelCount());//设置记录总数
        return "system/person/perPostList";
    }
    /**
     * 更新 绩效 数据
     * @param perPostLevel 更新的 绩效 对象，springMVC会根据input标签名自动对对象属性进行赋值
     * @param model 视图对象，通过model对象可以向前台传值，作用相当于request对象
     * @return 重定向到获奖类别列表
     */
    @RequestMapping("updatePerPostLevel.action")
    public String updatePerPostLevel(PerPostLevel perPostLevel, RedirectAttributesModelMap model){
        try {
            perPostService.updatePerPostLevel(perPostLevel);
        } catch (Exception e) {
            e.printStackTrace();
            //异常处理，返回更新数据失败信息
            if ("更新数据异常".equals(e.getMessage())){
                model.addFlashAttribute("exceptionMessage","更新数据异常");
                return "redirect:toPerPostList.action";
            }
        }
        return "redirect:toPerPostList.action";
    }
}
