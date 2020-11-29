package com.chf.spring.cloud.configserver.config;

import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigServer
public class ConfigurationConfig {
    /// {application}/{profile}[/{label}]
}
