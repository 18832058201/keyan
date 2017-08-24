package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.RewClass;
import com.hebeu.keyan.po.RewClassExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RewClassMapper {
    int countByExample(RewClassExample example);

    int deleteByExample(RewClassExample example);

    int deleteByPrimaryKey(Integer rewClassId);

    int insert(RewClass record);

    int insertSelective(RewClass record);

    List<RewClass> selectByExample(RewClassExample example);

    RewClass selectByPrimaryKey(Integer rewClassId);

    int updateByExampleSelective(@Param("record") RewClass record, @Param("example") RewClassExample example);

    int updateByExample(@Param("record") RewClass record, @Param("example") RewClassExample example);

    int updateByPrimaryKeySelective(RewClass record);

    int updateByPrimaryKey(RewClass record);
}