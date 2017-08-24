package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.ProProjectSource;
import com.hebeu.keyan.po.ProProjectSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProProjectSourceMapper {
    int countByExample(ProProjectSourceExample example);

    int deleteByExample(ProProjectSourceExample example);

    int deleteByPrimaryKey(Integer projectSourceId);

    int insert(ProProjectSource record);

    int insertSelective(ProProjectSource record);

    List<ProProjectSource> selectByExample(ProProjectSourceExample example);

    ProProjectSource selectByPrimaryKey(Integer projectSourceId);

    int updateByExampleSelective(@Param("record") ProProjectSource record, @Param("example") ProProjectSourceExample example);

    int updateByExample(@Param("record") ProProjectSource record, @Param("example") ProProjectSourceExample example);

    int updateByPrimaryKeySelective(ProProjectSource record);

    int updateByPrimaryKey(ProProjectSource record);
}