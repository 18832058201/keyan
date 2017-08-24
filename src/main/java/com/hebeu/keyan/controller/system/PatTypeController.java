package com.hebeu.keyan.controller.system;

import com.hebeu.keyan.po.PatType;
import com.hebeu.keyan.service.PatTypeServeice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

/**
 * 作者：张彤
 * 时间：2017/8/1 21:23
 * 描述：专利类型的控制器
 */
@Controller
@RequestMapping("/")
public class PatTypeController {

    @Autowired
    private PatTypeServeice patTypeServeice;

    /**
     * 查询所有的专利类型
     * @param model 视图对象，通过model对象可以向前台传值，作用相当于request对象
     * @return 返回收录工具列表页面
     */
    @RequestMapping("toPatTypeList.action")
    public String toPatTypeList(Model model){
        //将收录工具集合传到前台
        model.addAttribute("patTypeList",patTypeServeice.findPatTypeList());
        return "system/patType/patTypeList";
    }

    /**
     * 更新专利等级
     * @param patType 更新的专利等级对象，springMVC会根据input标签名自动对对象属性进行赋值
     * @param model 重定向视图对象，使用此对象在重定向中也能传值
     * @return 重定向到收录工具列表
     */
    @RequestMapping("updatePatType.action")
    public String updatePatType(PatType patType, RedirectAttributesModelMap model){
        try {
            patTypeServeice.updatePatType(patType);
        } catch (Exception e) {
            //异常处理，返回更新数据失败信息
            model.addFlashAttribute("exceptionMessage","更新数据异常");
            return "redirect:toPatTypeList.action";
        }
        return "redirect:toPatTypeList.action";
    }

}
