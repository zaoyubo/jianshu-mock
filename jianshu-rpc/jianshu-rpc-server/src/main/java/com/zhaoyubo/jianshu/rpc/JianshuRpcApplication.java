package com.zhaoyubo.jianshu.rpc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

@org.springframework.boot.autoconfigure.SpringBootApplication
@MapperScan("com.zhaoyubo.jianshu.rpc.dao")
public class JianshuRpcApplication {
    public static void main(String[] args) {
        // 启动 springboot 并初始化相关组件
        SpringApplication.run(JianshuRpcApplication.class);
    }
}
