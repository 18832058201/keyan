package com.hebeu.keyan.dao.customMapper;

import com.hebeu.keyan.po.ManageMoneyTotal;
import com.hebeu.keyan.po.customPO.ManageMoneyApplyCustom;
import com.hebeu.keyan.vo.MoneySearchVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/11  15:23
 * 描述：科研管理费Mapper拓展接口，主要是实现自定义查询
 */
@Repository
public interface ManageMoneyMapper {
    /**
     * 根据“工号”查询《科研管理费申请》列表
     *
     * @param workNum 工号
     * @return 返回指定“工号”的《科研管理费申请》列表
     */
    public List<ManageMoneyApplyCustom> selectApplyByWorkNum(String workNum);

    /**
     * 根据“申请编号”查询指定的《管理费申请》详情
     *
     * @param applyId 申请编号
     * @return 返回指定“申请编号”的《管理费申请》详情
     */
    public ManageMoneyApplyCustom selectApplyInfoByApplyId(String applyId);


    /**
     * 查询manage_money_total中，所有的year
     * @return list集合
     */
    public List<ManageMoneyTotal> selectAllYear();


    /**
     * 查询满足条件的申请
     * @param moneySearchVO 查询条件查询条件对象
     * @return 返回满足条件的管理费申请集合
     */
    public List<ManageMoneyApplyCustom> selectApplyByMoneySearchVO(@Param("moneySearchVO") MoneySearchVO moneySearchVO);
}
