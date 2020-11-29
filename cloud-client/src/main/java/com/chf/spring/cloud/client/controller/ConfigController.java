package com.chf.spring.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {

    @Value("${message: hi default}")
    private String message;

    @RequestMapping("/config/message")
    public String getMessage() {
        return this.message;
    }
}
