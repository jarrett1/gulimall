package com.atguigu.gulimall.oms.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "gulimall-pms")
public interface  WorldService {
    @GetMapping("/pms")
    public String world();
}
