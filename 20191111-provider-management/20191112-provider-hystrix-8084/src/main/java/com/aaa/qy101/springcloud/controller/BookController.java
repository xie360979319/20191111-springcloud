package com.aaa.qy101.springcloud.controller;

import com.aaa.qy101.springcloud.mapper.BookMapper;
import com.aaa.qy101.springcloud.model.Book;
import com.aaa.qy101.springcloud.service.BookService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    //@HystrixCommand(fallbackMethod = "selectAllBooksFallBack")
    public List<Book> selectAll() throws  Exception{

        List<Book> bookList = bookService.selectAll();
        if (bookList.size()>0){
            throw new Exception("模拟异常，测试熔断处理！");
        }
        return bookList;
    }
//    public List<Book> selectAllBooksFallBack() {
//        List<Book> bookList = new ArrayList<Book>();
//        Book book = new Book();
//        book.setId(100000000L);
//        book.setName("测试熔断-->图书名称");
//        book.setPrice(123.23);
//        bookList.add(book);
//        return bookList;
//    }
}
