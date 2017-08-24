package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PaperPublishLevel;
import com.hebeu.keyan.po.PaperPublishLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PaperPublishLevelMapper {
    int countByExample(PaperPublishLevelExample example);

    int deleteByExample(PaperPublishLevelExample example);

    int deleteByPrimaryKey(Integer publishLevelId);

    int insert(PaperPublishLevel record);

    int insertSelective(PaperPublishLevel record);

    List<PaperPublishLevel> selectByExample(PaperPublishLevelExample example);

    PaperPublishLevel selectByPrimaryKey(Integer publishLevelId);

    int updateByExampleSelective(@Param("record") PaperPublishLevel record, @Param("example") PaperPublishLevelExample example);

    int updateByExample(@Param("record") PaperPublishLevel record, @Param("example") PaperPublishLevelExample example);

    int updateByPrimaryKeySelective(PaperPublishLevel record);

    int updateByPrimaryKey(PaperPublishLevel record);
}