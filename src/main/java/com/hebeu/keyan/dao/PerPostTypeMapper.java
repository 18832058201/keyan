package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PerPostType;
import com.hebeu.keyan.po.PerPostTypeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerPostTypeMapper {
    int countByExample(PerPostTypeExample example);

    int deleteByExample(PerPostTypeExample example);

    int deleteByPrimaryKey(Integer postTypeId);

    int insert(PerPostType record);

    int insertSelective(PerPostType record);

    List<PerPostType> selectByExample(PerPostTypeExample example);

    PerPostType selectByPrimaryKey(Integer postTypeId);

    int updateByExampleSelective(@Param("record") PerPostType record, @Param("example") PerPostTypeExample example);

    int updateByExample(@Param("record") PerPostType record, @Param("example") PerPostTypeExample example);

    int updateByPrimaryKeySelective(PerPostType record);

    int updateByPrimaryKey(PerPostType record);
}