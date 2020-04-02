package com.lovo.boot.service;

import com.lovo.boot.entity.UserEntity;

import java.util.List;

public interface IUserService {
    public  void savaUser(UserEntity userEntity);
    public List<UserEntity> findUserList();
}
