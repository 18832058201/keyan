package com.hebeu.keyan.controller;

import com.hebeu.keyan.po.RewFinishWay;
import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.service.*;
import com.hebeu.keyan.utils.DateToString;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.RewardResultVO;
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
 * 时间：2017/8/9  18:47
 * 描述：获奖成果 相关控制器
 */
@Controller
@RequestMapping("/result/rewardResult/")
public class RewardResultController {
    private final BasicParameterService basicParameterService;
    private final PersonListService personListService;
    private final RewardResultService rewardResultService;

    @Autowired
    public RewardResultController(BasicParameterService basicParameterService, PersonListService personListService, RewardResultService rewardResultService) {
        this.basicParameterService = basicParameterService;
        this.personListService = personListService;
        this.rewardResultService = rewardResultService;
    }

    /**
     * 查看个人 获奖成果 列表
     *
     * @return 返回 获奖成果 列表页面
     */
    @RequestMapping("toRewardResultList.action")
    public String toRewardResultList(HttpSession session, Model model) {
        //从session中取到用户信息
        ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
        //System.out.println("当前登录用户为"+activeUser.getUserId());
        model.addAttribute("ds", new DateToString());
        model.addAttribute("rewardResultList", rewardResultService.findRewardResultListByWorkNum(activeUser.getUserId()));
        return "result/rewardResult/personalRewardResultList";
    }

    /**
     * 新增 获奖成果 表单
     *
     * @return 跳转到新增 获奖成果 表单
     */
    @RequestMapping("toAddRewardResult.action")
    public String toAddRewardResult(HttpSession session, Model model) {
        //从session中取到用户信息
        ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
        /*start：基础表参数设置，其中部分参数不需要在此设置，需要通过ajax异步请求方式来设置*/
        model.addAttribute("subjectTypeList", basicParameterService.findSubjectType());                 //学科门类
        model.addAttribute("rewLevelList", basicParameterService.findRewLevel());                       //奖励级别
        model.addAttribute("rewGradeList", basicParameterService.findRewGrade());                       //奖励等级
        model.addAttribute("signList",basicParameterService.findPubSign());                             //署名情况
        /*end：基础表参数设置*/
        model.addAttribute("collegeList", personListService.findECollege());   //学院
        return "result/rewardResult/personalRewardResultAdd";
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
        map.put("resultTypeList", basicParameterService.findRewResultType(subjectTypeId));            //成果类别
        map.put("rewTypeList", basicParameterService.findRewType(subjectTypeId));                     //获奖名称
        map.put("rewClassList", basicParameterService.findRewClass(subjectTypeId));                   //奖励类别
        return map;
    }

    /**
     * 通过ajax异步请求改变奖励级别更改时关联的完成形式
     * @param rewLevelId  奖励级别的编号
     * @return  返回对应的完成形式集合
     */
    @RequestMapping("rewLevelChange.action")
    @ResponseBody
    public List<RewFinishWay> rewLevelChange(Integer rewLevelId){
        return basicParameterService.findRewFinishWay(rewLevelId);
    }

    /**
     * 新增：获奖成果保存、提交
     *
     * @param rewardResultVO 获奖成果 传值对象
     * @param personListVO   人员列表对象
     * @return 保存成功就重定向到 获奖成果 列表，失败就返回 获奖成果新增表单
     */
    @RequestMapping("insertRewardResult.action")
    public String insertRewardResult(RewardResultVO rewardResultVO, PersonListVO personListVO, RedirectAttributesModelMap model) {
        System.out.println("人员列表对象为：" + personListVO);
        //将PersonListVO对象设置到bookResultVO对象中
        rewardResultVO.setPersonListVO(personListVO);
        //将personListVO转成集合后设置到bookResultVO对象中
        rewardResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        try {
            //调用处理业务插入获奖成果信息到数据库中
            rewardResultService.insertRewardResult(rewardResultVO);
        } catch (Exception e) {
            e.printStackTrace();
            if ("插入数据失败".equals(e.getMessage())) {
                return "redirect:/result/rewardResult/toAddRewardResult.action";
            } else if ("输入的名称已存在，请重新输入".equals(e.getMessage())) {
                model.addFlashAttribute("exceptionMessage", "输入的名称已存在，请重新输入！");
                return "redirect:/result/rewardResult/toAddRewardResult.action";
            }
        }
        return "redirect:/result/rewardResult/toRewardResultList.action";
    }

    /**
     * 查看指定获奖编号的获奖成果详情
     *
     * @param rewardId 获奖成果id
     * @return 返回到 获奖成果 详情页面
     */
    @RequestMapping("toRewardResultInfo.action")
    public String toRewardResultInfo(Model model, String rewardId) {
        model.addAttribute("rewardResultInfo", rewardResultService.findRewardResultByRewardId(rewardId));    //获奖成果详细信息
        model.addAttribute("personList", rewardResultService.findPersonListByRewardId(rewardId));            //获奖成果对应的人员列表
        model.addAttribute("ds", new DateToString());           //时间格式化对象
        return "result/rewardResult/personalRewardResultInfo";
    }

