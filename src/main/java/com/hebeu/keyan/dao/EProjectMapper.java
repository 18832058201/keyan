package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.EProject;
import com.hebeu.keyan.po.EProjectExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EProjectMapper {
    int countByExample(EProjectExample example);

    int deleteByExample(EProjectExample example);

    int deleteByPrimaryKey(String projectId);

    int insert(EProject record);

    int insertSelective(EProject record);

    List<EProject> selectByExample(EProjectExample example);

    EProject selectByPrimaryKey(String projectId);

    int updateByExampleSelective(@Param("record") EProject record, @Param("example") EProjectExample example);

    int updateByExample(@Param("record") EProject record, @Param("example") EProjectExample example);

    int updateByPrimaryKeySelective(EProject record);

    int updateByPrimaryKey(EProject record);
}