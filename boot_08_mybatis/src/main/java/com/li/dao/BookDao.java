package com.li.dao;

import com.li.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface BookDao {
    @Select("select * from book where id=#{id}")
    public Book getById(Integer id);
}
