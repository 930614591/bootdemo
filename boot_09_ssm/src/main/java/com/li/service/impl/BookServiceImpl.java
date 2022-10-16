package com.li.service.impl;

import com.li.controller.Code;
import com.li.dao.BookDao;
import com.li.domain.Book;
import com.li.exception.BusinessException;
import com.li.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    public Book getById(Integer id) {
        if(id==4){
            throw new BusinessException(Code.BUSINESS_ERR,"请勿非法操作");
        }
        //将可能出现的异常进行包装，转成自定义异常
//        try{
//            int i = 1 / 0;
//        }catch (Exception e) {
//            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器超时请重试0",e);
//        }
        return bookDao.getById(id);
    }

    public List<Book> getAll() {

        return bookDao.getAll();
    }
}
