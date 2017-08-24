package com.hebeu.keyan.service;

import com.hebeu.keyan.po.EPersonEdit;
import com.hebeu.keyan.po.customPO.EPersonCustom;
import com.hebeu.keyan.po.customPO.EPersonEditCustom;
import com.hebeu.keyan.vo.AuditObjectVo;
import com.hebeu.keyan.vo.PersonInfoSearchVO;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017-08-18  14:58
 * 描述：人员信息 相关处理类接口
 */
public interface EPersonService {
    /**
     * 通过登录人工号查询该工号的详情
     * @param workNum 工号
     * @return ePersonCustom 个人信息对象
     */
    public EPersonCustom findPersonInfoByWorkNum(String workNum);

    /**
     * 编辑人员信息
     * @param ePersonCustom 项目值对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updatePersonInfo(EPersonCustom ePersonCustom);

    /**
     * 从e_person_edit查询待审核的编辑
     * @param workNum 工号
     */
    public EPersonEditCustom findEPersonEditByWorkNum(String workNum);

    /**
     * 从e_person_edit查询待审核的编辑
     * @param personEditId
     */
    public EPersonEditCustom findEPersonEditByPersonEditId(String personEditId);

    /*-----------------------以下为审核部分所需方法------------------------*/
    /**
     * 按指定条件查询 个人信息详情更改
     * @param personInfoSearchVO
     * @return 返回指定查询的个人信息详情更改
     */
    public List<EPersonEditCustom> findEPersonEditCustom(PersonInfoSearchVO personInfoSearchVO);

    /**
     * 更新审核状态
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updatePersonalInfoAuditStatus(AuditObjectVo auditObjectVo);
}
