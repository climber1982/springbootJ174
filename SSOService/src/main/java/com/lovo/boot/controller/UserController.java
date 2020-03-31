package com.lovo.boot.controller;

import com.lovo.boot.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserEntity userEntity;
    @RequestMapping("hello")
    public  UserEntity hello(){
        return userEntity;
    }
}
