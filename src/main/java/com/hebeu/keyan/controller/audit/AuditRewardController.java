package com.hebeu.keyan.controller.audit;

import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.service.AuditService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.service.RewardResultService;
import com.hebeu.keyan.utils.DateToString;
import com.hebeu.keyan.vo.AuditObjectVo;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.RewardResultVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者：陈德华
 * 时间：2017/8/24 11:02
 * 描述：获奖成果审核控制器
 */
@Controller
@RequestMapping("/audit/")
public class AuditRewardController {
    private final AuditService auditService;
    private final PersonListService personListService;
    private final RewardResultService rewardResultService;

    @Autowired
    public AuditRewardController(AuditService auditService, PersonListService personListService, RewardResultService rewardResultService) {
        this.auditService = auditService;
        this.personListService = personListService;
        this.rewardResultService = rewardResultService;
    }

    /**
     * 查看获奖成果审核列表
     * @param auditObjectVo 审核对象
     * @return 返回到获奖成果审核列表
     */
    @RequestMapping("toRewardResultListAudit.action")
    public String toRewardResultListAudit(AuditObjectVo auditObjectVo, Model model){
        //主体
        Subject subject = SecurityUtils.getSubject();
        //从主体中取出身份信息
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        //如果有学院权限就只查询指定学院的获奖成果集合
        if(subject.hasRole("collegeAdmin")){
            auditObjectVo.setCollegeId(activeUser.getUserInfo().getCollegeId2());  //设置审核人的学院
        }
        //按指定审核条件查询对应的获奖成果集合
        model.addAttribute("rewardResultList",auditService.findRewardResultList(auditObjectVo));
        model.addAttribute("auditType",auditObjectVo.getAuditType());  //设置请求查看的审核状态
        model.addAttribute("ds",new DateToString());                   //字符串格式化工具类
        return "result/rewardResult/auditRewardResultList";
    }

    /** 提交获奖成果审核
     * @param auditObjectVo 审核值对象
     * @return 重定向到待审核获奖成果列表
     */
    @RequestMapping("submitRewardResultAudit.action")
    public String submitRewardResultAudit(AuditObjectVo auditObjectVo){
        auditService.updateRewardAuditStatus(auditObjectVo);
        return "redirect:/audit/toRewardResultListAudit.action?auditType=1";
    }

    /**
     * 查看获奖成果详情
     * @param id 获奖成果id
     * @param auditType 审核类型
     * @return 返回到获奖成果详情页面
     */
    @RequestMapping("viewRewardResultInfo.action")
    public String viewRewardResultInfo(String id,Integer auditType,Model model){
        model.addAttribute("rewardResultInfo",rewardResultService.findRewardResultByRewardId(id));
        model.addAttribute("personList",rewardResultService.findPersonListByRewardId(id));
        model.addAttribute("ds",new DateToString());
        model.addAttribute("auditType",auditType);
        return "result/rewardResult/auditRewardResultInfo";
    }

    /**
     * 保存并审核获奖成果
     * @param rewardResultVO 获奖成果详情
     * @param personListVO 人员列表
     * @param auditObjectVo 审核对象
     * @return 重定向到获奖成果列表
     */
    @RequestMapping("updateRewardResultAtAudit.action")
    public String updateRewardResultAtAudit(RewardResultVO rewardResultVO, PersonListVO personListVO, AuditObjectVo auditObjectVo){
        //将PersonListVO对象设置到rewardResultVO对象中
        rewardResultVO.setPersonListVO(personListVO);
        //将personListVO转成集合后设置到rewardResultVO对象中
        rewardResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        auditService.updateReward(rewardResultVO, auditObjectVo);
        return "redirect:/audit/toRewardResultListAudit.action?auditType=1";
    }

}
