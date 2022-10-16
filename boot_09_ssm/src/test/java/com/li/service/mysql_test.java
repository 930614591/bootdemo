package com.li.service;


import com.li.dao.BookDao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class mysql_test {
    @Autowired
    private BookDao bookDao;
    @Test
    public void test() {

        System.out.println(bookDao.getAll());
    }
}
