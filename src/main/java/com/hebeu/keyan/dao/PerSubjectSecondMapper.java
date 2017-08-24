package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PerSubjectSecond;
import com.hebeu.keyan.po.PerSubjectSecondExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PerSubjectSecondMapper {
    int countByExample(PerSubjectSecondExample example);

    int deleteByExample(PerSubjectSecondExample example);

    int deleteByPrimaryKey(Integer subjectSecondId);

    int insert(PerSubjectSecond record);

    int insertSelective(PerSubjectSecond record);

    List<PerSubjectSecond> selectByExample(PerSubjectSecondExample example);

    PerSubjectSecond selectByPrimaryKey(Integer subjectSecondId);

    int updateByExampleSelective(@Param("record") PerSubjectSecond record, @Param("example") PerSubjectSecondExample example);

    int updateByExample(@Param("record") PerSubjectSecond record, @Param("example") PerSubjectSecondExample example);

    int updateByPrimaryKeySelective(PerSubjectSecond record);

    int updateByPrimaryKey(PerSubjectSecond record);
}