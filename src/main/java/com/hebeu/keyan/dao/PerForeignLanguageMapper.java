package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PerForeignLanguage;
import com.hebeu.keyan.po.PerForeignLanguageExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PerForeignLanguageMapper {
    int countByExample(PerForeignLanguageExample example);

    int deleteByExample(PerForeignLanguageExample example);

    int deleteByPrimaryKey(Integer foreignLanguageId);

    int insert(PerForeignLanguage record);

    int insertSelective(PerForeignLanguage record);

    List<PerForeignLanguage> selectByExample(PerForeignLanguageExample example);

    PerForeignLanguage selectByPrimaryKey(Integer foreignLanguageId);

    int updateByExampleSelective(@Param("record") PerForeignLanguage record, @Param("example") PerForeignLanguageExample example);

    int updateByExample(@Param("record") PerForeignLanguage record, @Param("example") PerForeignLanguageExample example);

    int updateByPrimaryKeySelective(PerForeignLanguage record);

    int updateByPrimaryKey(PerForeignLanguage record);
}