package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.EPlant;
import com.hebeu.keyan.po.EPlantExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EPlantMapper {
    int countByExample(EPlantExample example);

    int deleteByExample(EPlantExample example);

    int deleteByPrimaryKey(String plantId);

    int insert(EPlant record);

    int insertSelective(EPlant record);

    List<EPlant> selectByExample(EPlantExample example);

    EPlant selectByPrimaryKey(String plantId);

    int updateByExampleSelective(@Param("record") EPlant record, @Param("example") EPlantExample example);

    int updateByExample(@Param("record") EPlant record, @Param("example") EPlantExample example);

    int updateByPrimaryKeySelective(EPlant record);

    int updateByPrimaryKey(EPlant record);
}