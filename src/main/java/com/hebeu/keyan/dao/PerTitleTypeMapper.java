package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PerTitleType;
import com.hebeu.keyan.po.PerTitleTypeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PerTitleTypeMapper {
    int countByExample(PerTitleTypeExample example);

    int deleteByExample(PerTitleTypeExample example);

    int deleteByPrimaryKey(Integer titleTypeId);

    int insert(PerTitleType record);

    int insertSelective(PerTitleType record);

    List<PerTitleType> selectByExample(PerTitleTypeExample example);

    PerTitleType selectByPrimaryKey(Integer titleTypeId);

    int updateByExampleSelective(@Param("record") PerTitleType record, @Param("example") PerTitleTypeExample example);

    int updateByExample(@Param("record") PerTitleType record, @Param("example") PerTitleTypeExample example);

    int updateByPrimaryKeySelective(PerTitleType record);

    int updateByPrimaryKey(PerTitleType record);
}