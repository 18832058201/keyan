package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.ProEndStatus;
import com.hebeu.keyan.po.ProEndStatusExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProEndStatusMapper {
    int countByExample(ProEndStatusExample example);

    int deleteByExample(ProEndStatusExample example);

    int deleteByPrimaryKey(Integer endStatusId);

    int insert(ProEndStatus record);

    int insertSelective(ProEndStatus record);

    List<ProEndStatus> selectByExample(ProEndStatusExample example);

    ProEndStatus selectByPrimaryKey(Integer endStatusId);

    int updateByExampleSelective(@Param("record") ProEndStatus record, @Param("example") ProEndStatusExample example);

    int updateByExample(@Param("record") ProEndStatus record, @Param("example") ProEndStatusExample example);

    int updateByPrimaryKeySelective(ProEndStatus record);

    int updateByPrimaryKey(ProEndStatus record);
}