package com.chf.spring.cloud.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CloudService {

    @Autowired
    private RestTemplate loadBalancedRestTemplate;

    @HystrixCommand(fallbackMethod = "reliable")
    public String getPort() {
        String info = loadBalancedRestTemplate.getForObject("http://cloud-service/port", String.class);
        return info;
    }

    public String reliable() {
        return "-99";
    }

}
