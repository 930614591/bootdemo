package com.li.controller;

import com.li.domain.Book;
import com.li.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@ResponseBody
public class BookController {
    @Autowired
    private BookService bookService;
    //保存一本书
    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean save = bookService.save(book);
        Result result = new Result(save ? Code.SAVE_OK : Code.SAVE_ERR, save);
        return result;

    }

    //更新一本书
    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean update = bookService.update(book);
        return new Result(update ? Code.UPDATE_OK:Code.UPDATE_ERR,update);
    }
    //删除一本书
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean delete = bookService.delete(id);
        return new Result(delete ? Code.DELETE_OK:Code.DELETE_ERR,delete);
    }
    //查找一本书
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
//        Integer i=1/0;
        Book byId = bookService.getById(id);
        return new Result(byId!=null ? Code.GET_OK:Code.GET_ERR,byId,byId!=null ? "": "没有找到这本书");
    }
    //查找所有书
    @GetMapping
    public Result getAll() {
        List<Book> all = bookService.getAll();
        return new Result(all!=null ? Code.GET_OK:Code.GET_ERR,all,all!=null ? "": "没有找到这本书");
    }
}
