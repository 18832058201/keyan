package com.hebeu.keyan.controller.system;

import com.hebeu.keyan.po.RewClass;
import com.hebeu.keyan.service.RewClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;


/**
 * 作者：陈德华
 * 时间：2017/7/27
 * 描述：获奖类别控制器
 */
@Controller
@RequestMapping("/")
public class RewClassController {

    //定义SystemService
    private final RewClassService rewClassService;

    //通过构造方法形式自动注入SystemService对象，spring容器就会自动去实例化此对象
    @Autowired
    public RewClassController(RewClassService rewClassService) {
        this.rewClassService = rewClassService;
    }

    /**
     * 查看获奖类别列表页面
     * @param model 视图对象，通过model对象可以向前台传值，作用相当于request对象
     * @return 返回获奖列表页面
     */
    @RequestMapping("toRewardList.action")
    public String toReward(Model model){
        model.addAttribute("rewClassList", rewClassService.fidRewClassList());//将奖励类别集合传到前台
        model.addAttribute("subjectTypeList", rewClassService.findSubjectTypeList());//将学科门类集合传到前台
        model.addAttribute("rewClassCount", rewClassService.findRewClassCount());//设置记录总数
//        model.addAttribute("operationResult","成功查询到");
        return "system/reward/rewClassList";
    }

    /**
     * 更新获奖类别数据
     * @param rewClass 更新的获奖类别对象，springMVC会根据input标签名自动对对象属性进行赋值
     * @param model 视图对象，通过model对象可以向前台传值，作用相当于request对象
     * @return 重定向到获奖类别列表
     */
    @RequestMapping("updateRewClass.action")
    public String updateRewClass(RewClass rewClass,RedirectAttributesModelMap model){
        try {
            rewClassService.updateRewClass(rewClass);
        } catch (Exception e) {
            e.printStackTrace();
            //异常处理，返回更新数据失败信息
            if ("更新数据异常".equals(e.getMessage())){
                model.addFlashAttribute("exceptionMessage","更新数据异常");
                return "redirect:toRewardList.action";
            } else if ("该获奖类别已存在".equals(e.getMessage())){
                model.addFlashAttribute("exceptionMessage","该获奖类别已存在，更新失败");
                return "redirect:toRewardList.action";
            }
        }
        return "redirect:toRewardList.action";
    }

    /**
     * 插入获奖类别数据
     * @param rewClass 获奖类别对象，springMVC会根据input标签名自动对对象属性进行赋值
     * @param model 重定向视图对象，使用此对象在重定向中也能传值
     * @return 重定向到获奖类别列表
     */
    @RequestMapping("insertRewClass.action")
    public String insertRewClass(RewClass rewClass,RedirectAttributesModelMap model){
        try {
            rewClassService.insertRewClass(rewClass);
        } catch (Exception e) {
            e.printStackTrace();
            if ("插入数据异常".equals(e.getMessage())){
                model.addFlashAttribute("exceptionMessage","插入数据异常");
                return "redirect:toRewardList.action";
            } else if ("该获奖类别已存在".equals(e.getMessage())){
                model.addFlashAttribute("exceptionMessage","该获奖类别已存在，插入失败");
                return "redirect:toRewardList.action";
            }
        }
        return "redirect:toRewardList.action";
    }

    /**
     * 通过ajax来判断输入的rewClassName是否存在
     * @param validateName 输入的获奖名称
     * @return 返回true表示已存在，返回false表示不存在
     */
//    @RequestMapping("rewClassIsExisted.action")
//    @ResponseBody  //表示这是ajax响应体
//    public boolean isExisted(String validateName){
//        return rewClassService.findRewClassIsExisted(validateName);
//    }
}
