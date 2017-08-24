package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.ProEconomicsIndustry3;
import com.hebeu.keyan.po.ProEconomicsIndustry3Example;
import com.hebeu.keyan.po.ProEconomicsIndustry3Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProEconomicsIndustry3Mapper {
    int countByExample(ProEconomicsIndustry3Example example);

    int deleteByExample(ProEconomicsIndustry3Example example);

    int deleteByPrimaryKey(ProEconomicsIndustry3Key key);

    int insert(ProEconomicsIndustry3 record);

    int insertSelective(ProEconomicsIndustry3 record);

    List<ProEconomicsIndustry3> selectByExample(ProEconomicsIndustry3Example example);

    ProEconomicsIndustry3 selectByPrimaryKey(ProEconomicsIndustry3Key key);

    int updateByExampleSelective(@Param("record") ProEconomicsIndustry3 record, @Param("example") ProEconomicsIndustry3Example example);

    int updateByExample(@Param("record") ProEconomicsIndustry3 record, @Param("example") ProEconomicsIndustry3Example example);

    int updateByPrimaryKeySelective(ProEconomicsIndustry3 record);

    int updateByPrimaryKey(ProEconomicsIndustry3 record);
}