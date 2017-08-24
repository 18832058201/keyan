package com.hebeu.keyan.controller.system;

import com.hebeu.keyan.po.IdenResultLevel;
import com.hebeu.keyan.service.IdenResultLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

/**
 * 作者：张彤
 * 时间：2017/8/1 9:54
 * 描述：成果级别控制器
 */
@Controller
@RequestMapping("/")
public class IdenResultLevelController {

    @Autowired
    private IdenResultLevelService idenResultLevelService;

    /**
     * 查询所有的成果级别
     * @param model 视图对象，通过model对象可以向前台传值，作用相当于request对象
     * @return 返回成果级别列表页面
     */
    @RequestMapping("toIdenResultLevelList.action")
    public String toIdenResultLevelList(Model model){
        //把成果级别集合传给前台
        model.addAttribute("idenResultLevelList", idenResultLevelService.findIdenResultLevelList());
        return "system/idenResultLevel/idenResultLevelList";
    }

    /**
     * 更新成果级别
     * @param idenResultLevel 更新的成果级别对象，springMVC会根据input标签名自动对对象属性进行赋值
     * @param model 重定向视图对象，使用此对象在重定向中也能传值
     * @return 重定向到成果级别列表
     */
    @RequestMapping("updateIdenResultLevel.action")
    public String updateIdenResultLevel(IdenResultLevel idenResultLevel, RedirectAttributesModelMap model){
        try {
            idenResultLevelService.updataIdenResultLevel(idenResultLevel);
        } catch (Exception e) {
            //异常处理，返回更新数据失败信息
            if (e.getMessage().equals("更新数据异常")) {
                model.addFlashAttribute("exceptionMessage","更新数据异常");
                return "redirect:toIdenResultLevelList.action";
            } else if (e.getMessage().equals("该成果级别已存在")){
                model.addFlashAttribute("exceptionMessage","该成果级别已存在，更新失败");
                return "redirect:toIdenResultLevelList.action";
            }
        }
        return "redirect:toIdenResultLevelList.action";
    }

    /**
     * 插入成果级别
     * @param idenResultLevel 成果级别对象，springMVC会根据input标签名自动对对象属性进行赋值
     * @param model 重定向视图对象，使用此对象在重定向中也能传值
     * @return 重定向到成果级别列表
     */
    @RequestMapping("insertIdenResultLevel.action")
    public String insertIdenResultLevel(IdenResultLevel idenResultLevel, RedirectAttributesModelMap model){
        try {
            idenResultLevelService.insertIdenResultLevel(idenResultLevel);
        } catch (Exception e) {
            //异常处理，返回更新数据失败信息
            if (e.getMessage().equals("插入数据异常")) {
                model.addFlashAttribute("exceptionMessage","插入数据异常");
                return "redirect:toIdenResultLevelList.action";
            } else if (e.getMessage().equals("该成果级别已存在")) {
                model.addFlashAttribute("exceptionMessage", "该成果级别已存在，插入失败");
                return "redirect:toIdenResultLevelList.action";
            }
        }
        return "redirect:toIdenResultLevelList.action";
    }

    /**
     * 插入：判断成果级别的名称是否存在
     * @param validateName 输入的成果级别名称
     * @return 返回true表示已存在，返回false表示不存在
     */
    @RequestMapping("resultLevelNameIsExisted.action")
    @ResponseBody   //返回json格式的数据
    public boolean resultLevelNameIsExisted(String validateName){
        return idenResultLevelService.findResultLevelNameIsExistedInsert(validateName);
    }
}
