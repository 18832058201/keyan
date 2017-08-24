package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.ManageMoneyTotal;
import com.hebeu.keyan.po.ManageMoneyTotalExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManageMoneyTotalMapper {
    int countByExample(ManageMoneyTotalExample example);

    int deleteByExample(ManageMoneyTotalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ManageMoneyTotal record);

    int insertSelective(ManageMoneyTotal record);

    List<ManageMoneyTotal> selectByExample(ManageMoneyTotalExample example);

    ManageMoneyTotal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ManageMoneyTotal record, @Param("example") ManageMoneyTotalExample example);

    int updateByExample(@Param("record") ManageMoneyTotal record, @Param("example") ManageMoneyTotalExample example);

    int updateByPrimaryKeySelective(ManageMoneyTotal record);

    int updateByPrimaryKey(ManageMoneyTotal record);
}