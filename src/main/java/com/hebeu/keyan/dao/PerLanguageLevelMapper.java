package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PerLanguageLevel;
import com.hebeu.keyan.po.PerLanguageLevelExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PerLanguageLevelMapper {
    int countByExample(PerLanguageLevelExample example);

    int deleteByExample(PerLanguageLevelExample example);

    int deleteByPrimaryKey(Integer languageLevelId);

    int insert(PerLanguageLevel record);

    int insertSelective(PerLanguageLevel record);

    List<PerLanguageLevel> selectByExample(PerLanguageLevelExample example);

    PerLanguageLevel selectByPrimaryKey(Integer languageLevelId);

    int updateByExampleSelective(@Param("record") PerLanguageLevel record, @Param("example") PerLanguageLevelExample example);

    int updateByExample(@Param("record") PerLanguageLevel record, @Param("example") PerLanguageLevelExample example);

    int updateByPrimaryKeySelective(PerLanguageLevel record);

    int updateByPrimaryKey(PerLanguageLevel record);
}