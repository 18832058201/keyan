package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.ProProjectDomain;
import com.hebeu.keyan.po.ProProjectDomainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProProjectDomainMapper {
    int countByExample(ProProjectDomainExample example);

    int deleteByExample(ProProjectDomainExample example);

    int deleteByPrimaryKey(Integer projectDomainId);

    int insert(ProProjectDomain record);

    int insertSelective(ProProjectDomain record);

    List<ProProjectDomain> selectByExample(ProProjectDomainExample example);

    ProProjectDomain selectByPrimaryKey(Integer projectDomainId);

    int updateByExampleSelective(@Param("record") ProProjectDomain record, @Param("example") ProProjectDomainExample example);

    int updateByExample(@Param("record") ProProjectDomain record, @Param("example") ProProjectDomainExample example);

    int updateByPrimaryKeySelective(ProProjectDomain record);

    int updateByPrimaryKey(ProProjectDomain record);
}