package com.lovo.boot.dao;

import com.lovo.boot.bean.UserBean;

import java.util.List;

public interface IUserDao {
    /**
     * 查询所有用户
     * @return
     */
    public List<UserBean> findListUser();
}
