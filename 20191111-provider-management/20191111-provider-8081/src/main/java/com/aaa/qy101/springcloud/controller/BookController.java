package com.aaa.qy101.springcloud.controller;

import com.aaa.qy101.springcloud.model.Book;
import com.aaa.qy101.springcloud.service.BookService;
import com.sun.tools.classfile.ConstantPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public List<Book> selectAll(){
        return bookService.selectAll();
    }
}
