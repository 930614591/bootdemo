package com.li.boot_7_test.service.impl;

import com.li.boot_7_test.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("save......ok!");
    }
}
