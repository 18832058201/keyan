package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PerDegree;
import com.hebeu.keyan.po.PerDegreeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PerDegreeMapper {
    int countByExample(PerDegreeExample example);

    int deleteByExample(PerDegreeExample example);

    int deleteByPrimaryKey(Integer degreeId);

    int insert(PerDegree record);

    int insertSelective(PerDegree record);

    List<PerDegree> selectByExample(PerDegreeExample example);

    PerDegree selectByPrimaryKey(Integer degreeId);

    int updateByExampleSelective(@Param("record") PerDegree record, @Param("example") PerDegreeExample example);

    int updateByExample(@Param("record") PerDegree record, @Param("example") PerDegreeExample example);

    int updateByPrimaryKeySelective(PerDegree record);

    int updateByPrimaryKey(PerDegree record);
}