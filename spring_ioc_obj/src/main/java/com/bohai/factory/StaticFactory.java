package com.bohai.factory;

import com.bohai.dao.UserDao;
import com.bohai.dao.impl.UserDaoImpl;

public class StaticFactory {

    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
