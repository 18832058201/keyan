package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.EPatent;
import com.hebeu.keyan.po.EPatentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EPatentMapper {
    int countByExample(EPatentExample example);

    int deleteByExample(EPatentExample example);

    int deleteByPrimaryKey(String patentId);

    int insert(EPatent record);

    int insertSelective(EPatent record);

    List<EPatent> selectByExample(EPatentExample example);

    EPatent selectByPrimaryKey(String patentId);

    int updateByExampleSelective(@Param("record") EPatent record, @Param("example") EPatentExample example);

    int updateByExample(@Param("record") EPatent record, @Param("example") EPatentExample example);

    int updateByPrimaryKeySelective(EPatent record);

    int updateByPrimaryKey(EPatent record);
}