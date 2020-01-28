package com.bohai.demo;

import com.bohai.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoDemo {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao = (UserDao)app.getBean("UserDao");
        userDao.save();
    }
}
