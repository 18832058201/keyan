package com.hebeu.keyan.controller.audit;

import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.service.AuditService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.service.SoftwareResultService;
import com.hebeu.keyan.utils.DateToString;
import com.hebeu.keyan.vo.AuditObjectVo;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.RewardResultVO;
import com.hebeu.keyan.vo.SoftwareResultVO;
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
public class AuditSoftwareController {
    private final AuditService auditService;
    private final PersonListService personListService;
    private final SoftwareResultService softwareResultService;

    @Autowired
    public AuditSoftwareController(AuditService auditService, PersonListService personListService, SoftwareResultService softwareResultService) {
        this.auditService = auditService;
        this.personListService = personListService;
        this.softwareResultService = softwareResultService;
    }


    /**
     * 查看软件成果审核列表
     * @param auditObjectVo 审核对象
     * @return 返回到软件成果审核列表
     */
    @RequestMapping("toSoftwareResultListAudit.action")
    public String toSoftwareResultListAudit(AuditObjectVo auditObjectVo, Model model){
        //主体
        Subject subject = SecurityUtils.getSubject();
        //从主体中取出身份信息
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        //如果有学院权限就只查询指定学院的软件成果集合
        if(subject.hasRole("collegeAdmin")){
            auditObjectVo.setCollegeId(activeUser.getUserInfo().getCollegeId2());  //设置审核人的学院
        }
        //按指定审核条件查询对应的软件成果集合
        model.addAttribute("softwareRltList",auditService.findSoftwareResultList(auditObjectVo));
        model.addAttribute("auditType",auditObjectVo.getAuditType());  //设置请求查看的审核状态
        model.addAttribute("ds",new DateToString());                   //字符串格式化工具类
        return "result/softwareResult/auditSoftwareResultList";
    }

    /** 提交软件成果审核
     * @param auditObjectVo 审核值对象
     * @return 重定向到待审核软件成果列表
     */
    @RequestMapping("submitSoftwareResultAudit.action")
    public String submitSoftwareResultAudit(AuditObjectVo auditObjectVo){
        auditService.updateSoftwareAuditStatus(auditObjectVo);
        return "redirect:/audit/toSoftwareResultListAudit.action?auditType=1";
    }

    /**
     * 查看软件成果详情
     * @param id 软件成果id
     * @param auditType 审核类型
     * @return 返回到软件成果详情页面
     */
    @RequestMapping("viewSoftwareResultInfo.action")
    public String viewSoftwareResultInfo(String id,Integer auditType,Model model){
        model.addAttribute("softwareResultInfo",softwareResultService.findSoftwareResult(id));
        model.addAttribute("personList",softwareResultService.findPersonListBySoftwareId(id));
        model.addAttribute("ds",new DateToString());
        model.addAttribute("auditType",auditType);
        return "result/softwareResult/auditSoftwareResultInfo";
    }

    /**
     * 保存并审核软件成果
     * @param softwareResultVO 软件成果详情
     * @param personListVO 人员列表
     * @param auditObjectVo 审核对象
     * @return 重定向到软件成果列表
     */
    @RequestMapping("updateSoftwareResultAtAudit.action")
    public String updateSoftwareResultAtAudit(SoftwareResultVO softwareResultVO, PersonListVO personListVO, AuditObjectVo auditObjectVo){
        //将PersonListVO对象设置到softwareResultVO对象中
        softwareResultVO.setPersonListVO(personListVO);
        //将personListVO转成集合后设置到softwareResultVO对象中
        softwareResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        auditService.updateSoftware(softwareResultVO, auditObjectVo);
        return "redirect:/audit/toSoftwareResultListAudit.action?auditType=1";
    }

}
