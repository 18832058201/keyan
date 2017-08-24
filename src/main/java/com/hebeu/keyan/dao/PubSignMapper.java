package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PubSign;
import com.hebeu.keyan.po.PubSignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PubSignMapper {
    int countByExample(PubSignExample example);

    int deleteByExample(PubSignExample example);

    int deleteByPrimaryKey(Integer signId);

    int insert(PubSign record);

    int insertSelective(PubSign record);

    List<PubSign> selectByExample(PubSignExample example);

    PubSign selectByPrimaryKey(Integer signId);

    int updateByExampleSelective(@Param("record") PubSign record, @Param("example") PubSignExample example);

    int updateByExample(@Param("record") PubSign record, @Param("example") PubSignExample example);

    int updateByPrimaryKeySelective(PubSign record);

    int updateByPrimaryKey(PubSign record);
}