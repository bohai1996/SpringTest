package com.bohai.factory;

import com.bohai.dao.UserDao;
import com.bohai.dao.impl.UserDaoImpl;

public class DynamicFactory {

    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
