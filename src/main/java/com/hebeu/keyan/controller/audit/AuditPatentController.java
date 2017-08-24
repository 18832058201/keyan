package com.hebeu.keyan.controller.audit;

import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.service.AuditService;
import com.hebeu.keyan.service.PatentResultService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.utils.DateToString;
import com.hebeu.keyan.vo.AuditObjectVo;
import com.hebeu.keyan.vo.PatentResultVO;
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
 * 描述：专利成果审核控制器
 */
@Controller
@RequestMapping("/audit/")
public class AuditPatentController {
    private final AuditService auditService;
    private final PersonListService personListService;
    private final PatentResultService patentResultService;

    @Autowired
    public AuditPatentController(AuditService auditService, PersonListService personListService, PatentResultService patentResultService) {
        this.auditService = auditService;
        this.personListService = personListService;
        this.patentResultService = patentResultService;
    }


    /**
     * 查看专利成果审核列表
     * @param auditObjectVo 审核对象
     * @return 返回到专利成果审核列表
     */
    @RequestMapping("toPatentResultListAudit.action")
    public String toPatentResultListAudit(AuditObjectVo auditObjectVo, Model model){
        //主体
        Subject subject = SecurityUtils.getSubject();
        //从主体中取出身份信息
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        //如果有学院权限就只查询指定学院的专利成果集合
        if(subject.hasRole("collegeAdmin")){
            auditObjectVo.setCollegeId(activeUser.getUserInfo().getCollegeId2());  //设置审核人的学院
        }
        //按指定审核条件查询对应的专利成果集合
        model.addAttribute("patentResultList",auditService.findPatentResultList(auditObjectVo));
        model.addAttribute("auditType",auditObjectVo.getAuditType());  //设置请求查看的审核状态
        model.addAttribute("ds",new DateToString());                   //字符串格式化工具类
        return "result/patentResult/auditPatentResultList";
    }

    /** 提交专利成果审核
     * @param auditObjectVo 审核值对象
     * @return 重定向到待审核专利成果列表
     */
    @RequestMapping("submitPatentResultAudit.action")
    public String submitPatentResultAudit(AuditObjectVo auditObjectVo){
        auditService.updatePatentAuditStatus(auditObjectVo);
        return "redirect:/audit/toPatentResultListAudit.action?auditType=1";
    }

    /**
     * 查看专利成果详情
     * @param id 专利成果id
     * @param auditType 审核类型
     * @return 返回到专利成果详情页面
     */
    @RequestMapping("viewPatentResultInfo.action")
    public String viewPatentResultInfo(String id,Integer auditType,Model model){
        model.addAttribute("patentResultInfo",patentResultService.findPatentResultById(id));
        model.addAttribute("personList",patentResultService.findPersonalListById(id));
        model.addAttribute("ds",new DateToString());
        model.addAttribute("auditType",auditType);
        return "result/patentResult/auditPatentResultInfo";
    }

    /**
     * 保存并审核专利成果
     * @param patentResultVO 专利成果详情
     * @param personListVO 人员列表
     * @param auditObjectVo 审核对象
     * @return 重定向到专利成果列表
     */
    @RequestMapping("updatePatentResultAtAudit.action")
    public String updatePatentResultAtAudit(PatentResultVO patentResultVO, PersonListVO personListVO, AuditObjectVo auditObjectVo){
        //将PersonListVO对象设置到patentResultVO对象中
        patentResultVO.setPersonListVO(personListVO);
        //将personListVO转成集合后设置到patentResultVO对象中
        patentResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        auditService.updatePatent(patentResultVO, auditObjectVo);
        return "redirect:/audit/toPatentResultListAudit.action?auditType=1";
    }

}
