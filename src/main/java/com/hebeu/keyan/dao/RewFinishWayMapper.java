package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.RewFinishWay;
import com.hebeu.keyan.po.RewFinishWayExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RewFinishWayMapper {
    int countByExample(RewFinishWayExample example);

    int deleteByExample(RewFinishWayExample example);

    int deleteByPrimaryKey(Integer finishWayId);

    int insert(RewFinishWay record);

    int insertSelective(RewFinishWay record);

    List<RewFinishWay> selectByExample(RewFinishWayExample example);

    RewFinishWay selectByPrimaryKey(Integer finishWayId);

    int updateByExampleSelective(@Param("record") RewFinishWay record, @Param("example") RewFinishWayExample example);

    int updateByExample(@Param("record") RewFinishWay record, @Param("example") RewFinishWayExample example);

    int updateByPrimaryKeySelective(RewFinishWay record);

    int updateByPrimaryKey(RewFinishWay record);
}