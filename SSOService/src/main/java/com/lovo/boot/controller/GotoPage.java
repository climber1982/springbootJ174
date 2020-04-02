package com.lovo.boot.controller;

import com.lovo.boot.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GotoPage {

    @RequestMapping("gotoList")
    public ModelAndView gotoList(){
        ModelAndView mv=new ModelAndView("listPage");
        UserEntity user=new UserEntity();
        user.setUserName("赵云");
        user.setPassword("123456");
        mv.addObject("user",user);
        return  mv;
    }

}
