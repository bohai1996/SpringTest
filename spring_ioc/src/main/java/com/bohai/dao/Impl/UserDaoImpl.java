package com.bohai.dao.Impl;

import com.bohai.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
        System.out.println("UserDaoImpl create.....");
    }

    public void save() {
        System.out.println("save running......");
    }
}
