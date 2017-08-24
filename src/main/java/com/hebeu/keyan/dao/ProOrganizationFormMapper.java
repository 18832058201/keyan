package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.ProOrganizationForm;
import com.hebeu.keyan.po.ProOrganizationFormExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProOrganizationFormMapper {
    int countByExample(ProOrganizationFormExample example);

    int deleteByExample(ProOrganizationFormExample example);

    int deleteByPrimaryKey(Integer organizationFormId);

    int insert(ProOrganizationForm record);

    int insertSelective(ProOrganizationForm record);

    List<ProOrganizationForm> selectByExample(ProOrganizationFormExample example);

    ProOrganizationForm selectByPrimaryKey(Integer organizationFormId);

    int updateByExampleSelective(@Param("record") ProOrganizationForm record, @Param("example") ProOrganizationFormExample example);

    int updateByExample(@Param("record") ProOrganizationForm record, @Param("example") ProOrganizationFormExample example);

    int updateByPrimaryKeySelective(ProOrganizationForm record);

    int updateByPrimaryKey(ProOrganizationForm record);
}