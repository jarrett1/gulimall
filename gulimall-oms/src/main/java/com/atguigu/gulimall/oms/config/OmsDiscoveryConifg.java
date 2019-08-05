package com.atguigu.gulimall.oms.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDiscoveryClient//开启注册服务发现功能
@EnableFeignClients(basePackages = "com.atguigu.gulimall.oms.fegin")//开启远程服务调用功能
public class OmsDiscoveryConifg {
}
