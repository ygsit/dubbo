package com.yu.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 将服务提供者注册到注册中心
 * 1、引入dubbo和zkclient相关依赖
 * 2、开启dubbo支持 EnableDubbo
 * 3、配置dubbo的扫描包和注册中心地址
 * 4、使用@DubboService发布服务
 */
@SpringBootApplication
@EnableDubbo //开启dubbo支持
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
