package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author gexb
 * @date 2018/3/27
 * @description TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class DemoApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }
}
