package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PlantGrade;
import com.hebeu.keyan.po.PlantGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantGradeMapper {
    int countByExample(PlantGradeExample example);

    int deleteByExample(PlantGradeExample example);

    int deleteByPrimaryKey(Integer plantGradeId);

    int insert(PlantGrade record);

    int insertSelective(PlantGrade record);

    List<PlantGrade> selectByExample(PlantGradeExample example);

    PlantGrade selectByPrimaryKey(Integer plantGradeId);

    int updateByExampleSelective(@Param("record") PlantGrade record, @Param("example") PlantGradeExample example);

    int updateByExample(@Param("record") PlantGrade record, @Param("example") PlantGradeExample example);

    int updateByPrimaryKeySelective(PlantGrade record);

    int updateByPrimaryKey(PlantGrade record);
}