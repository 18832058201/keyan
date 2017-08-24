package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PerCountry;
import com.hebeu.keyan.po.PerCountryExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PerCountryMapper {
    int countByExample(PerCountryExample example);

    int deleteByExample(PerCountryExample example);

    int deleteByPrimaryKey(Integer countryId);

    int insert(PerCountry record);

    int insertSelective(PerCountry record);

    List<PerCountry> selectByExample(PerCountryExample example);

    PerCountry selectByPrimaryKey(Integer countryId);

    int updateByExampleSelective(@Param("record") PerCountry record, @Param("example") PerCountryExample example);

    int updateByExample(@Param("record") PerCountry record, @Param("example") PerCountryExample example);

    int updateByPrimaryKeySelective(PerCountry record);

    int updateByPrimaryKey(PerCountry record);
}