package com.hebeu.keyan.controller.audit;

import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.service.AuditService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.service.StandardResultService;
import com.hebeu.keyan.utils.DateToString;
import com.hebeu.keyan.vo.AuditObjectVo;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.StandardResultVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者：陈德华
 * 时间：2017/8/24 11:02
 * 描述：标准管理成果审核控制器
 */
@Controller
@RequestMapping("/audit/")
public class AuditStandardController {
    private final AuditService auditService;
    private final PersonListService personListService;
    private final StandardResultService standardResultService;

    @Autowired
    public AuditStandardController(AuditService auditService, PersonListService personListService, StandardResultService standardResultService) {
        this.auditService = auditService;
        this.personListService = personListService;
        this.standardResultService = standardResultService;
    }

    /**
     * 查看标准管理成果审核列表
     * @param auditObjectVo 审核对象
     * @return 返回到标准管理成果审核列表
     */
    @RequestMapping("toStandardResultListAudit.action")
    public String toStandardResultListAudit(AuditObjectVo auditObjectVo, Model model){
        //主体
        Subject subject = SecurityUtils.getSubject();
        //从主体中取出身份信息
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        //如果有学院权限就只查询指定学院的标准管理成果集合
        if(subject.hasRole("collegeAdmin")){
            auditObjectVo.setCollegeId(activeUser.getUserInfo().getCollegeId2());  //设置审核人的学院
        }
        //按指定审核条件查询对应的标准管理成果集合
        model.addAttribute("standardResultList",auditService.findStandardResultList(auditObjectVo));
        model.addAttribute("auditType",auditObjectVo.getAuditType());  //设置请求查看的审核状态
        model.addAttribute("ds",new DateToString());                   //字符串格式化工具类
        return "result/standardResult/auditStandardResultList";
    }

    /** 提交标准管理成果审核
     * @param auditObjectVo 审核值对象
     * @return 重定向到待审核标准管理成果列表
     */
    @RequestMapping("submitStandardResultAudit.action")
    public String submitStandardResultAudit(AuditObjectVo auditObjectVo){
        auditService.updateStandardAuditStatus(auditObjectVo);
        return "redirect:/audit/toStandardResultListAudit.action?auditType=1";
    }

    /**
     * 查看标准管理成果详情
     * @param id 标准管理成果id
     * @param auditType 审核类型
     * @return 返回到标准管理成果详情页面
     */
    @RequestMapping("viewStandardResultInfo.action")
    public String viewStandardResultInfo(String id,Integer auditType,Model model){
        model.addAttribute("standardResultInfo",standardResultService.findStandardResultById(id));
        model.addAttribute("personList",standardResultService.findPersonListByStandardId(id));
        model.addAttribute("ds",new DateToString());
        model.addAttribute("auditType",auditType);
        return "result/standardResult/auditStandardResultInfo";
    }

    /**
     * 保存并审核标准管理成果
     * @param standardResultVO 标准管理成果详情
     * @param personListVO 人员列表
     * @param auditObjectVo 审核对象
     * @return 重定向到标准管理成果列表
     */
    @RequestMapping("updateStandardResultAtAudit.action")
    public String updateStandardResultAtAudit(StandardResultVO standardResultVO, PersonListVO personListVO, AuditObjectVo auditObjectVo){
        //将PersonListVO对象设置到standardResultVO对象中
        standardResultVO.setPersonListVO(personListVO);
        //将personListVO转成集合后设置到standardResultVO对象中
        standardResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        auditService.updateStandard(standardResultVO, auditObjectVo);
        return "redirect:/audit/toStandardResultListAudit.action?auditType=1";
    }

}
