package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.ESeal;
import com.hebeu.keyan.po.ESealExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ESealMapper {
    int countByExample(ESealExample example);

    int deleteByExample(ESealExample example);

    int deleteByPrimaryKey(String sealId);

    int insert(ESeal record);

    int insertSelective(ESeal record);

    List<ESeal> selectByExample(ESealExample example);

    ESeal selectByPrimaryKey(String sealId);

    int updateByExampleSelective(@Param("record") ESeal record, @Param("example") ESealExample example);

    int updateByExample(@Param("record") ESeal record, @Param("example") ESealExample example);

    int updateByPrimaryKeySelective(ESeal record);

    int updateByPrimaryKey(ESeal record);
}