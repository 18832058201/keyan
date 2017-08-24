package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.RewResultType;
import com.hebeu.keyan.po.RewResultTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RewResultTypeMapper {
    int countByExample(RewResultTypeExample example);

    int deleteByExample(RewResultTypeExample example);

    int deleteByPrimaryKey(Integer resultTypeId);

    int insert(RewResultType record);

    int insertSelective(RewResultType record);

    List<RewResultType> selectByExample(RewResultTypeExample example);

    RewResultType selectByPrimaryKey(Integer resultTypeId);

    int updateByExampleSelective(@Param("record") RewResultType record, @Param("example") RewResultTypeExample example);

    int updateByExample(@Param("record") RewResultType record, @Param("example") RewResultTypeExample example);

    int updateByPrimaryKeySelective(RewResultType record);

    int updateByPrimaryKey(RewResultType record);
}