package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.SealType;
import com.hebeu.keyan.po.SealTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SealTypeMapper {
    int countByExample(SealTypeExample example);

    int deleteByExample(SealTypeExample example);

    int deleteByPrimaryKey(Integer sealTypeId);

    int insert(SealType record);

    int insertSelective(SealType record);

    List<SealType> selectByExample(SealTypeExample example);

    SealType selectByPrimaryKey(Integer sealTypeId);

    int updateByExampleSelective(@Param("record") SealType record, @Param("example") SealTypeExample example);

    int updateByExample(@Param("record") SealType record, @Param("example") SealTypeExample example);

    int updateByPrimaryKeySelective(SealType record);

    int updateByPrimaryKey(SealType record);
}