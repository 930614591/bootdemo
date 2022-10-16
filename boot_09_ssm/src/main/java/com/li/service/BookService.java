package com.li.service;

import com.li.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional  //开启事务
public interface BookService {

    /*
     * 保存书籍
     * */
    public boolean save(Book book);

    /*
     * 修改书籍*/
    public boolean update(Book book);

    /*
     * 根据id删除*/
    public boolean delete(Integer id);

    /*
     * 根据id查询*/
    public Book getById(Integer id);

    /*查询所有
     * */
    public List<Book> getAll();
}
