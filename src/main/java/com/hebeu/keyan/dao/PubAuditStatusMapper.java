package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PubAuditStatus;
import com.hebeu.keyan.po.PubAuditStatusExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PubAuditStatusMapper {
    int countByExample(PubAuditStatusExample example);

    int deleteByExample(PubAuditStatusExample example);

    int deleteByPrimaryKey(Integer auditStatusId);

    int insert(PubAuditStatus record);

    int insertSelective(PubAuditStatus record);

    List<PubAuditStatus> selectByExample(PubAuditStatusExample example);

    PubAuditStatus selectByPrimaryKey(Integer auditStatusId);

    int updateByExampleSelective(@Param("record") PubAuditStatus record, @Param("example") PubAuditStatusExample example);

    int updateByExample(@Param("record") PubAuditStatus record, @Param("example") PubAuditStatusExample example);

    int updateByPrimaryKeySelective(PubAuditStatus record);

    int updateByPrimaryKey(PubAuditStatus record);
}