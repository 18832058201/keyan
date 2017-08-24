package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.SubjectType;
import com.hebeu.keyan.po.SubjectTypeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectTypeMapper {
    int countByExample(SubjectTypeExample example);

    int deleteByExample(SubjectTypeExample example);

    int deleteByPrimaryKey(Integer subjectTypeId);

    int insert(SubjectType record);

    int insertSelective(SubjectType record);

    List<SubjectType> selectByExample(SubjectTypeExample example);

    SubjectType selectByPrimaryKey(Integer subjectTypeId);

    int updateByExampleSelective(@Param("record") SubjectType record, @Param("example") SubjectTypeExample example);

    int updateByExample(@Param("record") SubjectType record, @Param("example") SubjectTypeExample example);

    int updateByPrimaryKeySelective(SubjectType record);

    int updateByPrimaryKey(SubjectType record);
}