package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.IdenResultLevel;
import com.hebeu.keyan.po.IdenResultLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IdenResultLevelMapper {
    int countByExample(IdenResultLevelExample example);

    int deleteByExample(IdenResultLevelExample example);

    int deleteByPrimaryKey(Integer resultLevelId);

    int insert(IdenResultLevel record);

    int insertSelective(IdenResultLevel record);

    List<IdenResultLevel> selectByExample(IdenResultLevelExample example);

    IdenResultLevel selectByPrimaryKey(Integer resultLevelId);

    int updateByExampleSelective(@Param("record") IdenResultLevel record, @Param("example") IdenResultLevelExample example);

    int updateByExample(@Param("record") IdenResultLevel record, @Param("example") IdenResultLevelExample example);

    int updateByPrimaryKeySelective(IdenResultLevel record);

    int updateByPrimaryKey(IdenResultLevel record);
}