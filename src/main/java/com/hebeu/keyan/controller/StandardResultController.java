package com.hebeu.keyan.controller;

import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.service.BasicParameterService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.service.StandardResultService;
import com.hebeu.keyan.utils.DateToString;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.StandardResultVO;
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
 * 作者：张彤
 * 时间：2017/8/11 17:40
 * 描述：标准管理的控制器
 */
@Controller
@RequestMapping("/result/standardResult/")
public class StandardResultController {

    @Autowired
    private StandardResultService standardResultService;
    @Autowired
    private PersonListService personListService;
    @Autowired
    private BasicParameterService basicParameterService;

    /**
     * 查看个人标准管理的列表
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/standardResultList.action")
    public String standardResultList(HttpSession session, Model model){
        //从session中获取用户信息
        ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
        //System.out.println("当前登录用户为："+ activeUser.getUsername());
        model.addAttribute("ds",new DateToString());
        model.addAttribute("standardList", standardResultService.findStandardListByWorkNum(activeUser.getUserId()));
        return "result/standardResult/personalStandardResultList";
    }

    /**
     * 新增标准管理表单
     * @param model
     * @return
     */
    @RequestMapping("toAddStandardResult.action")
    public String toAddStandardResult(Model model){
        /*start：基础表参数设置，其中部分参数不需要在此设置，需要通过ajax异步请求方式来设置*/
        model.addAttribute("standStateList", basicParameterService.findStandState());  //标准状态
        model.addAttribute("subjectTypeList", basicParameterService.findSubjectType());  //学科门类
        model.addAttribute("standObjectList", basicParameterService.findStandObject());  //对象分类
        model.addAttribute("standBusinessList", basicParameterService.findStandBusiness());  //行业分类
        model.addAttribute("standTypeList", basicParameterService.findStandType());  //标准类型
        /*end：基础表参数设置*/
        model.addAttribute("collegeList", personListService.findECollege()); //学院
        return "result/standardResult/personalStandardResultAdd";
    }

    /**
     * 通过ajax异步请求改变学科门类时更改与其关联的项
     *
     * @param subjectTypeId 学科门类编号
     * @return 返回存放与学科门类相关联的map集合
     */
    @RequestMapping("subjectTypeChange.action")
    @ResponseBody
    public Map<String, List> subjectTypeChange(Integer subjectTypeId) {
        Map<String, List> map = new HashMap<>();
        map.put("subjectFirstList", basicParameterService.findPerSubjectFirst(subjectTypeId));  //所属学科
        return map;
    }

    /**
     * 新增：标准管理保存、提交
     * @param standardResultVO 著作成果 传值对象
     * @param personListVO 人员列表对象
     * @return 保存成功就重定向到标准管理列表，失败就返回标准管理新增表单
     */
    @RequestMapping("insertStandardResult.action")
    public String insertStandardResult(StandardResultVO standardResultVO, PersonListVO personListVO, RedirectAttributesModelMap model) {
        //将PersonListVO对象设置到bookResultVO对象中
        standardResultVO.setPersonListVO(personListVO);
        //将personListVO转成集合后设置到bookResultVO对象中
        standardResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        try {
            standardResultService.insertStandardResult(standardResultVO); //调用插入方法
        } catch (Exception e) {
            //e.printStackTrace();
            if ("插入数据失败".equals(e.getMessage())) {
                return "redirect:/result/standardResult/toAddStandardResult.action";
            }else if ("该著作成果名称已存在".equals(e.getMessage())) {
                model.addFlashAttribute("exceptionMessage","输入的名称已存在，请重新输入！");
                return "redirect:/result/standardResult/toAddStandardResult.action";
            }
        }
        return "redirect:/result/standardResult/standardResultList.action";
    }

    /**
     * 查看指定标准管理的详情信息
     *
     * @param standardId 标准管理id
     * @return 返回到标准管理详情页面
     */
    @RequestMapping("personalStandardResultInfo.action")
    public String personalStandardResultInfo(Model model, String standardId) {
        model.addAttribute("standardResultInfo", standardResultService.findStandardResultById(standardId));  //标准管理详细信息
        model.addAttribute("personList", standardResultService.findPersonListByStandardId(standardId));  //标准管理对应的人员列表
        model.addAttribute("ds", new DateToString());    //时间格式化对象
        return "result/standardResult/personalStandardResultInfo";
    }

