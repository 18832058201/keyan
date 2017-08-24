package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PubResearchType;
import com.hebeu.keyan.po.PubResearchTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PubResearchTypeMapper {
    int countByExample(PubResearchTypeExample example);

    int deleteByExample(PubResearchTypeExample example);

    int deleteByPrimaryKey(Integer researchTypeId);

    int insert(PubResearchType record);

    int insertSelective(PubResearchType record);

    List<PubResearchType> selectByExample(PubResearchTypeExample example);

    PubResearchType selectByPrimaryKey(Integer researchTypeId);

    int updateByExampleSelective(@Param("record") PubResearchType record, @Param("example") PubResearchTypeExample example);

    int updateByExample(@Param("record") PubResearchType record, @Param("example") PubResearchTypeExample example);

    int updateByPrimaryKeySelective(PubResearchType record);

    int updateByPrimaryKey(PubResearchType record);
}