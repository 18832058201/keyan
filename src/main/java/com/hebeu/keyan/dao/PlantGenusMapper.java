package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PlantGenus;
import com.hebeu.keyan.po.PlantGenusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantGenusMapper {
    int countByExample(PlantGenusExample example);

    int deleteByExample(PlantGenusExample example);

    int deleteByPrimaryKey(Integer plantGenusId);

    int insert(PlantGenus record);

    int insertSelective(PlantGenus record);

    List<PlantGenus> selectByExample(PlantGenusExample example);

    PlantGenus selectByPrimaryKey(Integer plantGenusId);

    int updateByExampleSelective(@Param("record") PlantGenus record, @Param("example") PlantGenusExample example);

    int updateByExample(@Param("record") PlantGenus record, @Param("example") PlantGenusExample example);

    int updateByPrimaryKeySelective(PlantGenus record);

    int updateByPrimaryKey(PlantGenus record);
}