package com.bohai.service.impl;

import com.bohai.dao.UserDao;
import com.bohai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service("userService")
//@Scope("prototype")
//@Scope("singleton")
public class UserServiceImpl implements UserService {
    @Value("${jdbc.driver}")
    private String driver;

//    @Autowired // 按照数据类型从Spring容器中进行匹配的
//是按照id值从容器中进行匹配的，
// 但是主要此处@Qualifier结合@Autowired一起使用
//    @Qualifier("userDao")
//    @Resource相当于@Qualifier+@Autowired
    @Resource(name="userDao")
    private UserDao userDao;

    public void save() {
        System.out.println(driver);
        userDao.save();
    }

    @PostConstruct
    public void init(){
        System.out.println("Service对象的初始化方法");
    }

    @PreDestroy
    public void destory(){
        System.out.println("Service对象的销毁");
    }
}
