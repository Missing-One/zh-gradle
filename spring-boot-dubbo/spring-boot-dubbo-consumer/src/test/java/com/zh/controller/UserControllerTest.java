package com.zh.controller;

import com.zh.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = App.class)
public class UserControllerTest {

    @Autowired
    UserController userController;
    //@Test
    public void say() {
        userController.say();
    }
}