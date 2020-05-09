package com.aaa.xj.springcloud.mapper;

import com.aaa.xj.springcloud.model.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookMapper {
    int deleteByPrimaryKey(Long bookId);

    int insert(Book record);

    Book selectByPrimaryKey(Long bookId);

    List<Book> selectAll();

    int updateByPrimaryKey(Book record);
}