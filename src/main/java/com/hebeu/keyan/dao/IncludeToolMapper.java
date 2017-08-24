package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.IncludeTool;
import com.hebeu.keyan.po.IncludeToolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IncludeToolMapper {
    int countByExample(IncludeToolExample example);

    int deleteByExample(IncludeToolExample example);

    int deleteByPrimaryKey(Integer includeToolId);

    int insert(IncludeTool record);

    int insertSelective(IncludeTool record);

    List<IncludeTool> selectByExample(IncludeToolExample example);

    IncludeTool selectByPrimaryKey(Integer includeToolId);

    int updateByExampleSelective(@Param("record") IncludeTool record, @Param("example") IncludeToolExample example);

    int updateByExample(@Param("record") IncludeTool record, @Param("example") IncludeToolExample example);

    int updateByPrimaryKeySelective(IncludeTool record);

    int updateByPrimaryKey(IncludeTool record);
}