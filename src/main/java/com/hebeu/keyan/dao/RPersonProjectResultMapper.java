package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.RPersonProjectResult;
import com.hebeu.keyan.po.RPersonProjectResultExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RPersonProjectResultMapper {
    int countByExample(RPersonProjectResultExample example);

    int deleteByExample(RPersonProjectResultExample example);

    int insert(RPersonProjectResult record);

    int insertSelective(RPersonProjectResult record);

    List<RPersonProjectResult> selectByExample(RPersonProjectResultExample example);

    int updateByExampleSelective(@Param("record") RPersonProjectResult record, @Param("example") RPersonProjectResultExample example);

    int updateByExample(@Param("record") RPersonProjectResult record, @Param("example") RPersonProjectResultExample example);
}