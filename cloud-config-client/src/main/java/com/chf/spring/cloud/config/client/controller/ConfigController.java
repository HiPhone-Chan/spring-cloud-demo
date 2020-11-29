package com.chf.spring.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {

//    @Value("${foo}")
    private String message;
    
    @Autowired
    private Environment env;

    @RequestMapping("/config/message")
    public Object getMessage() {
        return env.getProperty("foo");
    }
}
