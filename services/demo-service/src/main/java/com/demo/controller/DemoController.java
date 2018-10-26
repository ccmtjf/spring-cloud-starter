package com.demo.controller;

import com.demo.user.api.IUserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gexb
 * @date 2018/3/27
 * @description TODO
 */

@RestController
public class DemoController {

    @Autowired
    IUserController helloController;
    
    @GetMapping("/demoTest")
    public List<Integer> demoTest(){
        return helloController.test();
    }
}
