package com.bohai.demo;

import com.bohai.service.impl.UserServiceImpl;

public class UserAct {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.save();
    }
}
