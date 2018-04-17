package com.zh;

import com.alibaba.dubbo.config.*;
import com.zh.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfiguration {

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-provide");
        return applicationConfig;
    }

    // @Bean
    public ProviderConfig providerConfig() {
        ProviderConfig providerConfig = new ProviderConfig();
        // 表示该服务使用独的五条条长连
        providerConfig.setConnections(5);
        // 固定大小线程池，启动时建立线程，不关闭，一直持有。(缺省)
        providerConfig.setThreadpool("fixed");
        // 配置重试次数，最好只用于读的重试，写操作可能会引起多次写入  默认retries="0"
        providerConfig.setRetries(0);
        // 提供方超时时间
        providerConfig.setTimeout(10000);
        // 提供方版本
        providerConfig.setVersion("1.0");
        return providerConfig;
    }

    /**
     * zookeeper注册中心配置
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("192.168.1.130:2181,192.168.1.130:2182,192.168.1.130:2183");
        registryConfig.setClient("curator");
        return registryConfig;
    }


}