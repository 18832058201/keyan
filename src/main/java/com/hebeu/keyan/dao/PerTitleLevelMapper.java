package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PerTitleLevel;
import com.hebeu.keyan.po.PerTitleLevelExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PerTitleLevelMapper {
    int countByExample(PerTitleLevelExample example);

    int deleteByExample(PerTitleLevelExample example);

    int deleteByPrimaryKey(Integer titleLevelId);

    int insert(PerTitleLevel record);

    int insertSelective(PerTitleLevel record);

    List<PerTitleLevel> selectByExample(PerTitleLevelExample example);

    PerTitleLevel selectByPrimaryKey(Integer titleLevelId);

    int updateByExampleSelective(@Param("record") PerTitleLevel record, @Param("example") PerTitleLevelExample example);

    int updateByExample(@Param("record") PerTitleLevel record, @Param("example") PerTitleLevelExample example);

    int updateByPrimaryKeySelective(PerTitleLevel record);

    int updateByPrimaryKey(PerTitleLevel record);
}