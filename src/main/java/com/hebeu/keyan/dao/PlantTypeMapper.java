package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PlantType;
import com.hebeu.keyan.po.PlantTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantTypeMapper {
    int countByExample(PlantTypeExample example);

    int deleteByExample(PlantTypeExample example);

    int deleteByPrimaryKey(Integer plantTypeId);

    int insert(PlantType record);

    int insertSelective(PlantType record);

    List<PlantType> selectByExample(PlantTypeExample example);

    PlantType selectByPrimaryKey(Integer plantTypeId);

    int updateByExampleSelective(@Param("record") PlantType record, @Param("example") PlantTypeExample example);

    int updateByExample(@Param("record") PlantType record, @Param("example") PlantTypeExample example);

    int updateByPrimaryKeySelective(PlantType record);

    int updateByPrimaryKey(PlantType record);
}