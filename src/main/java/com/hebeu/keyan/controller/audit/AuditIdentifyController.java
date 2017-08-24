package com.hebeu.keyan.controller.audit;

import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.service.AuditService;
import com.hebeu.keyan.service.IdentifyResultService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.utils.DateToString;
import com.hebeu.keyan.vo.AuditObjectVo;
import com.hebeu.keyan.vo.IdentifyResultVO;
import com.hebeu.keyan.vo.PersonListVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者：陈德华
 * 时间：2017/8/24 11:02
 * 描述：鉴定成果审核控制器
 */
@Controller
@RequestMapping("/audit/")
public class AuditIdentifyController {
    private final AuditService auditService;
    private final PersonListService personListService;
    private final IdentifyResultService identifyResultService;

    @Autowired
    public AuditIdentifyController(AuditService auditService, PersonListService personListService, IdentifyResultService identifyResultService) {
        this.auditService = auditService;
        this.personListService = personListService;
        this.identifyResultService = identifyResultService;
    }

    /**
     * 查看鉴定成果审核列表
     * @param auditObjectVo 审核对象
     * @return 返回到鉴定成果审核列表
     */
    @RequestMapping("toIdentifyResultListAudit.action")
    public String toIdentifyResultListAudit(AuditObjectVo auditObjectVo, Model model){
        //主体
        Subject subject = SecurityUtils.getSubject();
        //从主体中取出身份信息
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        //如果有学院权限就只查询指定学院的项目集合
        if(subject.hasRole("collegeAdmin")){
            auditObjectVo.setCollegeId(activeUser.getUserInfo().getCollegeId2());  //设置审核人的学院
        }
        //按指定审核条件查询对应的鉴定成果集合
        model.addAttribute("identifyResultList",auditService.findIdentifyResultList(auditObjectVo));
        model.addAttribute("auditType",auditObjectVo.getAuditType());  //设置请求查看的审核状态
        model.addAttribute("ds",new DateToString());
        return "result/identifyResult/auditIdentifyResultList";
    }

    /** 提交鉴定成果审核
     * @param auditObjectVo 审核值对象
     * @return 重定向到待审核鉴定成果列表
     */
    @RequestMapping("submitIdentifyResultAudit.action")
    public String submitIdentifyResultAudit(AuditObjectVo auditObjectVo){
        auditService.updateIdentifyAuditStatus(auditObjectVo);
        return "redirect:/audit/toIdentifyResultListAudit.action?auditType=1";
    }

    /**
     * 查看鉴定成果详情
     * @param id 鉴定成果id
     * @param auditType 审核类型
     * @return 返回到鉴定成果详情页面
     */
    @RequestMapping("viewIdentifyResultInfo.action")
    public String viewIdentifyResultInfo(String id,Integer auditType,Model model){
        model.addAttribute("identifyResultInfo",identifyResultService.findIdentifyResultByIdentifyId(id));
        model.addAttribute("personList",identifyResultService.findPersonListByIdentifyId(id));
        model.addAttribute("ds",new DateToString());
        model.addAttribute("auditType",auditType);
        return "result/identifyResult/auditIdentifyResultInfo";
    }


    /**
     * 保存并审核鉴定成果
     * @param identifyResultVO 鉴定成果详情
     * @param personListVO 人员列表
     * @param auditObjectVo 审核对象
     * @return 重定向到鉴定成果列表
     */
    @RequestMapping("updateIdentifyResultAtAudit.action")
    public String updateIdentifyResultAtAudit(IdentifyResultVO identifyResultVO, PersonListVO personListVO, AuditObjectVo auditObjectVo){
        //将PersonListVO对象设置到identifyResultVO对象中
        identifyResultVO.setPersonListVO(personListVO);
        //将personListVO转成集合后设置到identifyResultVO对象中
        identifyResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        auditService.updateIdentify(identifyResultVO, auditObjectVo);
        return "redirect:/audit/toIdentifyResultListAudit.action?auditType=1";
    }

}
