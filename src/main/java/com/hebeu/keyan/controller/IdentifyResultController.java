package com.hebeu.keyan.controller;

import com.hebeu.keyan.po.ProProjectType2;
import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.service.*;
import com.hebeu.keyan.utils.DateToString;
import com.hebeu.keyan.vo.IdentifyResultVO;
import com.hebeu.keyan.vo.PersonListVO;
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
 * 作者：冯嘉龙
 * 时间：2017/8/8  14:43
 * 描述：鉴定成果 相关控制器
 */
@Controller
@RequestMapping("/result/identifyResult/")
public class IdentifyResultController {
    private final BasicParameterService basicParameterService;
    private final PersonListService personListService;
    private final IdentifyResultService identifyResultService;
    private final CommonService commonService;

    @Autowired
    public IdentifyResultController(BasicParameterService basicParameterService, PersonListService personListService, IdentifyResultService identifyResultService, CommonService commonService) {
        this.basicParameterService = basicParameterService;
        this.personListService = personListService;
        this.identifyResultService = identifyResultService;
        this.commonService = commonService;
    }

    /**
     * 查看个人 鉴定成果 列表
     *
     * @return 返回 鉴定成果 列表页面
     */
    @RequestMapping("toIdentifyResultList.action")
    public String toIdentifyResultList(HttpSession session, Model model) {
        //从session中取到用户信息
        ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
        //System.out.println("当前登录用户为"+activeUser.getUserId());
        model.addAttribute("ds", new DateToString());
        model.addAttribute("identifyResultList", identifyResultService.findIdentifyResultListByWorkNum(activeUser.getUserId()));
        return "result/identifyResult/personalIdentifyResultList";
    }

    /**
     * 新增 鉴定成果 表单
     *
     * @return 跳转到新增 鉴定成果 表单
     */
    @RequestMapping("toAddIdentifyResult.action")
    public String toAddIdentifyResult(HttpSession session, Model model) {
        //从session中取到用户信息
        ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
        /*start：基础表参数设置，其中部分参数不需要在此设置，需要通过ajax异步请求方式来设置*/
        model.addAttribute("subjectTypeList", basicParameterService.findSubjectType());                 //学科门类
        model.addAttribute("idenResultLevelList", basicParameterService.findIdenResultLevel());          //成果级别
        model.addAttribute("idenFormList", basicParameterService.findIdenForm());                        //鉴定形式
        /*end：基础表参数设置*/
        //查询登录人的参与的所有项目（科研处审核通过的）
        model.addAttribute("allProjectList", commonService.findAllProjectByWorkNum(activeUser.getUserId()));
        model.addAttribute("collegeList", personListService.findECollege());   //学院
        return "result/identifyResult/personalIdentifyResultAdd";
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
        map.put("subjectFirstList", basicParameterService.findPerSubjectFirst(subjectTypeId));        //所属学科
        map.put("projectSourceList", basicParameterService.findProProjectSource(subjectTypeId));       //项目来源
        map.put("projectType1List", basicParameterService.findProProjectType1(subjectTypeId));         //项目类型1
        map.put("projectType2List", basicParameterService.findProProjectType2(subjectTypeId));         //项目类型2
        map.put("idenLevelList", basicParameterService.findIdenLevel(subjectTypeId));                  //鉴定水平
        return map;
    }

    /**
     * 通过ajax异步请求改变项目类型1更改时关联的项目类型2
     *
     * @param projectType1Id 项目类型1的编号
     * @return 返回对应的项目类型2集合
     */
    @RequestMapping("proProjectType1Change.action")
    @ResponseBody
    public List<ProProjectType2> proProjectType1Change(Integer projectType1Id) {
        return basicParameterService.findProProjectType2(projectType1Id);
    }

    /**
     * 新增：鉴定成果保存、提交
     *
     * @param identifyResultVO 鉴定成果 传值对象
     * @param personListVO     人员列表对象
     * @param select_else 隐藏输入框的值
     * @return 保存成功就重定向到 鉴定成果 列表，失败就返回 鉴定成果新增表单
     */
    @RequestMapping("insertIdentifyResult.action")
    public String insertIdentifyResult(IdentifyResultVO identifyResultVO, PersonListVO personListVO, String select_else, RedirectAttributesModelMap model) {
        System.out.println("人员列表对象为：" + personListVO);
        if (select_else != "") {
            identifyResultVO.setProjectName(select_else);
        }
        //将PersonListVO对象设置到bookResultVO对象中
        identifyResultVO.setPersonListVO(personListVO);
        //将personListVO转成集合后设置到bookResultVO对象中
        identifyResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        try {
            //调用处理业务插入鉴定成果信息到数据库中
            identifyResultService.insertIdentifyResult(identifyResultVO);
        } catch (Exception e) {
            e.printStackTrace();
            if ("插入数据失败".equals(e.getMessage())) {
                return "redirect:/result/identifyResult/toAddIdentifyResult.action";
            } else if ("输入的名称已存在，请重新输入".equals(e.getMessage())) {
                model.addFlashAttribute("exceptionMessage", "输入的名称已存在，请重新输入！");
                return "redirect:/result/identifyResult/toAddIdentifyResult.action";
            }
        }
        return "redirect:/result/identifyResult/toIdentifyResultList.action";
    }

    /**
     * 查看指定鉴定编号的鉴定成果详情
     *
     * @param identifyId 鉴定成果id
     * @return 返回到 鉴定成果 详情页面
     */
    @RequestMapping("toIdentifyResultInfo.action")
    public String toIdentifyResultInfo(Model model, String identifyId) {
        model.addAttribute("identifyResultInfo", identifyResultService.findIdentifyResultByIdentifyId(identifyId));    //鉴定成果详细信息
        model.addAttribute("personList", identifyResultService.findPersonListByIdentifyId(identifyId));                          //鉴定成果对应的人员列表
        model.addAttribute("ds", new DateToString());           //时间格式化对象
        return "result/identifyResult/personalIdentifyResultInfo";
    }

