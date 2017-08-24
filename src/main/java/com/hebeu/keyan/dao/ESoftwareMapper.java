package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.ESoftware;
import com.hebeu.keyan.po.ESoftwareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ESoftwareMapper {
    int countByExample(ESoftwareExample example);

    int deleteByExample(ESoftwareExample example);

    int deleteByPrimaryKey(String softwareId);

    int insert(ESoftware record);

    int insertSelective(ESoftware record);

    List<ESoftware> selectByExample(ESoftwareExample example);

    ESoftware selectByPrimaryKey(String softwareId);

    int updateByExampleSelective(@Param("record") ESoftware record, @Param("example") ESoftwareExample example);

    int updateByExample(@Param("record") ESoftware record, @Param("example") ESoftwareExample example);

    int updateByPrimaryKeySelective(ESoftware record);

    int updateByPrimaryKey(ESoftware record);
}