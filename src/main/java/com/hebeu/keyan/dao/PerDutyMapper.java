package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PerDuty;
import com.hebeu.keyan.po.PerDutyExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PerDutyMapper {
    int countByExample(PerDutyExample example);

    int deleteByExample(PerDutyExample example);

    int deleteByPrimaryKey(Integer dutyId);

    int insert(PerDuty record);

    int insertSelective(PerDuty record);

    List<PerDuty> selectByExample(PerDutyExample example);

    PerDuty selectByPrimaryKey(Integer dutyId);

    int updateByExampleSelective(@Param("record") PerDuty record, @Param("example") PerDutyExample example);

    int updateByExample(@Param("record") PerDuty record, @Param("example") PerDutyExample example);

    int updateByPrimaryKeySelective(PerDuty record);

    int updateByPrimaryKey(PerDuty record);
}