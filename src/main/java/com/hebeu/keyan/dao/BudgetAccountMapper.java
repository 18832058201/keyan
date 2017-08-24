package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.BudgetAccount;
import com.hebeu.keyan.po.BudgetAccountExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BudgetAccountMapper {
    int countByExample(BudgetAccountExample example);

    int deleteByExample(BudgetAccountExample example);

    int deleteByPrimaryKey(String accountId);

    int insert(BudgetAccount record);

    int insertSelective(BudgetAccount record);

    List<BudgetAccount> selectByExample(BudgetAccountExample example);

    BudgetAccount selectByPrimaryKey(String accountId);

    int updateByExampleSelective(@Param("record") BudgetAccount record, @Param("example") BudgetAccountExample example);

    int updateByExample(@Param("record") BudgetAccount record, @Param("example") BudgetAccountExample example);

    int updateByPrimaryKeySelective(BudgetAccount record);

    int updateByPrimaryKey(BudgetAccount record);
}