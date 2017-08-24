package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.EBook;
import com.hebeu.keyan.po.EBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EBookMapper {
    int countByExample(EBookExample example);

    int deleteByExample(EBookExample example);

    int deleteByPrimaryKey(String bookId);

    int insert(EBook record);

    int insertSelective(EBook record);

    List<EBook> selectByExample(EBookExample example);

    EBook selectByPrimaryKey(String bookId);

    int updateByExampleSelective(@Param("record") EBook record, @Param("example") EBookExample example);

    int updateByExample(@Param("record") EBook record, @Param("example") EBookExample example);

    int updateByPrimaryKeySelective(EBook record);

    int updateByPrimaryKey(EBook record);
}