package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.RRewardResult;
import com.hebeu.keyan.po.RRewardResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RRewardResultMapper {
    int countByExample(RRewardResultExample example);

    int deleteByExample(RRewardResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RRewardResult record);

    int insertSelective(RRewardResult record);

    List<RRewardResult> selectByExample(RRewardResultExample example);

    RRewardResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RRewardResult record, @Param("example") RRewardResultExample example);

    int updateByExample(@Param("record") RRewardResult record, @Param("example") RRewardResultExample example);

    int updateByPrimaryKeySelective(RRewardResult record);

    int updateByPrimaryKey(RRewardResult record);
}