    /**
     * 编辑 鉴定成果 表单
     *
     * @param identifyId 鉴定成果编号
     * @return 跳转到编辑 鉴定成果 表单
     */
    @RequestMapping("toEditIdentifyResult.action")
    public String toEditIdentifyResult(HttpSession session, Model model, String identifyId,String editType) {
        //从session中取到用户信息
        ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
        /*start：基础表参数设置，其中部分参数不需要在此设置，需要通过ajax异步请求方式来设置*/
        model.addAttribute("identifyResultVO", identifyResultService.findIdentifyResultByIdentifyId(identifyId));    //查询指定id的鉴定成果
        model.addAttribute("subjectTypeList", basicParameterService.findSubjectType());                 //学科门类下拉框
        model.addAttribute("idenResultLevelList", basicParameterService.findIdenResultLevel());          //成果级别
        model.addAttribute("idenFormList", basicParameterService.findIdenForm());                        //鉴定形式
        Integer subjectTypeId = identifyResultService.findIdentifyResultByIdentifyId(identifyId).getSubjectTypeId();    //获取该鉴定成果的学科门类编号
        //以下为获取未改变学科门类时，各个下拉框的内容
        model.addAttribute("subjectFirstList", basicParameterService.findPerSubjectFirst(subjectTypeId));        //所属学科
        model.addAttribute("projectSourceList", basicParameterService.findProProjectSource(subjectTypeId));       //项目来源
        model.addAttribute("projectType1List", basicParameterService.findProProjectType1(subjectTypeId));         //项目类型1
        model.addAttribute("projectType2List", basicParameterService.findProProjectType2(subjectTypeId));         //项目类型2
        model.addAttribute("idenLevelList", basicParameterService.findIdenLevel(subjectTypeId));                  //鉴定水平
        /*end：基础表参数设置*/

        //查询登录人的参与的所有项目（科研处审核通过的）
        model.addAttribute("allProjectList", commonService.findAllProjectByWorkNum(activeUser.getUserId()));
        model.addAttribute("personList", identifyResultService.findPersonListByIdentifyId(identifyId));           //该鉴定成果的人员列表
        model.addAttribute("ds", new DateToString());    //时间格式化对象
        model.addAttribute("collegeList", personListService.findECollege());   //学院

        //判断编辑类型，如果为审核人编辑就进入到审核人编辑页面
        if("audit".equals(editType)){
            return "result/identifyResult/auditIdentifyResultEdit";
        }
        return "result/identifyResult/personalIdentifyResultEdit";
    }

    /**
     * 编辑：鉴定成果保存、提交
     *
     * @param identifyResultVO 鉴定成果 传值对象
     * @param personListVO     人员列表对象
     * @return 保存成功就重定向到 鉴定成果 列表，失败就返回 鉴定成果新增表单
     */
    @RequestMapping("updateIdentifyResult.action")
    public String updateIdentifyResult(IdentifyResultVO identifyResultVO, PersonListVO personListVO,RedirectAttributesModelMap model) {
        System.out.println("人员列表对象为：" + personListVO);
        //将PersonListVO对象设置到identifyResultVO对象中
        identifyResultVO.setPersonListVO(personListVO);
        //将personListVO转成集合后设置到identifyResultVO对象中
        identifyResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        try {
            identifyResultService.updateIdentifyResult(identifyResultVO);//调用处理业务更新鉴定成果信息到数据库中
        } catch (Exception e) {
            e.printStackTrace();
            if ("编辑数据失败".equals(e.getMessage())) {
                return "redirect:/result/identifyResult/toEditIdentifyResult.action?identifyId=" + identifyResultVO.getIdentifyId() + "";
            } else if ("输入的名称已存在，请重新输入".equals(e.getMessage())) {
                model.addFlashAttribute("exceptionMessage", "输入的名称已存在，请重新输入！");
                return "redirect:/result/identifyResult/toEditIdentifyResult.action?identifyId=" + identifyResultVO.getIdentifyId() + "";
            }
        }
        return "redirect:/result/identifyResult/toIdentifyResultInfo.action?identifyId=" + identifyResultVO.getIdentifyId() + "";
    }

    /**
     * 通过ajax来判断输入的validateName是否存在
     *
     * @param validateName 输入的 鉴定 名称
     * @param identifyId   鉴定成果编号
     * @return 返回true表示已存在，返回false表示不存在
     */
    @RequestMapping("identifyNameIsExisted.action")
    @ResponseBody  //表示这是ajax响应体
    public boolean identifyNameIsExisted(String validateName, String identifyId) {
        IdentifyResultVO identifyResultVO = new IdentifyResultVO();
        identifyResultVO.setProjectName(validateName);
        if(identifyId!=null){
            identifyResultVO.setIdentifyId(identifyId);
        }
        return identifyResultService.identifyNameIsExisted(identifyResultVO);
    }

    /**
     * 删除指定id的鉴定成果
     *
     * @param identifyId 鉴定成果id
     * @return 返回鉴定成果列表
     */
    @RequestMapping("deleteIdentifyResult.action")
    public String deleteIdentifyResult(String identifyId) {
        System.out.println(identifyId);
        try {
            identifyResultService.deleteIdentifyResultByIdentifyId(identifyId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/result/identifyResult/toIdentifyResultList.action";
    }
}
