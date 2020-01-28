package com.bohai.dao.impl;

import com.bohai.dao.UserDao;
import com.bohai.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {
    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;
    private String username;
    private int age;

    public UserDaoImpl() {
        System.out.println("UserDaoImpl创建....");
    }

    public void init(){
        System.out.println("初始化方法.....");
    }

    public void destory(){
        System.out.println("销毁方法.....");
    }


    public void save() {
        System.out.println(username+"====="+age);
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("save running.....");
    }



    public List<String> getStrList() {
        return strList;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
