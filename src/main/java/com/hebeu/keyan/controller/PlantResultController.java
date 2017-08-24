package com.hebeu.keyan.controller;

import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.service.BasicParameterService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.service.PlantResultService;
import com.hebeu.keyan.utils.DateToString;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.PlantResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.servlet.http.HttpSession;

/**
 * 作者：张程
 * 时间：2017/8/20  10:11
 * 描述：动植物新品种Controller
 */
@Controller
@RequestMapping("result/plantResult/")
public class PlantResultController {

    @Autowired
    private PlantResultService plantResultService;
    @Autowired
    private BasicParameterService basicParameterService;
    @Autowired
    private PersonListService personListService;

    @RequestMapping("plantResultList.action")
    public String plantResultList(Model model, HttpSession session){
        ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
        model.addAttribute("ds", new DateToString());
        model.addAttribute("plantResultList", plantResultService.findPlantResultListByWorkNum(activeUser.getUserId()));
        return "/result/plantResult/personalPlantResultList";
    }

    @RequestMapping("toAddPlantResult.action")
    public String toAddPlantResult(Model model){
        model.addAttribute("plantGradeList",basicParameterService.findPlantGrade());//品种级别
        model.addAttribute("plantTypeList",basicParameterService.findPlantType());//生物种类
        model.addAttribute("plantGenusList",basicParameterService.findPlantGenus());
        model.addAttribute("subjectTypeList", basicParameterService.findSubjectType());
        model.addAttribute("collegeList", personListService.findECollege());
        return "/result/plantResult/personalPlantResultAdd";
    }
    @RequestMapping("insertPlantResult.action")
    public String insertPlantResult(PlantResultVO plantResultVO, PersonListVO personListVO, RedirectAttributesModelMap modelMap){
        plantResultVO.setPersonListVO(personListVO);
        plantResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        try {
            plantResultService.insertPlantResult(plantResultVO);
        }catch (Exception e){
            e.printStackTrace();
            if("该动植物名称已存在".equals(e.getMessage())){
                modelMap.addFlashAttribute("exceptionMessage",e.getMessage());
                return "redirect:/result/plantResult/toAddPlantResult.action";
            } else{
                return "redirect:/result/plantResult/toAddPlantResult.action";
            }
        }
        return "redirect:/result/plantResult/plantResultList.action";
    }
    @RequestMapping("PlantResultInfo.action")
    public String personalPlantResultInfo(String plantId,Model model){
        model.addAttribute("plantResult",plantResultService.findPlantResultById(plantId));
        model.addAttribute("personList",plantResultService.findPersonListByPlantId(plantId));
        model.addAttribute("ds", new DateToString());
        System.out.println("什么意思？");
        return "/result/plantResult/personalPlantResultInfo";
    }
    @RequestMapping("toEditPlantResult.action")
    public String toEditPlantResult(String plantId,Model model,String editType){
        model.addAttribute("plantResult",plantResultService.findPlantResultById(plantId));
        model.addAttribute("subjectTypeList",basicParameterService.findSubjectType());
        model.addAttribute("plantGradeList",basicParameterService.findPlantGrade());
        model.addAttribute("plantTypeList",basicParameterService.findPlantType());
        model.addAttribute("plantGenusList",basicParameterService.findPlantGenus());
        model.addAttribute("personList",plantResultService.findPersonListByPlantId(plantId));
        model.addAttribute("ds", new DateToString());
        //审核时编辑
        if("audit".equals(editType)){
            return "result/plantResult/auditPlantResultEdit";
        }
        return "/result/plantResult/personalPlantResultEdit";
    }

    @RequestMapping("updatePlantResult.action")
    public String updatePlantResult(PlantResultVO plantResultVO,PersonListVO personListVO,RedirectAttributesModelMap modelMap){
        plantResultVO.setPersonListVO(personListVO);
        plantResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        try {
            plantResultService.updatePlantResult(plantResultVO);
        }catch (Exception e){
            e.printStackTrace();
            if("该动植物名称已存在".equals(e.getMessage())){
                modelMap.addFlashAttribute("exceptionMessage","该动植物名称已存在");
                return "redirect:/result/plantResult/toEditPlantResult.action?plantId="+plantResultVO.getPlantId()+"";
            }else {
                return "redirect:/result/plantResult/toEditPlantResult.action?plantId=" + plantResultVO.getPlantId()+"";
            }
        }
        System.out.println("没有异常");
        return "redirect:/result/plantResult/PlantResultInfo.action?plantId=" + plantResultVO.getPlantId()+"";
    }

    @RequestMapping("deletePlantResult.action")
    public String deletePlantResult(String plantId){
        try{
            plantResultService.deleteBookResultByPlantId(plantId);
        }catch (Exception e){
            e.printStackTrace();
            return "redirect:/result/plantResult/plantResultList.action";
        }
        return "redirect:/result/plantResult/plantResultList.action";
    }

    @ResponseBody
    @RequestMapping("plantNameIsExisted.action")
    public boolean plantNameIsExisted(String validateName,String plantId){
        PlantResultVO plantResultVO = new PlantResultVO();
        plantResultVO.setPlantName(validateName);
        if(plantId!=null){
            plantResultVO.setPlantId(plantId);
        }
        return plantResultService.plantNameIsExisted(plantResultVO);
    }
}
