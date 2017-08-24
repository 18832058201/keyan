package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.EIdentify;
import com.hebeu.keyan.po.EIdentifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EIdentifyMapper {
    int countByExample(EIdentifyExample example);

    int deleteByExample(EIdentifyExample example);

    int deleteByPrimaryKey(String identifyId);

    int insert(EIdentify record);

    int insertSelective(EIdentify record);

    List<EIdentify> selectByExample(EIdentifyExample example);

    EIdentify selectByPrimaryKey(String identifyId);

    int updateByExampleSelective(@Param("record") EIdentify record, @Param("example") EIdentifyExample example);

    int updateByExample(@Param("record") EIdentify record, @Param("example") EIdentifyExample example);

    int updateByPrimaryKeySelective(EIdentify record);

    int updateByPrimaryKey(EIdentify record);
}