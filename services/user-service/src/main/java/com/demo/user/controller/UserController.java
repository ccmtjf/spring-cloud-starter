package com.demo.user.controller;

import com.demo.user.api.IUserController;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @author gexb
 * @date 2018/3/27
 * @description TODO
 */
@RestController
public class UserController implements IUserController {
    
    public List<Integer> test(){
        return Collections.singletonList(2);
    }
}
