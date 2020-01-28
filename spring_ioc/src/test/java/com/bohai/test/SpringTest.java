package com.bohai.test;

import com.bohai.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test

    public void test(){
        ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao1 = (UserDao)app.getBean("UserDao");
        UserDao userDao2 = (UserDao)app.getBean("UserDao");
        System.out.println(userDao1);
        System.out.println(userDao2);
    }
}
