package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PerNation;
import com.hebeu.keyan.po.PerNationExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PerNationMapper {
    int countByExample(PerNationExample example);

    int deleteByExample(PerNationExample example);

    int deleteByPrimaryKey(Integer nationId);

    int insert(PerNation record);

    int insertSelective(PerNation record);

    List<PerNation> selectByExample(PerNationExample example);

    PerNation selectByPrimaryKey(Integer nationId);

    int updateByExampleSelective(@Param("record") PerNation record, @Param("example") PerNationExample example);

    int updateByExample(@Param("record") PerNation record, @Param("example") PerNationExample example);

    int updateByPrimaryKeySelective(PerNation record);

    int updateByPrimaryKey(PerNation record);
}