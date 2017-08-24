package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.ManageMoneyApply;
import com.hebeu.keyan.po.ManageMoneyApplyExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManageMoneyApplyMapper {
    int countByExample(ManageMoneyApplyExample example);

    int deleteByExample(ManageMoneyApplyExample example);

    int deleteByPrimaryKey(String applyId);

    int insert(ManageMoneyApply record);

    int insertSelective(ManageMoneyApply record);

    List<ManageMoneyApply> selectByExample(ManageMoneyApplyExample example);

    ManageMoneyApply selectByPrimaryKey(String applyId);

    int updateByExampleSelective(@Param("record") ManageMoneyApply record, @Param("example") ManageMoneyApplyExample example);

    int updateByExample(@Param("record") ManageMoneyApply record, @Param("example") ManageMoneyApplyExample example);

    int updateByPrimaryKeySelective(ManageMoneyApply record);

    int updateByPrimaryKey(ManageMoneyApply record);
}