package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PerSubjectFirst;
import com.hebeu.keyan.po.PerSubjectFirstExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PerSubjectFirstMapper {
    int countByExample(PerSubjectFirstExample example);

    int deleteByExample(PerSubjectFirstExample example);

    int deleteByPrimaryKey(Integer subjectFirstId);

    int insert(PerSubjectFirst record);

    int insertSelective(PerSubjectFirst record);

    List<PerSubjectFirst> selectByExample(PerSubjectFirstExample example);

    PerSubjectFirst selectByPrimaryKey(Integer subjectFirstId);

    int updateByExampleSelective(@Param("record") PerSubjectFirst record, @Param("example") PerSubjectFirstExample example);

    int updateByExample(@Param("record") PerSubjectFirst record, @Param("example") PerSubjectFirstExample example);

    int updateByPrimaryKeySelective(PerSubjectFirst record);

    int updateByPrimaryKey(PerSubjectFirst record);
}