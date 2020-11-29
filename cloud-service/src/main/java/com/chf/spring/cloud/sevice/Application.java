package com.chf.spring.cloud.sevice;

import java.net.InetAddress;

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
            String port = env.getProperty("server.port");
            log.info(
                    "\n----------------------------------------------------------\n\t"
                            + "Application '{}' is running! Access URLs:\n\t" + "Local: \t\thttp://localhost:{}\n\t"
                            + "External: \thttp://{}:{}\n\t",
                    env.getProperty("spring.application.name"), port, InetAddress.getLocalHost().getHostAddress(),
                    port);
        }
    }

}
