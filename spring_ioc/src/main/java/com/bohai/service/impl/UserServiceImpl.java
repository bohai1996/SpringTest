package com.bohai.service.impl;

import com.bohai.dao.UserDao;
import com.bohai.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {
    public void save() {
        ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao1 = (UserDao)app.getBean("UserDao");
        UserDao userDao2 = (UserDao)app.getBean("UserDao");
        System.out.println(userDao1);
        System.out.println(userDao2);
        //com.bohai.service.impl.UserServiceImpl
    }
}
