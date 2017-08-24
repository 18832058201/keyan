package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.BudgetApply;
import com.hebeu.keyan.po.BudgetApplyExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BudgetApplyMapper {
    int countByExample(BudgetApplyExample example);

    int deleteByExample(BudgetApplyExample example);

    int deleteByPrimaryKey(String applyId);

    int insert(BudgetApply record);

    int insertSelective(BudgetApply record);

    List<BudgetApply> selectByExample(BudgetApplyExample example);

    BudgetApply selectByPrimaryKey(String applyId);

    int updateByExampleSelective(@Param("record") BudgetApply record, @Param("example") BudgetApplyExample example);

    int updateByExample(@Param("record") BudgetApply record, @Param("example") BudgetApplyExample example);

    int updateByPrimaryKeySelective(BudgetApply record);

    int updateByPrimaryKey(BudgetApply record);
}