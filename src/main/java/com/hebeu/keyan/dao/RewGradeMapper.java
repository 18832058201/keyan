package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.RewGrade;
import com.hebeu.keyan.po.RewGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RewGradeMapper {
    int countByExample(RewGradeExample example);

    int deleteByExample(RewGradeExample example);

    int deleteByPrimaryKey(Integer rewGradeId);

    int insert(RewGrade record);

    int insertSelective(RewGrade record);

    List<RewGrade> selectByExample(RewGradeExample example);

    RewGrade selectByPrimaryKey(Integer rewGradeId);

    int updateByExampleSelective(@Param("record") RewGrade record, @Param("example") RewGradeExample example);

    int updateByExample(@Param("record") RewGrade record, @Param("example") RewGradeExample example);

    int updateByPrimaryKeySelective(RewGrade record);

    int updateByPrimaryKey(RewGrade record);
}