package com.lovo.boot.service.impl;

import com.lovo.boot.dao.IUserDao;
import com.lovo.boot.entity.UserEntity;
import com.lovo.boot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {
   @Autowired
    private IUserDao userDao;
    @Transactional(rollbackFor = {Exception.class})
    public void savaUser(UserEntity userEntity) {
        userDao.save(userEntity);
    }

    @Override
    public List<UserEntity> findUserList() {
        return (List<UserEntity>) userDao.findAll();
    }

    @Override
    public UserEntity getUserEntityById(int id) {
        return userDao.findById(id).get();
    }

    @Override
    public void delUserById(int id) {
        userDao.deleteById(id);
    }
}
