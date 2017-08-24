package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.ProEconomicsIndustry1;
import com.hebeu.keyan.po.ProEconomicsIndustry1Example;
import com.hebeu.keyan.po.ProEconomicsIndustry1Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProEconomicsIndustry1Mapper {
    int countByExample(ProEconomicsIndustry1Example example);

    int deleteByExample(ProEconomicsIndustry1Example example);

    int deleteByPrimaryKey(ProEconomicsIndustry1Key key);

    int insert(ProEconomicsIndustry1 record);

    int insertSelective(ProEconomicsIndustry1 record);

    List<ProEconomicsIndustry1> selectByExample(ProEconomicsIndustry1Example example);

    ProEconomicsIndustry1 selectByPrimaryKey(ProEconomicsIndustry1Key key);

    int updateByExampleSelective(@Param("record") ProEconomicsIndustry1 record, @Param("example") ProEconomicsIndustry1Example example);

    int updateByExample(@Param("record") ProEconomicsIndustry1 record, @Param("example") ProEconomicsIndustry1Example example);

    int updateByPrimaryKeySelective(ProEconomicsIndustry1 record);

    int updateByPrimaryKey(ProEconomicsIndustry1 record);
}