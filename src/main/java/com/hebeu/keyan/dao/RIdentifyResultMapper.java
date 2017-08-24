package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.RIdentifyResult;
import com.hebeu.keyan.po.RIdentifyResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RIdentifyResultMapper {
    int countByExample(RIdentifyResultExample example);

    int deleteByExample(RIdentifyResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RIdentifyResult record);

    int insertSelective(RIdentifyResult record);

    List<RIdentifyResult> selectByExample(RIdentifyResultExample example);

    RIdentifyResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RIdentifyResult record, @Param("example") RIdentifyResultExample example);

    int updateByExample(@Param("record") RIdentifyResult record, @Param("example") RIdentifyResultExample example);

    int updateByPrimaryKeySelective(RIdentifyResult record);

    int updateByPrimaryKey(RIdentifyResult record);
}