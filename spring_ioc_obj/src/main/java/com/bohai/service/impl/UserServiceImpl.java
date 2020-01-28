package com.bohai.service.impl;

import com.bohai.dao.UserDao;
import com.bohai.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }


    public void save() {
        System.out.println(userDao);
        userDao.save();
    }
}
