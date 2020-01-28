package com.bohai.dao.impl;

import com.bohai.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("save running.....");
    }
}
