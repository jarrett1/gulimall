package com.atguigu.gulimall.oms.controller;

import com.atguigu.gulimall.oms.fegin.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class HelloController {
    @Autowired
   private  WorldService worldService;
    @Value("${data:默认}")
    private String dbSourc;


    @GetMapping("/hello")
    public String FeginHello(){
        String msg = worldService.world();
        System.out.println(dbSourc+"+++++++++++++++++++++");
        return "hello"+dbSourc;
    }
}
