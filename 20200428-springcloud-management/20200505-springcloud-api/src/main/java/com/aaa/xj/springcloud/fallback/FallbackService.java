package com.aaa.xj.springcloud.fallback;

import com.aaa.xj.springcloud.service.IBookService;
import com.aaa.xj.springcloud.util.ResultData;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FallbackService  implements FallbackFactory<IBookService> {


    public IBookService create(Throwable throwable) {
        IBookService bookService = new IBookService() {
            public ResultData selectAllBooks() {
                System.out.println("目前服务器正在处于降级阶段，请等待恢复通知！！");
                return null;
            }
        };
        return bookService;
    }
}
