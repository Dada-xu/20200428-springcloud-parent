package com.aaa.xj.springcloud.controller;

import com.aaa.xj.springcloud.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class BookController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     *@Summary:
     *@Author:  xj
     *@description
     *          查询所有图书信息
     *@Data: 2020/4/28 10:39
     *@Return:com.aaa.xj.springcloud.util.ResultData
     */
    @GetMapping("allBook")
    public ResultData selectAllBook(){
        return restTemplate.getForObject("http://localhost:8080/all",ResultData.class);
    }
}
