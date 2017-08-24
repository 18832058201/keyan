package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.IdenForm;
import com.hebeu.keyan.po.IdenFormExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IdenFormMapper {
    int countByExample(IdenFormExample example);

    int deleteByExample(IdenFormExample example);

    int deleteByPrimaryKey(Integer formId);

    int insert(IdenForm record);

    int insertSelective(IdenForm record);

    List<IdenForm> selectByExample(IdenFormExample example);

    IdenForm selectByPrimaryKey(Integer formId);

    int updateByExampleSelective(@Param("record") IdenForm record, @Param("example") IdenFormExample example);

    int updateByExample(@Param("record") IdenForm record, @Param("example") IdenFormExample example);

    int updateByPrimaryKeySelective(IdenForm record);

    int updateByPrimaryKey(IdenForm record);
}