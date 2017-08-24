package com.hebeu.keyan.service;

import com.hebeu.keyan.po.EPerson;
import com.hebeu.keyan.po.ManageMoneyApply;
import com.hebeu.keyan.po.ManageMoneyTotal;
import com.hebeu.keyan.po.customPO.ManageMoneyApplyCustom;
import com.hebeu.keyan.vo.AuditObjectVo;
import com.hebeu.keyan.vo.IdentifyResultVO;
import com.hebeu.keyan.vo.MoneySearchVO;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/11  16:03
 * 描述：科研管理费 处理业务接口
 */
public interface ManageMoneyService {
    /**
     * 根据“工号”查询《科研管理费申请》列表
     *
     * @param workNum 工号
     * @return 返回指定“工号”的《科研管理费申请》列表
     */
    public List<ManageMoneyApplyCustom> findApplyByWorkNum(String workNum);

    /**
     * 根据“申请编号”查询指定的《管理费申请》详情
     *
     * @param applyId 申请编号
     * @return 返回指定“申请编号”的《管理费申请》详情
     */
    public ManageMoneyApplyCustom findApplyInfoByApplyId(String applyId);

    /**
     * 查询manage_money_total中，所有的year
     * @return 集合
     */
    public List<ManageMoneyTotal> findAllYear();

    /**
     * 查询所有在职人员，格式为姓名（工号）
     * @return 集合
     */
    public List<EPerson> findAllPeople();

    /**
     * 插入科研管理费申请
     *
     * @param manageMoneyApply 项目值对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void insertApply(ManageMoneyApply manageMoneyApply);

    /**
     * 通过ajax验证填写的申请金额是否大于可申请最大金额
     *
     * @param manageMoneyApply  申请对象
     * @return 返回true表示已存在，返回false表示不存在
     */
    public boolean applyMoneyIsOut(ManageMoneyApply manageMoneyApply,String submitType);

    /**
     * 编辑科研管理费申请
     * @param manageMoneyApply 项目值对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateApply(ManageMoneyApply manageMoneyApply);

    /**
     * 删除指定id的科研管理费申请
     * @param applyId
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void deleteApplyByApplyId(String applyId);

    /*-----------------------以下为审核部分所需方法------------------------*/

    /**
     * 按指定条件查询科研管理费申请
     * @param moneySearchVO 经费查询条件对象
     * @return 返回指定查询的管理费申请集合
     */
    public List<ManageMoneyApplyCustom> findApplyByMoneySearchVO(MoneySearchVO moneySearchVO);

    /**
     * 更新审核状态
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateApplyStatus(AuditObjectVo auditObjectVo);
}
