package com.li.dao;

import com.li.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;
//TODO 添加mapper
@Mapper
public interface BookDao {

    //    @Insert("Insert into book (type,name,descrption) valus(#{tpye},#{name},#{descrption})")
    @Insert("Insert into book values(null,#{type},#{name},#{description})")
    public void save(Book book);

    @Update("update book set type=#{type},name=#{name},description=#{description} where id=#{id}")
    public void update(Book book);

    @Delete("delete from book where id=#{id}")
    public void delete(Integer id);

    @Select("select * from book where id=#{id}")
    public Book getById(Integer id);

    @Select("select * from book")
    public List<Book> getAll();
}
