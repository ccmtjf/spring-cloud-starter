package com.demo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @author gexb
 * @date 2018/3/27
 * @description TODO
 */
@SpringBootApplication
public class RouteApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(RouteApplication.class,args);
    }
    
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(t -> t.path("/baidu").uri("http://www.baidu.com"))
                .build();
    }
}
