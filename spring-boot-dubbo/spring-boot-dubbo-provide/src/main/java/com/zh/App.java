package com.zh;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("spring.properties")
@DubboComponentScan(basePackages = {"com.zh.service.impl"})
public class App {
    //SpringBootServletInitializer H;
    public static void main(String[] args) {
        ApplicationContext container = SpringApplication.run(App.class, args);
//        for (String n:
//        container.getBeanDefinitionNames()) {
//            System.out.println("n = " + n);
//
//        }
    }
}

