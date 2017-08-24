package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.RewType;
import com.hebeu.keyan.po.RewTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RewTypeMapper {
    int countByExample(RewTypeExample example);

    int deleteByExample(RewTypeExample example);

    int deleteByPrimaryKey(Integer rewTypeId);

    int insert(RewType record);

    int insertSelective(RewType record);

    List<RewType> selectByExample(RewTypeExample example);

    RewType selectByPrimaryKey(Integer rewTypeId);

    int updateByExampleSelective(@Param("record") RewType record, @Param("example") RewTypeExample example);

    int updateByExample(@Param("record") RewType record, @Param("example") RewTypeExample example);

    int updateByPrimaryKeySelective(RewType record);

    int updateByPrimaryKey(RewType record);
}