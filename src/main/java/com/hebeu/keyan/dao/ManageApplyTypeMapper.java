package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.ManageApplyType;
import com.hebeu.keyan.po.ManageApplyTypeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ManageApplyTypeMapper {
    int countByExample(ManageApplyTypeExample example);

    int deleteByExample(ManageApplyTypeExample example);

    int deleteByPrimaryKey(Integer applyTypeId);

    int insert(ManageApplyType record);

    int insertSelective(ManageApplyType record);

    List<ManageApplyType> selectByExample(ManageApplyTypeExample example);

    ManageApplyType selectByPrimaryKey(Integer applyTypeId);

    int updateByExampleSelective(@Param("record") ManageApplyType record, @Param("example") ManageApplyTypeExample example);

    int updateByExample(@Param("record") ManageApplyType record, @Param("example") ManageApplyTypeExample example);

    int updateByPrimaryKeySelective(ManageApplyType record);

    int updateByPrimaryKey(ManageApplyType record);
}