    /**
     * 编辑标准管理的表单
     *
     * @return 跳转到编辑标准管理表单
     */
    @RequestMapping("toEditStandardResult.action")
    public String toEditStandardResult(Model model,String standardId,String editType) {
        /*start：基础表参数设置，其中部分参数不需要在此设置，需要通过ajax异步请求方式来设置*/
        model.addAttribute("standardResultVO",standardResultService.findStandardResultById(standardId));  //按照standardId查出标准管理对象
        model.addAttribute("standStateList", basicParameterService.findStandState());  //标准状态
        model.addAttribute("subjectTypeList", basicParameterService.findSubjectType());  //学科门类
        Integer subjectTypeId = standardResultService.findStandardResultById(standardId).getSubjectTypeId();  //获得该标准管理对象的学科门类编号
        model.addAttribute("subjectFirstList",basicParameterService.findPerSubjectFirst(subjectTypeId));  //读取该学科门类编号对应的学科门类数据
        model.addAttribute("standObjectList", basicParameterService.findStandObject());  //对象分类
        model.addAttribute("standBusinessList", basicParameterService.findStandBusiness());  //行业分类
        model.addAttribute("standTypeList", basicParameterService.findStandType());  //标准类型
        /*end：基础表参数设置*/
        model.addAttribute("personList",standardResultService.findPersonListByStandardId(standardId));  //该著作成果的人员列表
        model.addAttribute("ds", new DateToString());  //时间格式化对象
        model.addAttribute("collegeList", personListService.findECollege());  //学院
        //审核时编辑
        if("audit".equals(editType)){
            return "result/standardResult/auditStandardResultEdit";
        }
        return "result/standardResult/personalStandardResultEdit";
    }

    /**
     * 编辑：著作成果保存、提交
     * @param standardResultVO 标准管理传值对象
     * @param personListVO 人员列表对象
     * @return 保存成功就重定向到标准管理的列表，失败就返回标准管理的新增表单
     */
    @RequestMapping("updateStandardResult.action")
    public String updateStandardResult(StandardResultVO standardResultVO, PersonListVO personListVO, RedirectAttributesModelMap model) {
        System.out.println("人员列表对象为：" + personListVO);
        //将PersonListVO对象设置到bookResultVO对象中
        standardResultVO.setPersonListVO(personListVO);
        //将personListVO转成集合后设置到bookResultVO对象中
        standardResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        try {
            standardResultService.updateStandardResult(standardResultVO);//调用更新方法
        } catch (Exception e) {
            e.printStackTrace();
            if ("编辑数据失败".equals(e.getMessage())) {
                return "redirect:/result/standardResult/toEditStandardResult.action?standardId=" + standardResultVO.getStandardId() + "";
            }else if ("该著作成果名称已存在".equals(e.getMessage())) {
                model.addFlashAttribute("exceptionMessage","输入的名称已存在，请重新输入！");
                return "redirect:/result/standardResult/toEditStandardResult.action?standardId=" + standardResultVO.getStandardId() + "";
            }
        }
        return "redirect:/result/standardResult/personalStandardResultInfo.action?standardId=" + standardResultVO.getStandardId() + "";
    }

    /**
     * 通过ajax来判断输入的standNumber是否存在
     * @param validateName 输入的标准号
     * @param standardId 著作成果编号
     * @return 返回true表示已存在，返回false表示不存在
     */
    @RequestMapping("standNumberIsExisted.action")
    @ResponseBody  //表示这是ajax响应体
    public boolean standNumberIsExisted(String validateName,String standardId){
        StandardResultVO standardResultVO = new StandardResultVO();
        standardResultVO.setStandNumber(validateName);
        if (standardId != null){
            standardResultVO.setStandardId(standardId);
        }
        return standardResultService.standNumberIsExisted(standardResultVO);
    }

    /**
     * 删除指定id的标准管理
     * @param standardId 著作成果id
     * @return 返回著作成果列表
     */
    @RequestMapping("deleteStandardResult.action")
    public String deleteStandardResult(String standardId){
        try {
            standardResultService.deleteStandardResultByStandardId(standardId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/result/standardResult/standardResultList.action";
    }
}
