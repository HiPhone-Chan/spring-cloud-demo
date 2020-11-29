package com.chf.spring.cloud.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chf.spring.cloud.client.service.CloudService;
import com.chf.spring.cloud.client.service.FeignService;

@RestController
public class RequestController {

    @Autowired
    private CloudService cloudService;

    private FeignService feignService;

    @GetMapping("/servie/port")
    public String getPortService() {
        return cloudService.getPort();
    }

    @GetMapping("/servie/feign/port")
    public String getPortFeignService() {
        String info = feignService.getPort();
        return info;
    }

}
