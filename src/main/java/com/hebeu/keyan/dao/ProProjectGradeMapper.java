package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.ProProjectGrade;
import com.hebeu.keyan.po.ProProjectGradeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProProjectGradeMapper {
    int countByExample(ProProjectGradeExample example);

    int deleteByExample(ProProjectGradeExample example);

    int deleteByPrimaryKey(Integer projectGradeId);

    int insert(ProProjectGrade record);

    int insertSelective(ProProjectGrade record);

    List<ProProjectGrade> selectByExample(ProProjectGradeExample example);

    ProProjectGrade selectByPrimaryKey(Integer projectGradeId);

    int updateByExampleSelective(@Param("record") ProProjectGrade record, @Param("example") ProProjectGradeExample example);

    int updateByExample(@Param("record") ProProjectGrade record, @Param("example") ProProjectGradeExample example);

    int updateByPrimaryKeySelective(ProProjectGrade record);

    int updateByPrimaryKey(ProProjectGrade record);
}