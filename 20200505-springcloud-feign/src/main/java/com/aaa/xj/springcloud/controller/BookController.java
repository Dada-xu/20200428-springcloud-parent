package com.aaa.xj.springcloud.controller;

import com.aaa.xj.springcloud.service.IBookService;
import com.aaa.xj.springcloud.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping("/all")
    public ResultData selectAllBooks(){
        ResultData resultData = bookService.selectAllBooks();
       return resultData;
    }
}
