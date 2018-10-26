package com.demo.user.api;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author gexb
 * @date 2018/3/27
 * @description TODO
 */
@FeignClient("user-application")
@ConditionalOnMissingClass("com.demo.user.UserApplication")
public interface IUserController {
    
    @GetMapping("test")
    List<Integer> test();

}
