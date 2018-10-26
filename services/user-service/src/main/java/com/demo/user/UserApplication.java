package com.demo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gexb
 * @date 2018/3/27
 * @description TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
