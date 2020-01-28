package com.bohai.test;

import com.bohai.dao.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");

        System.out.println(userDao);
        UserDao userDao2 = (UserDao) app.getBean("userDao");

        System.out.println(userDao2);
    }
}
