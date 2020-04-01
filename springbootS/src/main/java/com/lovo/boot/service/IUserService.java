package com.lovo.boot.service;

import com.lovo.boot.bean.UserBean;

import java.util.List;

public interface IUserService {
    /**
     * 查询所有用户
     * @return
     */
    public List<UserBean> findListUser();
}
