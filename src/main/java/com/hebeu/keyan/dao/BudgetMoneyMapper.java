package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.BudgetMoney;
import com.hebeu.keyan.po.BudgetMoneyExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BudgetMoneyMapper {
    int countByExample(BudgetMoneyExample example);

    int deleteByExample(BudgetMoneyExample example);

    int deleteByPrimaryKey(Integer budgetId);

    int insert(BudgetMoney record);

    int insertSelective(BudgetMoney record);

    List<BudgetMoney> selectByExample(BudgetMoneyExample example);

    BudgetMoney selectByPrimaryKey(Integer budgetId);

    int updateByExampleSelective(@Param("record") BudgetMoney record, @Param("example") BudgetMoneyExample example);

    int updateByExample(@Param("record") BudgetMoney record, @Param("example") BudgetMoneyExample example);

    int updateByPrimaryKeySelective(BudgetMoney record);

    int updateByPrimaryKey(BudgetMoney record);
}