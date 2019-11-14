package com.aaa.qy101.springcloud.fallback;

import com.aaa.qy101.springcloud.model.Book;
import com.aaa.qy101.springcloud.service.ISpringcloudService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ISpringCloudFallBackFactory implements FallbackFactory<ISpringcloudService> {
    @Override
    public ISpringcloudService create(Throwable throwable) {
        return new ISpringcloudService() {
            @Override
            public List<Book> selectAll() {
                System.out.println("我是熔断方法，我被访问了");
                List<Book> bookList = new ArrayList<Book>();
                Book book = new Book();
                book.setId(100000000L);
                book.setName("测试熔断-->图书名称");
                book.setPrice(123.23);
                bookList.add(book);
                return bookList;
            }
        };
    }
}
