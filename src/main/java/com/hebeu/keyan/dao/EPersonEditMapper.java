package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.EPersonEdit;
import com.hebeu.keyan.po.EPersonEditExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EPersonEditMapper {
    int countByExample(EPersonEditExample example);

    int deleteByExample(EPersonEditExample example);

    int deleteByPrimaryKey(String personEditId);

    int insert(EPersonEdit record);

    int insertSelective(EPersonEdit record);

    List<EPersonEdit> selectByExample(EPersonEditExample example);

    EPersonEdit selectByPrimaryKey(String personEditId);

    int updateByExampleSelective(@Param("record") EPersonEdit record, @Param("example") EPersonEditExample example);

    int updateByExample(@Param("record") EPersonEdit record, @Param("example") EPersonEditExample example);

    int updateByPrimaryKeySelective(EPersonEdit record);

    int updateByPrimaryKey(EPersonEdit record);
}