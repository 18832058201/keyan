package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.StandType;
import com.hebeu.keyan.po.StandTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StandTypeMapper {
    int countByExample(StandTypeExample example);

    int deleteByExample(StandTypeExample example);

    int deleteByPrimaryKey(Integer standTypeId);

    int insert(StandType record);

    int insertSelective(StandType record);

    List<StandType> selectByExample(StandTypeExample example);

    StandType selectByPrimaryKey(Integer standTypeId);

    int updateByExampleSelective(@Param("record") StandType record, @Param("example") StandTypeExample example);

    int updateByExample(@Param("record") StandType record, @Param("example") StandTypeExample example);

    int updateByPrimaryKeySelective(StandType record);

    int updateByPrimaryKey(StandType record);
}