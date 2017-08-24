package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.EDepartment;
import com.hebeu.keyan.po.EDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EDepartmentMapper {
    int countByExample(EDepartmentExample example);

    int deleteByExample(EDepartmentExample example);

    int deleteByPrimaryKey(Integer departmentId);

    int insert(EDepartment record);

    int insertSelective(EDepartment record);

    List<EDepartment> selectByExample(EDepartmentExample example);

    EDepartment selectByPrimaryKey(Integer departmentId);

    int updateByExampleSelective(@Param("record") EDepartment record, @Param("example") EDepartmentExample example);

    int updateByExample(@Param("record") EDepartment record, @Param("example") EDepartmentExample example);

    int updateByPrimaryKeySelective(EDepartment record);

    int updateByPrimaryKey(EDepartment record);
}