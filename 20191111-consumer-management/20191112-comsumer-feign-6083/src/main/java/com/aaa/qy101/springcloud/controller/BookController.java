package com.aaa.qy101.springcloud.controller;


import com.aaa.qy101.springcloud.model.Book;
import com.aaa.qy101.springcloud.service.ISpringcloudService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private ISpringcloudService iSpringcloudService;

    @GetMapping("/all")
    public List<Book> selectAll() throws Exception{

        return iSpringcloudService.selectAll();
    }

}
