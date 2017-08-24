package com.hebeu.keyan.controller;

import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.service.BasicParameterService;
import com.hebeu.keyan.service.PatentResultService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.utils.DateToString;
import com.hebeu.keyan.vo.PatentResultVO;
import com.hebeu.keyan.vo.PersonListVO;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/8/10.
 */
@Controller
@RequestMapping("/result/patentResult/")
public class PatentResultController {


    private PatentResultService patentResultService;
    private BasicParameterService basicParameterService;
    private PersonListService personListService;
    @Autowired
    public PatentResultController(PatentResultService patentResultService,BasicParameterService basicParameterService,PersonListService personListService){
        this.patentResultService = patentResultService;
        this.basicParameterService = basicParameterService;
        this.personListService = personListService;
    }
    @RequestMapping("PatentResultList.action")
    public String PatentResultList(HttpSession session, Model model){
        ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");

        model.addAttribute("ds", new DateToString());
        model.addAttribute("patentResultList",patentResultService.findPatentResultListByWorkNum(activeUser.getUserId()));
        return "result/patentResult/personalPatentResultList";
    }

    @RequestMapping("toAddPatentResult.action")
    public String toAddPatentResult(Model model){
        model.addAttribute("subjectTypeList",basicParameterService.findSubjectType());
        model.addAttribute("patTypeList",basicParameterService.findPatType());
        model.addAttribute("collegeList",personListService.findECollege());
        return "result/patentResult/personalPatentResultAdd";
    }


    @RequestMapping("subjectTypeChange.action")
    @ResponseBody
    public Map<String, List> subjectTypeChange(Integer subjectTypeId) {
        System.out.println("subjectTypeChange成功");
        Map<String, List> map = new HashMap<>();
        map.put("subjectFirstList", basicParameterService.findPerSubjectFirst(subjectTypeId));        //所属学科
        //map.put("bookTypeList", basicParameterService.findBookType(subjectTypeId));        //著作类型
        return map;
    }

    @ResponseBody
    @RequestMapping("patentNameIsExisted.action")
    public boolean patentNameIsExisted(String validateName,String patentId){
        PatentResultVO patentResultVO = new PatentResultVO();
        patentResultVO.setPatentName(validateName);
        if(patentId!=null){
            patentResultVO.setPatentId(patentId);
        }
        return patentResultService.patentNameIsExisted(patentResultVO);
    }

    @RequestMapping("insertPatentResult.action")
    public String insertPatentResult(PatentResultVO patentResultVO, PersonListVO personListVO, RedirectAttributesModelMap modelMap){
        System.out.println("进入insertPatentResult   Controller");
        patentResultVO.setPersonListVO(personListVO);
        patentResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        try {
            patentResultService.insertPatentResult(patentResultVO);
        } catch (Exception e) {
            e.printStackTrace();
            if ("插入数据失败".equals(e.getMessage())) {
                return "redirect:/result/patentResult/toAddPatentResult.action";
            }else if ("该专利成果名称已存在".equals(e.getMessage())) {
                modelMap.addFlashAttribute("exceptionMessage","输入的名称已存在，请重新输入！");
                return "redirect:/result/patentResult/toAddPatentResult.action";
            }
        }
        return "redirect:/result/patentResult/PatentResultList.action";
    }
    @RequestMapping("personalPatentResultInfo.action")
    public String patentResultInfo(Model model,String patentId){
        model.addAttribute("ds", new DateToString());
        model.addAttribute("personList",patentResultService.findPersonalListById(patentId));
        model.addAttribute("EPatentCustom",patentResultService.findPatentResultById(patentId));
        return "result/patentResult/personalPatentResultInfo";
    }
    @RequestMapping("toEditPatentResult.action")
    public String toEditPatentResult(String patentId,Model model,String editType){

        model.addAttribute("patentResult",patentResultService.findPatentResultById(patentId));
        Integer subjectTypeId = patentResultService.findPatentResultById(patentId).getSubjectTypeId();
        model.addAttribute("subjectFirstList",basicParameterService.findPerSubjectFirst(subjectTypeId)); //读取该学科门类编号对应的学科门类数据
        model.addAttribute("patentTypeList",basicParameterService.findPatType());
        model.addAttribute("subjectTypeList", basicParameterService.findSubjectType());

        model.addAttribute("personList",patentResultService.findPersonalListById(patentId));
        model.addAttribute("ds", new DateToString());    //时间格式化对象
        model.addAttribute("collegeList", personListService.findECollege());   //学院
        //审核时编辑
        if("audit".equals(editType)){
            return "result/patentResult/auditPatentResultEdit";
        }
        return "/result/patentResult/personalPatentResultEdit";
    }

    @RequestMapping("updatePatentResult.action")
    public String updatePatentResult(PatentResultVO patentResultVO,PersonListVO personListVO,RedirectAttributesModelMap modelMap){
        patentResultVO.setPersonListVO(personListVO);
        patentResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        try{
            patentResultService.updatePatentResult(patentResultVO);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            if("该专利成果名称已存在".equals(e.getMessage())){
                modelMap.addFlashAttribute("exceptionMessage","该专利成果名称已存在");
                return "redirect:/result/patentResult/toEditPatentResult.action?patentId="+patentResultVO.getPatentId();
            }else {
                return "redirect:/result/patentResult/toEditPatentResult.action?patentId="+patentResultVO.getPatentId();
            }
        }
        return "redirect:/result/patentResult/personalPatentResultInfo.action?patentId="+patentResultVO.getPatentId();
    }
    @RequestMapping("deletePatentResult.action")
    public String deletePatentResult(String patentId,RedirectAttributesModelMap modelMap){
        try {
            patentResultService.deletePatentResult(patentId);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("异常信息:"+e.getMessage());
            modelMap.addFlashAttribute("",e.getMessage());
        }
        return "redirect:/result/patentResult/PatentResultList.action";
    }
}
