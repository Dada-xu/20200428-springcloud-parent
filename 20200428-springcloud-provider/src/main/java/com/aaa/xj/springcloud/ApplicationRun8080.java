package com.aaa.xj.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.aaa.xj.springcloud.mapper")
@EnableDiscoveryClient
public class ApplicationRun8080 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8080.class,args);
    }
}
