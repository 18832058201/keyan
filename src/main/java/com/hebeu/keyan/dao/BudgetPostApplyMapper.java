package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.BudgetPostApply;
import com.hebeu.keyan.po.BudgetPostApplyExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BudgetPostApplyMapper {
    int countByExample(BudgetPostApplyExample example);

    int deleteByExample(BudgetPostApplyExample example);

    int deleteByPrimaryKey(String applyId);

    int insert(BudgetPostApply record);

    int insertSelective(BudgetPostApply record);

    List<BudgetPostApply> selectByExample(BudgetPostApplyExample example);

    BudgetPostApply selectByPrimaryKey(String applyId);

    int updateByExampleSelective(@Param("record") BudgetPostApply record, @Param("example") BudgetPostApplyExample example);

    int updateByExample(@Param("record") BudgetPostApply record, @Param("example") BudgetPostApplyExample example);

    int updateByPrimaryKeySelective(BudgetPostApply record);

    int updateByPrimaryKey(BudgetPostApply record);
}