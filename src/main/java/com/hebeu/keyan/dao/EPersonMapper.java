package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.EPerson;
import com.hebeu.keyan.po.EPersonExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EPersonMapper {
    int countByExample(EPersonExample example);

    int deleteByExample(EPersonExample example);

    int deleteByPrimaryKey(String workNum);

    int insert(EPerson record);

    int insertSelective(EPerson record);

    List<EPerson> selectByExample(EPersonExample example);

    EPerson selectByPrimaryKey(String workNum);

    int updateByExampleSelective(@Param("record") EPerson record, @Param("example") EPersonExample example);

    int updateByExample(@Param("record") EPerson record, @Param("example") EPersonExample example);

    int updateByPrimaryKeySelective(EPerson record);

    int updateByPrimaryKey(EPerson record);
}