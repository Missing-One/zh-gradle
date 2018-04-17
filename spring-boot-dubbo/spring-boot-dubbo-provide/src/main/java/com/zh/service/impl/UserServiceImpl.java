package com.zh.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zh.service.UserService;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0")
public class UserServiceImpl implements UserService {
    @Override
    public String say() {
        return "hello dubbo";
    }
}
