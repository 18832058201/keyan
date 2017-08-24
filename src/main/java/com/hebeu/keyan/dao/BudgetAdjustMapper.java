package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.BudgetAdjust;
import com.hebeu.keyan.po.BudgetAdjustExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BudgetAdjustMapper {
    int countByExample(BudgetAdjustExample example);

    int deleteByExample(BudgetAdjustExample example);

    int deleteByPrimaryKey(Integer budgetId);

    int insert(BudgetAdjust record);

    int insertSelective(BudgetAdjust record);

    List<BudgetAdjust> selectByExample(BudgetAdjustExample example);

    BudgetAdjust selectByPrimaryKey(Integer budgetId);

    int updateByExampleSelective(@Param("record") BudgetAdjust record, @Param("example") BudgetAdjustExample example);

    int updateByExample(@Param("record") BudgetAdjust record, @Param("example") BudgetAdjustExample example);

    int updateByPrimaryKeySelective(BudgetAdjust record);

    int updateByPrimaryKey(BudgetAdjust record);
}