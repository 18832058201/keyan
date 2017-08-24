package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.EPaper;
import com.hebeu.keyan.po.EPaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EPaperMapper {
    int countByExample(EPaperExample example);

    int deleteByExample(EPaperExample example);

    int deleteByPrimaryKey(String paperId);

    int insert(EPaper record);

    int insertSelective(EPaper record);

    List<EPaper> selectByExample(EPaperExample example);

    EPaper selectByPrimaryKey(String paperId);

    int updateByExampleSelective(@Param("record") EPaper record, @Param("example") EPaperExample example);

    int updateByExample(@Param("record") EPaper record, @Param("example") EPaperExample example);

    int updateByPrimaryKeySelective(EPaper record);

    int updateByPrimaryKey(EPaper record);
}