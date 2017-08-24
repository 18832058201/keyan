package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PubMoneyStatus;
import com.hebeu.keyan.po.PubMoneyStatusExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PubMoneyStatusMapper {
    int countByExample(PubMoneyStatusExample example);

    int deleteByExample(PubMoneyStatusExample example);

    int deleteByPrimaryKey(Integer auditStatusId);

    int insert(PubMoneyStatus record);

    int insertSelective(PubMoneyStatus record);

    List<PubMoneyStatus> selectByExample(PubMoneyStatusExample example);

    PubMoneyStatus selectByPrimaryKey(Integer auditStatusId);

    int updateByExampleSelective(@Param("record") PubMoneyStatus record, @Param("example") PubMoneyStatusExample example);

    int updateByExample(@Param("record") PubMoneyStatus record, @Param("example") PubMoneyStatusExample example);

    int updateByPrimaryKeySelective(PubMoneyStatus record);

    int updateByPrimaryKey(PubMoneyStatus record);
}