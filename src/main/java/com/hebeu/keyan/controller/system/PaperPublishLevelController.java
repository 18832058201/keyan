package com.hebeu.keyan.controller.system;

import com.hebeu.keyan.po.PaperPublishLevel;
import com.hebeu.keyan.service.PaperPublishLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

/**
 * 作者：张彤
 * 时间：2017/8/1 20:49
 * 描述：刊物等级控制器
 */
@Controller
@RequestMapping("/")
public class PaperPublishLevelController {

    @Autowired
    private PaperPublishLevelService paperPublishLevelService;

    /**
     * 查询所有的刊物等级
     * @param model 视图对象，通过model对象可以向前台传值，作用相当于request对象
     * @return 返回成果级别列表页面
     */
    @RequestMapping("toPaperPublishLevelList.action")
    public String toPaperPublishLevelList(Model model){
        //把成果级别集合传给前台
        model.addAttribute("paperPublishLevelList", paperPublishLevelService.findPaperPublishLevelList());
        return "system/paperPublishLevel/paperPublishLevelList";
    }

    /**
     * 更新刊物等级
     * @param paperPublishLevel 更新的刊物等级对象，springMVC会根据input标签名自动对对象属性进行赋值
     * @param model 重定向视图对象，使用此对象在重定向中也能传值
     * @return 重定向到成果级别列表
     */
    @RequestMapping("updatePaperPublishLevel.action")
    public String updatePaperPublishLevel(PaperPublishLevel paperPublishLevel, RedirectAttributesModelMap model){
        try {
            paperPublishLevelService.updataPaperPublishLevel(paperPublishLevel);
        } catch (Exception e) {
            //异常处理，返回更新数据失败信息
            if (e.getMessage().equals("更新数据异常")) {
                model.addFlashAttribute("exceptionMessage","更新数据异常");
                return "redirect:toPaperPublishLevel.action";
            } else if(e.getMessage().equals("该刊物等级已存在")){
                model.addFlashAttribute("exceptionMessage","该刊物等级已存在，更新失败");
                return "redirect:toPaperPublishLevelList.action";
            }
        }
        return "redirect:toPaperPublishLevelList.action";
    }

    /**
     * 插入刊物等级
     * @param paperPublishLevel 刊物等级对象，springMVC会根据input标签名自动对对象属性进行赋值
     * @param model 重定向视图对象，使用此对象在重定向中也能传值
     * @return 重定向到成果级别列表
     */
    @RequestMapping("insertPaperPublishLevel.action")
    public String insertPaperPublishLevel(PaperPublishLevel paperPublishLevel, RedirectAttributesModelMap model){
        try {
            paperPublishLevelService.insertPaperPublishLevel(paperPublishLevel);
        } catch (Exception e) {
            //异常处理，返回更新数据失败信息
            if (e.getMessage().equals("更新数据异常")) {
                model.addFlashAttribute("exceptionMessage","更新数据异常");
                return "redirect:toPaperPublishLevel.action";
            } else if (e.getMessage().equals("该刊物等级已存在")){
                model.addFlashAttribute("exceptionMessage","该刊物等级已存在,插入失败");
                return "redirect:toPaperPublishLevelList.action";
            }
        }
        return "redirect:toPaperPublishLevelList.action";
    }

    /**
     * 判断刊物等级的名称是否存在
     * @param validateName 输入的刊物等级名称
     * @return 返回true表示已存在，返回false表示不存在
     */
    @RequestMapping("publishLevelNameIsExisted.action")
    @ResponseBody   //返回json格式的数据
    public boolean publishLevelNameIsExisted(String validateName){
        return paperPublishLevelService.findPublishLevelNameIsExistedInsert(validateName);
    }
}
