package com.hebeu.keyan.dao;

import com.hebeu.keyan.po.BookType;
import com.hebeu.keyan.po.BookTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookTypeMapper {
    int countByExample(BookTypeExample example);

    int deleteByExample(BookTypeExample example);

    int deleteByPrimaryKey(Integer bookTypeId);

    int insert(BookType record);

    int insertSelective(BookType record);

    List<BookType> selectByExample(BookTypeExample example);

    BookType selectByPrimaryKey(Integer bookTypeId);

    int updateByExampleSelective(@Param("record") BookType record, @Param("example") BookTypeExample example);

    int updateByExample(@Param("record") BookType record, @Param("example") BookTypeExample example);

    int updateByPrimaryKeySelective(BookType record);

    int updateByPrimaryKey(BookType record);
}