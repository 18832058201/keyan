package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.ProCooperationType;
import com.hebeu.keyan.po.ProCooperationTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProCooperationTypeMapper {
    int countByExample(ProCooperationTypeExample example);

    int deleteByExample(ProCooperationTypeExample example);

    int deleteByPrimaryKey(Integer cooperationTypeId);

    int insert(ProCooperationType record);

    int insertSelective(ProCooperationType record);

    List<ProCooperationType> selectByExample(ProCooperationTypeExample example);

    ProCooperationType selectByPrimaryKey(Integer cooperationTypeId);

    int updateByExampleSelective(@Param("record") ProCooperationType record, @Param("example") ProCooperationTypeExample example);

    int updateByExample(@Param("record") ProCooperationType record, @Param("example") ProCooperationTypeExample example);

    int updateByPrimaryKeySelective(ProCooperationType record);

    int updateByPrimaryKey(ProCooperationType record);
}