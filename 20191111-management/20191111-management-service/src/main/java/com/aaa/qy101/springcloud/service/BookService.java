package com.aaa.qy101.springcloud.service;

import com.aaa.qy101.springcloud.mapper.BookMapper;
import com.aaa.qy101.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public List<Book> selectAll(){
        return bookMapper.selectAll();
    }
}
