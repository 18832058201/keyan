package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PatType;
import com.hebeu.keyan.po.PatTypeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatTypeMapper {
    int countByExample(PatTypeExample example);

    int deleteByExample(PatTypeExample example);

    int deleteByPrimaryKey(Integer patTypeId);

    int insert(PatType record);

    int insertSelective(PatType record);

    List<PatType> selectByExample(PatTypeExample example);

    PatType selectByPrimaryKey(Integer patTypeId);

    int updateByExampleSelective(@Param("record") PatType record, @Param("example") PatTypeExample example);

    int updateByExample(@Param("record") PatType record, @Param("example") PatTypeExample example);

    int updateByPrimaryKeySelective(PatType record);

    int updateByPrimaryKey(PatType record);
}