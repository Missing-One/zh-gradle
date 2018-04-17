package com.zh.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@org.springframework.stereotype.Service
public class ConsumerServiceImpl {


    @Reference(version = "1.0")
    UserService userService;

    public void say(){
        System.out.println("say:" + userService.say());
    }
}
