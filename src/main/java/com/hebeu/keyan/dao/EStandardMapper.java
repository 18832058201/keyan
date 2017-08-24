package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.EStandard;
import com.hebeu.keyan.po.EStandardExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EStandardMapper {
    int countByExample(EStandardExample example);

    int deleteByExample(EStandardExample example);

    int deleteByPrimaryKey(String standardId);

    int insert(EStandard record);

    int insertSelective(EStandard record);

    List<EStandard> selectByExample(EStandardExample example);

    EStandard selectByPrimaryKey(String standardId);

    int updateByExampleSelective(@Param("record") EStandard record, @Param("example") EStandardExample example);

    int updateByExample(@Param("record") EStandard record, @Param("example") EStandardExample example);

    int updateByPrimaryKeySelective(EStandard record);

    int updateByPrimaryKey(EStandard record);
}