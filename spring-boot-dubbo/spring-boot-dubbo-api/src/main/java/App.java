import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan(basePackages = "com.zh.test.service")
public class App {
    //SpringBootServletInitializer H;
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);


    }

}

