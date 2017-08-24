package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.RProjectResult;
import com.hebeu.keyan.po.RProjectResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RProjectResultMapper {
    int countByExample(RProjectResultExample example);

    int deleteByExample(RProjectResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RProjectResult record);

    int insertSelective(RProjectResult record);

    List<RProjectResult> selectByExample(RProjectResultExample example);

    RProjectResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RProjectResult record, @Param("example") RProjectResultExample example);

    int updateByExample(@Param("record") RProjectResult record, @Param("example") RProjectResultExample example);

    int updateByPrimaryKeySelective(RProjectResult record);

    int updateByPrimaryKey(RProjectResult record);
}