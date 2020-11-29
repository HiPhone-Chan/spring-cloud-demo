package com.chf.spring.cloud.gateway.config;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chf.spring.cloud.gateway.filter.LogFilter;

@EnableZuulProxy
@Configuration
public class RoutingConfig {

    @Bean
    public LogFilter logFilter() {
        return new LogFilter();
    }
}
