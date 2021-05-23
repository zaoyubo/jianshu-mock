package com.zhaoyubo.jianshu.api.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean
    public String hello() {
        return "welcome to hangge.com";
    }
}
