package com.bohai.proxy.jdk;

public class Advice {
    public void before(){
        System.out.println("前面增强....");
    }

    public void afterReturning(){
        System.out.println("后置增强....");
    }
}
