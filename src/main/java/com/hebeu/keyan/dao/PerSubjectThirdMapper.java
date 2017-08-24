package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PerSubjectThird;
import com.hebeu.keyan.po.PerSubjectThirdExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PerSubjectThirdMapper {
    int countByExample(PerSubjectThirdExample example);

    int deleteByExample(PerSubjectThirdExample example);

    int deleteByPrimaryKey(Integer subjectThirdId);

    int insert(PerSubjectThird record);

    int insertSelective(PerSubjectThird record);

    List<PerSubjectThird> selectByExample(PerSubjectThirdExample example);

    PerSubjectThird selectByPrimaryKey(Integer subjectThirdId);

    int updateByExampleSelective(@Param("record") PerSubjectThird record, @Param("example") PerSubjectThirdExample example);

    int updateByExample(@Param("record") PerSubjectThird record, @Param("example") PerSubjectThirdExample example);

    int updateByPrimaryKeySelective(PerSubjectThird record);

    int updateByPrimaryKey(PerSubjectThird record);
}