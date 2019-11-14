package com.aaa.qy101.springcloud.controller;

import com.aaa.qy101.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class BookController  {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("all")
    public List<Book> selectAllBooks(){
        return restTemplate.getForObject("http://localhost:8081/all",List.class);
    }
}
