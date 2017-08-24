package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.ProProjectType1;
import com.hebeu.keyan.po.ProProjectType1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProProjectType1Mapper {
    int countByExample(ProProjectType1Example example);

    int deleteByExample(ProProjectType1Example example);

    int deleteByPrimaryKey(Integer projectType1Id);

    int insert(ProProjectType1 record);

    int insertSelective(ProProjectType1 record);

    List<ProProjectType1> selectByExample(ProProjectType1Example example);

    ProProjectType1 selectByPrimaryKey(Integer projectType1Id);

    int updateByExampleSelective(@Param("record") ProProjectType1 record, @Param("example") ProProjectType1Example example);

    int updateByExample(@Param("record") ProProjectType1 record, @Param("example") ProProjectType1Example example);

    int updateByPrimaryKeySelective(ProProjectType1 record);

    int updateByPrimaryKey(ProProjectType1 record);
}