package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.ProResultForm;
import com.hebeu.keyan.po.ProResultFormExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProResultFormMapper {
    int countByExample(ProResultFormExample example);

    int deleteByExample(ProResultFormExample example);

    int deleteByPrimaryKey(Integer resultFormId);

    int insert(ProResultForm record);

    int insertSelective(ProResultForm record);

    List<ProResultForm> selectByExample(ProResultFormExample example);

    ProResultForm selectByPrimaryKey(Integer resultFormId);

    int updateByExampleSelective(@Param("record") ProResultForm record, @Param("example") ProResultFormExample example);

    int updateByExample(@Param("record") ProResultForm record, @Param("example") ProResultFormExample example);

    int updateByPrimaryKeySelective(ProResultForm record);

    int updateByPrimaryKey(ProResultForm record);
}