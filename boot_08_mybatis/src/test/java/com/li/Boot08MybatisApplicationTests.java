package com.li;

import com.li.dao.BookDao;
import com.li.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Boot08MybatisApplicationTests {

    @Autowired
    private BookDao bookDao;
    @Test
    void testGetById() {
        Book byId = bookDao.getById(1);
        System.out.println(byId);
    }

}
