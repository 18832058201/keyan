package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.PaperPublishRange;
import com.hebeu.keyan.po.PaperPublishRangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PaperPublishRangeMapper {
    int countByExample(PaperPublishRangeExample example);

    int deleteByExample(PaperPublishRangeExample example);

    int deleteByPrimaryKey(Integer publishRangeId);

    int insert(PaperPublishRange record);

    int insertSelective(PaperPublishRange record);

    List<PaperPublishRange> selectByExample(PaperPublishRangeExample example);

    PaperPublishRange selectByPrimaryKey(Integer publishRangeId);

    int updateByExampleSelective(@Param("record") PaperPublishRange record, @Param("example") PaperPublishRangeExample example);

    int updateByExample(@Param("record") PaperPublishRange record, @Param("example") PaperPublishRangeExample example);

    int updateByPrimaryKeySelective(PaperPublishRange record);

    int updateByPrimaryKey(PaperPublishRange record);
}