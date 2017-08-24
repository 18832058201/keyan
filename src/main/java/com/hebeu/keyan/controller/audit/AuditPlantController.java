package com.hebeu.keyan.controller.audit;

import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.service.AuditService;
import com.hebeu.keyan.service.PersonListService;
import com.hebeu.keyan.service.PlantResultService;
import com.hebeu.keyan.utils.DateToString;
import com.hebeu.keyan.vo.AuditObjectVo;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.PlantResultVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者：陈德华
 * 时间：2017/8/24 11:02
 * 描述：植物新品种成果审核控制器
 */
@Controller
@RequestMapping("/audit/")
public class AuditPlantController {
    private final AuditService auditService;
    private final PersonListService personListService;
    private final PlantResultService plantResultService;

    @Autowired
    public AuditPlantController(AuditService auditService, PersonListService personListService, PlantResultService plantResultService) {
        this.auditService = auditService;
        this.personListService = personListService;
        this.plantResultService = plantResultService;
    }


    /**
     * 查看植物新品种成果审核列表
     * @param auditObjectVo 审核对象
     * @return 返回到植物新品种成果审核列表
     */
    @RequestMapping("toPlantResultListAudit.action")
    public String toPlantResultListAudit(AuditObjectVo auditObjectVo, Model model){
        //主体
        Subject subject = SecurityUtils.getSubject();
        //从主体中取出身份信息
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        //如果有学院权限就只查询指定学院的植物新品种成果集合
        if(subject.hasRole("collegeAdmin")){
            auditObjectVo.setCollegeId(activeUser.getUserInfo().getCollegeId2());  //设置审核人的学院
        }
        //按指定审核条件查询对应的植物新品种成果集合
        model.addAttribute("plantResultList",auditService.findPlantResultList(auditObjectVo));
        model.addAttribute("auditType",auditObjectVo.getAuditType());  //设置请求查看的审核状态
        model.addAttribute("ds",new DateToString());                   //字符串格式化工具类
        return "result/plantResult/auditPlantResultList";
    }

    /** 提交植物新品种成果审核
     * @param auditObjectVo 审核值对象
     * @return 重定向到待审核植物新品种成果列表
     */
    @RequestMapping("submitPlantResultAudit.action")
    public String submitPlantResultAudit(AuditObjectVo auditObjectVo){
        auditService.updatePlantAuditStatus(auditObjectVo);
        return "redirect:/audit/toPlantResultListAudit.action?auditType=1";
    }

    /**
     * 查看植物新品种成果详情
     * @param id 植物新品种成果id
     * @param auditType 审核类型
     * @return 返回到植物新品种成果详情页面
     */
    @RequestMapping("viewPlantResultInfo.action")
    public String viewPlantResultInfo(String id,Integer auditType,Model model){
        model.addAttribute("plantResultInfo",plantResultService.findPlantResultById(id));
        model.addAttribute("personList",plantResultService.findPersonListByPlantId(id));
        model.addAttribute("ds",new DateToString());
        model.addAttribute("auditType",auditType);
        return "result/plantResult/auditPlantResultInfo";
    }

    /**
     * 保存并审核植物新品种成果
     * @param plantResultVO 植物新品种成果详情
     * @param personListVO 人员列表
     * @param auditObjectVo 审核对象
     * @return 重定向到植物新品种成果列表
     */
    @RequestMapping("updatePlantResultAtAudit.action")
    public String updatePlantResultAtAudit(PlantResultVO plantResultVO, PersonListVO personListVO, AuditObjectVo auditObjectVo){
        //将PersonListVO对象设置到plantResultVO对象中
        plantResultVO.setPersonListVO(personListVO);
        //将personListVO转成集合后设置到plantResultVO对象中
        plantResultVO.setPersonListVOList(personListService.getPersonList(personListVO));
        auditService.updatePlant(plantResultVO, auditObjectVo);
        return "redirect:/audit/toPlantResultListAudit.action?auditType=1";
    }

}
