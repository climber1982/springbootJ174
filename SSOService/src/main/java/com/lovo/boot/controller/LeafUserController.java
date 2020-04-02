package com.lovo.boot.controller;

import com.lovo.boot.entity.UserEntity;
import com.lovo.boot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class LeafUserController {
    @Autowired
    IUserService userService;
    @RequestMapping("addUserInfo")
    public ModelAndView addUser(String userName, String password){
       ModelAndView mv=new ModelAndView();
        UserEntity user=new UserEntity();
        user.setUserName(userName);
        user.setPassword(password);
        userService.savaUser(user);
        //重定向到查询controller
        RedirectView rv=new RedirectView("findUserListInfo");
       mv.setView(rv);
       return mv;
    }
    //查询所有用户
    @RequestMapping("findUserListInfo")
    public ModelAndView findUserListInfo(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("userList",userService.findUserList());
       mv.setViewName("listPageInfo");
        return mv;
    }
}
