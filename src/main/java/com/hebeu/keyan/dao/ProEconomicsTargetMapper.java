package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.ProEconomicsTarget;
import com.hebeu.keyan.po.ProEconomicsTargetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProEconomicsTargetMapper {
    int countByExample(ProEconomicsTargetExample example);

    int deleteByExample(ProEconomicsTargetExample example);

    int deleteByPrimaryKey(Integer economicsTargetId);

    int insert(ProEconomicsTarget record);

    int insertSelective(ProEconomicsTarget record);

    List<ProEconomicsTarget> selectByExample(ProEconomicsTargetExample example);

    ProEconomicsTarget selectByPrimaryKey(Integer economicsTargetId);

    int updateByExampleSelective(@Param("record") ProEconomicsTarget record, @Param("example") ProEconomicsTargetExample example);

    int updateByExample(@Param("record") ProEconomicsTarget record, @Param("example") ProEconomicsTargetExample example);

    int updateByPrimaryKeySelective(ProEconomicsTarget record);

    int updateByPrimaryKey(ProEconomicsTarget record);
}