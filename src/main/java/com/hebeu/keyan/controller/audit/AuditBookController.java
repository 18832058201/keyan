package com.hebeu.keyan.controller.audit;

import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.service.AuditService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.service.BookResultService;
import com.hebeu.keyan.utils.DateToString;
import com.hebeu.keyan.vo.AuditObjectVo;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.BookResultVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者：陈德华
 * 时间：2017/8/24 11:02
 * 描述：著作成果审核控制器
 */
@Controller
@RequestMapping("/audit/")
public class AuditBookController {
    private final AuditService auditService;
    private final PersonListService personListService;
    private final BookResultService bookResultService;

    @Autowired
    public AuditBookController(AuditService auditService, PersonListService personListService, BookResultService bookResultService) {
        this.auditService = auditService;
        this.personListService = personListService;
        this.bookResultService = bookResultService;
    }

    /**
     * 查看著作成果审核列表
     * @param auditObjectVo 审核对象
     * @return 返回到著作成果审核列表
     */
    @RequestMapping("toBookResultListAudit.action")
    public String toBookResultListAudit(AuditObjectVo auditObjectVo, Model model){
        //主体
        Subject subject = SecurityUtils.getSubject();
        //从主体中取出身份信息
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        //如果有学院权限就只查询指定学院的著作成果集合
        if(subject.hasRole("collegeAdmin")){
            auditObjectVo.setCollegeId(activeUser.getUserInfo().getCollegeId2());  //设置审核人的学院
        }
        //按指定审核条件查询对应的著作成果集合
        model.addAttribute("bookResultList",auditService.findBookResultList(auditObjectVo));
        model.addAttribute("auditType",auditObjectVo.getAuditType());  //设置请求查看的审核状态
        model.addAttribute("ds",new DateToString());                   //字符串格式化工具类
        return "result/bookResult/auditBookResultList";
    }

    /** 提交著作成果审核
     * @param auditObjectVo 审核值对象
     * @return 重定向到待审核著作成果列表
     */
    @RequestMapping("submitBookResultAudit.action")
    public String submitBookResultAudit(AuditObjectVo auditObjectVo){
        auditService.updateBookAuditStatus(auditObjectVo);
        return "redirect:/audit/toBookResultListAudit.action?auditType=1";
    }

    /**
     * 查看著作成果详情
     * @param id 著作成果id
     * @param auditType 审核类型
     * @return 返回到著作成果详情页面
     */
    @RequestMapping("viewBookResultInfo.action")
    public String viewBookResultInfo(String id,Integer auditType,Model model){
        model.addAttribute("bookResultInfo",bookResultService.findBookResultById(id));
        model.addAttribute("personList",bookResultService.findPersonListByBookId(id));
        model.addAttribute("ds",new DateToString());
        model.addAttribute("auditType",auditType);
        return "result/bookResult/auditBookResultInfo";
    }

    /**
     * 保存并审核著作成果
     * @param bookResultVO 著作成果详情
     * @param personListVO 人员列表
     * @param auditObjectVo 审核对象
     * @return 重定向到著作成果列表
     */
    @RequestMapping("updateBookResultAtAudit.action")
    public String updateBookResultAtAudit(BookResultVO bookResultVO, PersonListVO personListVO, AuditObjectVo auditObjectVo){
        //将PersonListVO对象设置到bookResultVO对象中
        bookResultVO.setPersonListVO(personListVO);
        //将personListVO转成集合后设置到bookResultVO对象中
        bookResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        auditService.updateBook(bookResultVO, auditObjectVo);
        return "redirect:/audit/toBookResultListAudit.action?auditType=1";
    }

}
