package com.li.service;


import com.li.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private BookService bookService;
    @Test
    public void testGetById(){
        Book byId = bookService.getById(1);
        System.out.println(byId);
    }
    @Test
    public void testGetAll(){
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }
}
