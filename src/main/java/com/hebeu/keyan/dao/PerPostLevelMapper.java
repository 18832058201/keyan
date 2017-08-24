package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PerPostLevel;
import com.hebeu.keyan.po.PerPostLevelExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PerPostLevelMapper {
    int countByExample(PerPostLevelExample example);

    int deleteByExample(PerPostLevelExample example);

    int deleteByPrimaryKey(Integer postLevelId);

    int insert(PerPostLevel record);

    int insertSelective(PerPostLevel record);

    List<PerPostLevel> selectByExample(PerPostLevelExample example);

    PerPostLevel selectByPrimaryKey(Integer postLevelId);

    int updateByExampleSelective(@Param("record") PerPostLevel record, @Param("example") PerPostLevelExample example);

    int updateByExample(@Param("record") PerPostLevel record, @Param("example") PerPostLevelExample example);

    int updateByPrimaryKeySelective(PerPostLevel record);

    int updateByPrimaryKey(PerPostLevel record);
}