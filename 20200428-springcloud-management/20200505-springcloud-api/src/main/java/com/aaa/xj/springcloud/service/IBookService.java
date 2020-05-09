package com.aaa.xj.springcloud.service;

import com.aaa.xj.springcloud.fallback.FallbackService;
import com.aaa.xj.springcloud.util.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(value ="book-provider",fallbackFactory = FallbackService.class)
public interface IBookService {

    @GetMapping("/all")
    public ResultData selectAllBooks();
}
