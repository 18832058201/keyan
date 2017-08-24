package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.ProEconomicsIndustry2;
import com.hebeu.keyan.po.ProEconomicsIndustry2Example;
import com.hebeu.keyan.po.ProEconomicsIndustry2Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProEconomicsIndustry2Mapper {
    int countByExample(ProEconomicsIndustry2Example example);

    int deleteByExample(ProEconomicsIndustry2Example example);

    int deleteByPrimaryKey(ProEconomicsIndustry2Key key);

    int insert(ProEconomicsIndustry2 record);

    int insertSelective(ProEconomicsIndustry2 record);

    List<ProEconomicsIndustry2> selectByExample(ProEconomicsIndustry2Example example);

    ProEconomicsIndustry2 selectByPrimaryKey(ProEconomicsIndustry2Key key);

    int updateByExampleSelective(@Param("record") ProEconomicsIndustry2 record, @Param("example") ProEconomicsIndustry2Example example);

    int updateByExample(@Param("record") ProEconomicsIndustry2 record, @Param("example") ProEconomicsIndustry2Example example);

    int updateByPrimaryKeySelective(ProEconomicsIndustry2 record);

    int updateByPrimaryKey(ProEconomicsIndustry2 record);
}