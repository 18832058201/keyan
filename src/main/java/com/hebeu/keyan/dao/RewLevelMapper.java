package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.RewLevel;
import com.hebeu.keyan.po.RewLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RewLevelMapper {
    int countByExample(RewLevelExample example);

    int deleteByExample(RewLevelExample example);

    int deleteByPrimaryKey(Integer rewLevelId);

    int insert(RewLevel record);

    int insertSelective(RewLevel record);

    List<RewLevel> selectByExample(RewLevelExample example);

    RewLevel selectByPrimaryKey(Integer rewLevelId);

    int updateByExampleSelective(@Param("record") RewLevel record, @Param("example") RewLevelExample example);

    int updateByExample(@Param("record") RewLevel record, @Param("example") RewLevelExample example);

    int updateByPrimaryKeySelective(RewLevel record);

    int updateByPrimaryKey(RewLevel record);
}