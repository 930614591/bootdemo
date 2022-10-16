package com.li.boot_7_test;

import com.li.boot_7_test.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Boot7TestApplicationTests {
    @Autowired
    private BookService bookService;
    @Test
    void contextLoads() {
        bookService.save();
    }

}
