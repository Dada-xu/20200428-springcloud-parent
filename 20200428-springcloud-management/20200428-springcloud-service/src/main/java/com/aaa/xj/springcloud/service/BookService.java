package com.aaa.xj.springcloud.service;

import com.aaa.xj.springcloud.mapper.BookMapper;
import com.aaa.xj.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    /**
     *@Summary:
     *@Author:  xj
     *@description
     *      查询全部图书
     *@Data: 2020/4/28 9:59
     *@Return:java.util.Map<java.lang.String,java.lang.Object>
     */

    public Map<String, Object> selectAllBook(){
        Map<String, Object> resultMap = new HashMap<String, Object>();
        List<Book> books = bookMapper.selectAll();
        if (books.size()>0){
            try {
                resultMap.put("code","200");
                resultMap.put("msg","查询成功");
                resultMap.put("data", books);
                //抛异常，可能是数据库连接失败
            }catch (Exception e){
                resultMap.put("code","404");
                resultMap.put("msg","服务器维护，请稍后再试");
                resultMap.put("data",null);
                e.printStackTrace();
                return resultMap;
            }
        }else {
            resultMap.put("code","404");
            resultMap.put("msg","查询失败");
            resultMap.put("data",null);
        }
        return resultMap;
    }
}
