package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PerEducation;
import com.hebeu.keyan.po.PerEducationExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PerEducationMapper {
    int countByExample(PerEducationExample example);

    int deleteByExample(PerEducationExample example);

    int deleteByPrimaryKey(Integer educationId);

    int insert(PerEducation record);

    int insertSelective(PerEducation record);

    List<PerEducation> selectByExample(PerEducationExample example);

    PerEducation selectByPrimaryKey(Integer educationId);

    int updateByExampleSelective(@Param("record") PerEducation record, @Param("example") PerEducationExample example);

    int updateByExample(@Param("record") PerEducation record, @Param("example") PerEducationExample example);

    int updateByPrimaryKeySelective(PerEducation record);

    int updateByPrimaryKey(PerEducation record);
}