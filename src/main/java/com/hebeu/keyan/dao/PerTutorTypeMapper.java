package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PerTutorType;
import com.hebeu.keyan.po.PerTutorTypeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PerTutorTypeMapper {
    int countByExample(PerTutorTypeExample example);

    int deleteByExample(PerTutorTypeExample example);

    int deleteByPrimaryKey(Integer tutorTypeId);

    int insert(PerTutorType record);

    int insertSelective(PerTutorType record);

    List<PerTutorType> selectByExample(PerTutorTypeExample example);

    PerTutorType selectByPrimaryKey(Integer tutorTypeId);

    int updateByExampleSelective(@Param("record") PerTutorType record, @Param("example") PerTutorTypeExample example);

    int updateByExample(@Param("record") PerTutorType record, @Param("example") PerTutorTypeExample example);

    int updateByPrimaryKeySelective(PerTutorType record);

    int updateByPrimaryKey(PerTutorType record);
}