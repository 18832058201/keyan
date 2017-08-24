package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.ECollege;
import com.hebeu.keyan.po.ECollegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ECollegeMapper {
    int countByExample(ECollegeExample example);

    int deleteByExample(ECollegeExample example);

    int deleteByPrimaryKey(Integer collegeId);

    int insert(ECollege record);

    int insertSelective(ECollege record);

    List<ECollege> selectByExample(ECollegeExample example);

    ECollege selectByPrimaryKey(Integer collegeId);

    int updateByExampleSelective(@Param("record") ECollege record, @Param("example") ECollegeExample example);

    int updateByExample(@Param("record") ECollege record, @Param("example") ECollegeExample example);

    int updateByPrimaryKeySelective(ECollege record);

    int updateByPrimaryKey(ECollege record);
}