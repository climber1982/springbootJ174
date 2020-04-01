package com.boot;

import com.lovo.boot.MyBaitsMain;
import com.lovo.boot.bean.UserBean;
import com.lovo.boot.service.IUserService;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyBaitsMain.class)
public class MybatisT {
    @Autowired
    private IUserService userService;

    @Test
    public void  findListUser(){
    List<UserBean> list=    userService.findListUser();
        System.out.println(list.size());
    }
}
