package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.EInclude;
import com.hebeu.keyan.po.EIncludeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EIncludeMapper {
    int countByExample(EIncludeExample example);

    int deleteByExample(EIncludeExample example);

    int deleteByPrimaryKey(String includeId);

    int insert(EInclude record);

    int insertSelective(EInclude record);

    List<EInclude> selectByExample(EIncludeExample example);

    EInclude selectByPrimaryKey(String includeId);

    int updateByExampleSelective(@Param("record") EInclude record, @Param("example") EIncludeExample example);

    int updateByExample(@Param("record") EInclude record, @Param("example") EIncludeExample example);

    int updateByPrimaryKeySelective(EInclude record);

    int updateByPrimaryKey(EInclude record);
}