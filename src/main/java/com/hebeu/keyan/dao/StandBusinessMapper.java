package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.StandBusiness;
import com.hebeu.keyan.po.StandBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StandBusinessMapper {
    int countByExample(StandBusinessExample example);

    int deleteByExample(StandBusinessExample example);

    int deleteByPrimaryKey(Integer standBusinessId);

    int insert(StandBusiness record);

    int insertSelective(StandBusiness record);

    List<StandBusiness> selectByExample(StandBusinessExample example);

    StandBusiness selectByPrimaryKey(Integer standBusinessId);

    int updateByExampleSelective(@Param("record") StandBusiness record, @Param("example") StandBusinessExample example);

    int updateByExample(@Param("record") StandBusiness record, @Param("example") StandBusinessExample example);

    int updateByPrimaryKeySelective(StandBusiness record);

    int updateByPrimaryKey(StandBusiness record);
}