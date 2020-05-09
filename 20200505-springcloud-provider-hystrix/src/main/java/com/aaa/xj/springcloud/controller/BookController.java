package com.aaa.xj.springcloud.controller;

import com.aaa.xj.springcloud.service.BookService;
import com.aaa.xj.springcloud.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public ResultData selectAllBooks() throws  Exception{
        Map<String, Object> books = bookService.selectAllBook();
        if(books.size() > 0) {
            // 说明数据库中有值，说明程序是对的(按照咱们目前的情况，一定会进if中)
            // 所以直接抛出异常
            throw new Exception("故意抛出异常");// 必会抛出异常
        }
        return (ResultData) books;
    }
}
