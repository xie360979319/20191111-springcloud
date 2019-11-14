package com.aaa.qy101.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder){
        return routeLocatorBuilder.routes()
                .route("baidu-provider",
                        p -> p.path("/baidu")
                                .filters(f -> f.addRequestHeader("name","zhangsan"))
                                .uri("http://www.baidu.com"))
                .build();
    }
}
