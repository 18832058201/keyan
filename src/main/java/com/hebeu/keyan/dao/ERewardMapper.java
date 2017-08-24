package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.EReward;
import com.hebeu.keyan.po.ERewardExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ERewardMapper {
    int countByExample(ERewardExample example);

    int deleteByExample(ERewardExample example);

    int deleteByPrimaryKey(String rewardId);

    int insert(EReward record);

    int insertSelective(EReward record);

    List<EReward> selectByExample(ERewardExample example);

    EReward selectByPrimaryKey(String rewardId);

    int updateByExampleSelective(@Param("record") EReward record, @Param("example") ERewardExample example);

    int updateByExample(@Param("record") EReward record, @Param("example") ERewardExample example);

    int updateByPrimaryKeySelective(EReward record);

    int updateByPrimaryKey(EReward record);
}