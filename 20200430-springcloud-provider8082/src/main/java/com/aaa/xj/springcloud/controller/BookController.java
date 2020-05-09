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

    /**
     *@Summary:
     *@Author:  xj
     *@description
     *      查询所有图书
     *@Data: 2020/4/28 10:38
     *@Return:com.aaa.xj.springcloud.util.ResultData
     */
    @GetMapping("/all")
    public ResultData selectAllBooks(){
        Map<String, Object> books = bookService.selectAllBook();
        System.out.println("8082");
        if (books.size()>0){
            return new ResultData(true,"成功",books);
        }
        return new ResultData(false,"失败",null);
    }
}
