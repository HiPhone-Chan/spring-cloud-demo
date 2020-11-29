package com.chf.spring.cloud.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(Application.class);
        Environment env = app.run(args).getEnvironment();

        if (log.isInfoEnabled()) {
            log.info(
                    "\n----------------------------------------------------------\n\t" + "Application '{}' is running!",
                    env.getProperty("spring.application.name"));
        }
    }

}
