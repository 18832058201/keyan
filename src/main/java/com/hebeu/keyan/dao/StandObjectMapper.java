package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.StandObject;
import com.hebeu.keyan.po.StandObjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StandObjectMapper {
    int countByExample(StandObjectExample example);

    int deleteByExample(StandObjectExample example);

    int deleteByPrimaryKey(Integer standObjectId);

    int insert(StandObject record);

    int insertSelective(StandObject record);

    List<StandObject> selectByExample(StandObjectExample example);

    StandObject selectByPrimaryKey(Integer standObjectId);

    int updateByExampleSelective(@Param("record") StandObject record, @Param("example") StandObjectExample example);

    int updateByExample(@Param("record") StandObject record, @Param("example") StandObjectExample example);

    int updateByPrimaryKeySelective(StandObject record);

    int updateByPrimaryKey(StandObject record);
}