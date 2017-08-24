package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PaperPublishType;
import com.hebeu.keyan.po.PaperPublishTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PaperPublishTypeMapper {
    int countByExample(PaperPublishTypeExample example);

    int deleteByExample(PaperPublishTypeExample example);

    int deleteByPrimaryKey(Integer publishTypeId);

    int insert(PaperPublishType record);

    int insertSelective(PaperPublishType record);

    List<PaperPublishType> selectByExample(PaperPublishTypeExample example);

    PaperPublishType selectByPrimaryKey(Integer publishTypeId);

    int updateByExampleSelective(@Param("record") PaperPublishType record, @Param("example") PaperPublishTypeExample example);

    int updateByExample(@Param("record") PaperPublishType record, @Param("example") PaperPublishTypeExample example);

    int updateByPrimaryKeySelective(PaperPublishType record);

    int updateByPrimaryKey(PaperPublishType record);
}