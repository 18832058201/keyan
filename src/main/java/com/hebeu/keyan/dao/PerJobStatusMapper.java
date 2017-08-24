package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PerJobStatus;
import com.hebeu.keyan.po.PerJobStatusExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PerJobStatusMapper {
    int countByExample(PerJobStatusExample example);

    int deleteByExample(PerJobStatusExample example);

    int deleteByPrimaryKey(Integer jobStatusId);

    int insert(PerJobStatus record);

    int insertSelective(PerJobStatus record);

    List<PerJobStatus> selectByExample(PerJobStatusExample example);

    PerJobStatus selectByPrimaryKey(Integer jobStatusId);

    int updateByExampleSelective(@Param("record") PerJobStatus record, @Param("example") PerJobStatusExample example);

    int updateByExample(@Param("record") PerJobStatus record, @Param("example") PerJobStatusExample example);

    int updateByPrimaryKeySelective(PerJobStatus record);

    int updateByPrimaryKey(PerJobStatus record);
}