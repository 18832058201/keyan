package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.ProProjectType2;
import com.hebeu.keyan.po.ProProjectType2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProProjectType2Mapper {
    int countByExample(ProProjectType2Example example);

    int deleteByExample(ProProjectType2Example example);

    int deleteByPrimaryKey(Integer projectType2Id);

    int insert(ProProjectType2 record);

    int insertSelective(ProProjectType2 record);

    List<ProProjectType2> selectByExample(ProProjectType2Example example);

    ProProjectType2 selectByPrimaryKey(Integer projectType2Id);

    int updateByExampleSelective(@Param("record") ProProjectType2 record, @Param("example") ProProjectType2Example example);

    int updateByExample(@Param("record") ProProjectType2 record, @Param("example") ProProjectType2Example example);

    int updateByPrimaryKeySelective(ProProjectType2 record);

    int updateByPrimaryKey(ProProjectType2 record);
}