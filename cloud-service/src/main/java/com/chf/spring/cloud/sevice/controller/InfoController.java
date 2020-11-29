package com.chf.spring.cloud.sevice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    private static final Logger log = LoggerFactory.getLogger(InfoController.class);

    @Autowired
    private Environment env;

    @GetMapping("/port")
    public String getPort() {
        return env.getProperty("server.port");
    }

    @GetMapping("/")
    public void index() {
        log.info("access service");
    }

}
