package com.lovo.boot.controller;

import com.lovo.boot.entity.UserEntity;
import com.lovo.boot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GotoPage {
   @Autowired
    private IUserService userService;
    @RequestMapping("gotoList")
    public ModelAndView gotoList(){
        ModelAndView mv=new ModelAndView("listPage");
        UserEntity user=new UserEntity();
        user.setUserName("赵云");
        user.setPassword("123456");
        mv.addObject("user",user);
        return  mv;
    }

    @RequestMapping("gotoAddUser")
    public String gotoAddUser(){
        return "andPage";
    }


    //跳转到修改页面
    @RequestMapping("gotoUpdate")
    public ModelAndView gotoUpdate(int userId){
        ModelAndView mv=new ModelAndView("updatePage");
      mv.addObject("user",
        userService.getUserEntityById(userId));
        return mv;
    }
}
