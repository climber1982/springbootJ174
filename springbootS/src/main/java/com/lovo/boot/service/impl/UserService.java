package com.lovo.boot.service.impl;

import com.lovo.boot.bean.UserBean;
import com.lovo.boot.dao.IUserDao;
import com.lovo.boot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "userService")
public class UserService implements IUserService {

    //注入DAO
    @Autowired
    private IUserDao userDao;

    public List<UserBean> findListUser() {
        return userDao.findListUser();
    }
}
