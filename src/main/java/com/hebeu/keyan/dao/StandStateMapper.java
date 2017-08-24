package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.StandState;
import com.hebeu.keyan.po.StandStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StandStateMapper {
    int countByExample(StandStateExample example);

    int deleteByExample(StandStateExample example);

    int deleteByPrimaryKey(Integer standStateId);

    int insert(StandState record);

    int insertSelective(StandState record);

    List<StandState> selectByExample(StandStateExample example);

    StandState selectByPrimaryKey(Integer standStateId);

    int updateByExampleSelective(@Param("record") StandState record, @Param("example") StandStateExample example);

    int updateByExample(@Param("record") StandState record, @Param("example") StandStateExample example);

    int updateByPrimaryKeySelective(StandState record);

    int updateByPrimaryKey(StandState record);
}