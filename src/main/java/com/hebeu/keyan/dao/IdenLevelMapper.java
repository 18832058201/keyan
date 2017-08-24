package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.IdenLevel;
import com.hebeu.keyan.po.IdenLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IdenLevelMapper {
    int countByExample(IdenLevelExample example);

    int deleteByExample(IdenLevelExample example);

    int deleteByPrimaryKey(Integer idenLevelId);

    int insert(IdenLevel record);

    int insertSelective(IdenLevel record);

    List<IdenLevel> selectByExample(IdenLevelExample example);

    IdenLevel selectByPrimaryKey(Integer idenLevelId);

    int updateByExampleSelective(@Param("record") IdenLevel record, @Param("example") IdenLevelExample example);

    int updateByExample(@Param("record") IdenLevel record, @Param("example") IdenLevelExample example);

    int updateByPrimaryKeySelective(IdenLevel record);

    int updateByPrimaryKey(IdenLevel record);
}