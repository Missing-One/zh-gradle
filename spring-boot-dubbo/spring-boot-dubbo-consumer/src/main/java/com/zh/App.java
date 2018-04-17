package com.zh;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.zh.dubbo.DubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@DubboComponentScan(basePackages = {"com.zh"})
public class App {
    //SpringBootServletInitializer H;
    public static void main(String[] args) {
        ApplicationContext container = SpringApplication.run(App.class, args);
//        for (String n: container.getBeanDefinitionNames()) {
//            System.out.println("n = " + n);
//        }

                
    }

}

