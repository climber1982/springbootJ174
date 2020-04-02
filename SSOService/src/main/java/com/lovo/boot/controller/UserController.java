package com.lovo.boot.controller;

import com.lovo.boot.entity.UserEntity;
import com.lovo.boot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
   @Autowired
    private IUserService userService;

    @Autowired
    private UserEntity userEntity;
    @RequestMapping("hello")
    public  UserEntity hello(){
        return userEntity;
    }

    @RequestMapping("addUser")
    public String addUser(String userName, String password){
        UserEntity user=new UserEntity();
        user.setUserName(userName);
        user.setPassword(password);
        userService.savaUser(user);
        return "ok";
    }

    @RequestMapping("loginUser")
    public String loginUser(String userName, String password){
    return userName+"登录成功";
    }

    
}
