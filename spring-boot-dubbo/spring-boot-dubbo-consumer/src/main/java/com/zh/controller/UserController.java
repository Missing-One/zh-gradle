package com.zh.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.config.spring.AnnotationBean;
import com.zh.service.ConsumerServiceImpl;
import com.zh.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    ConsumerServiceImpl consumerService;

    @Reference(version = "1.0")
    UserService userService;

    @ApiOperation(value = "测试dubbo远程调用service")
    @RequestMapping("/say")
    public String say(){
        System.out.println("userService = " + userService.say());

        consumerService.say();
        return "";
    }
}
