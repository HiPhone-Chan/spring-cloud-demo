package com.chf.spring.cloud.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "cloud-service")
public interface FeignService {

    @RequestMapping(value = "/port", method = RequestMethod.GET)
    String getPort();
}