    /**
     * 编辑 获奖成果 表单
     *
     * @param rewardId 获奖成果编号
     * @return 跳转到编辑 获奖成果 表单
     */
    @RequestMapping("toEditRewardResult.action")
    public String toEditRewardResult(HttpSession session, Model model, String rewardId,String editType) {
        //从session中取到用户信息
        ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
        /*start：基础表参数设置，其中部分参数不需要在此设置，需要通过ajax异步请求方式来设置*/
        model.addAttribute("rewardResultVO", rewardResultService.findRewardResultByRewardId(rewardId));    //查询指定id的获奖成果
        model.addAttribute("subjectTypeList", basicParameterService.findSubjectType());                 //学科门类
        model.addAttribute("rewLevelList", basicParameterService.findRewLevel());                       //奖励级别
        model.addAttribute("rewGradeList", basicParameterService.findRewGrade());                       //奖励等级
        model.addAttribute("signList",basicParameterService.findPubSign());                             //署名情况
        Integer subjectTypeId = rewardResultService.findRewardResultByRewardId(rewardId).getSubjectTypeId();    //获取该获奖成果的学科门类编号
        //以下为获取未改变学科门类时，各个下拉框的内容
        model.addAttribute("subjectFirstList", basicParameterService.findPerSubjectFirst(subjectTypeId));        //所属学科
        model.addAttribute("resultTypeList", basicParameterService.findRewResultType(subjectTypeId));            //成果类别
        model.addAttribute("rewTypeList", basicParameterService.findRewType(subjectTypeId));                     //获奖名称
        model.addAttribute("rewClassList", basicParameterService.findRewClass(subjectTypeId));                   //奖励类别
        //以下为获取未改变奖励级别时，各个下拉框的内容
        model.addAttribute("finishWayList",basicParameterService.findRewFinishWay(rewardResultService.findRewardResultByRewardId(rewardId).getRewLevelId()));   //完成方式
        /*end：基础表参数设置*/
        model.addAttribute("personList", rewardResultService.findPersonListByRewardId(rewardId));           //该获奖成果的人员列表
        model.addAttribute("ds", new DateToString());    //时间格式化对象
        model.addAttribute("collegeList", personListService.findECollege());   //学院

        //审核时编辑
        if("audit".equals(editType)){
            return "result/rewardResult/auditRewardResultEdit";
        }
        return "result/rewardResult/personalRewardResultEdit";
    }

    /**
     * 编辑：鉴定成果保存、提交
     *
     * @param rewardResultVO 鉴定成果 传值对象
     * @param personListVO     人员列表对象
     * @return 保存成功就重定向到 鉴定成果 列表，失败就返回 鉴定成果新增表单
     */
    @RequestMapping("updateRewardResult.action")
    public String updateRewardResult(RewardResultVO rewardResultVO, PersonListVO personListVO,RedirectAttributesModelMap model) {
        System.out.println("人员列表对象为：" + personListVO);
        //将PersonListVO对象设置到identifyResultVO对象中
        rewardResultVO.setPersonListVO(personListVO);
        //将personListVO转成集合后设置到identifyResultVO对象中
        rewardResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        try {
            rewardResultService.updateRewardResult(rewardResultVO);//调用处理业务更新鉴定成果信息到数据库中
        } catch (Exception e) {
            e.printStackTrace();
            if ("编辑数据失败".equals(e.getMessage())) {
                return "redirect:/result/rewardResult/toEditRewardResult.action?rewardId=" + rewardResultVO.getRewardId() + "";
            } else if ("输入的名称已存在，请重新输入".equals(e.getMessage())) {
                model.addFlashAttribute("exceptionMessage", "输入的名称已存在，请重新输入！");
                return "redirect:/result/rewardResult/toEditRewardResult.action?rewardId=" + rewardResultVO.getRewardId() + "";
            }
        }
        return "redirect:/result/rewardResult/toRewardResultInfo.action?rewardId=" + rewardResultVO.getRewardId() + "";
    }

    /**
     * 通过ajax来判断输入的validateName是否存在
     *
     * @param validateName 输入的 鉴定 名称
     * @param rewardId   鉴定成果编号
     * @return 返回true表示已存在，返回false表示不存在
     */
    @RequestMapping("rewardNameIsExisted.action")
    @ResponseBody  //表示这是ajax响应体
    public boolean rewardNameIsExisted(String validateName, String rewardId) {
        RewardResultVO rewardResultVO = new RewardResultVO();
        rewardResultVO.setResultName(validateName);
        if(rewardId!=null){
            rewardResultVO.setRewardId(rewardId);
        }
        return rewardResultService.rewardNameIsExisted(rewardResultVO);
    }

    /**
     * 删除指定id的鉴定成果
     *
     * @param rewardId 鉴定成果id
     * @return 返回鉴定成果列表
     */
    @RequestMapping("deleteRewardResult.action")
    public String deleteRewardResult(String rewardId) {
        System.out.println(rewardId);
        try {
            rewardResultService.deleteRewardResultByRewardId(rewardId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/result/rewardResult/toRewardResultList.action";
    }
}
