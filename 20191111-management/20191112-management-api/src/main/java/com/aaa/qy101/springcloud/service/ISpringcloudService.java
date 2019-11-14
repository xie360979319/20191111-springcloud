package com.aaa.qy101.springcloud.service;

import com.aaa.qy101.springcloud.fallback.ISpringCloudFallBackFactory;
import com.aaa.qy101.springcloud.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@FeignClient(value = "BOOK-PROVIDER",fallbackFactory = ISpringCloudFallBackFactory.class)
public interface ISpringcloudService {

    @RequestMapping("/all")
    List<Book> selectAll();
}
