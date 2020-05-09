package com.aaa.xj.springcloud.controller;

import com.aaa.xj.springcloud.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class BookController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;


    @GetMapping("Books")
    public ResultData selectAllBook(){
        return restTemplate.getForObject("http://BOOK-PROVIDER/all",ResultData.class);
    }



}
