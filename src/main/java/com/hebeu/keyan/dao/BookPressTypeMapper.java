package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.BookPressType;
import com.hebeu.keyan.po.BookPressTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookPressTypeMapper {
    int countByExample(BookPressTypeExample example);

    int deleteByExample(BookPressTypeExample example);

    int deleteByPrimaryKey(Integer pressTypeId);

    int insert(BookPressType record);

    int insertSelective(BookPressType record);

    List<BookPressType> selectByExample(BookPressTypeExample example);

    BookPressType selectByPrimaryKey(Integer pressTypeId);

    int updateByExampleSelective(@Param("record") BookPressType record, @Param("example") BookPressTypeExample example);

    int updateByExample(@Param("record") BookPressType record, @Param("example") BookPressTypeExample example);

    int updateByPrimaryKeySelective(BookPressType record);

    int updateByPrimaryKey(BookPressType record);
}