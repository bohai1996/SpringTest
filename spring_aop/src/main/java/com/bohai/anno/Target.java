package com.bohai.anno;

import org.springframework.stereotype.Component;

@Component("target")
public class Target implements TargetInterface {
    public void save() {
        System.out.println("save running....");
    }
}
