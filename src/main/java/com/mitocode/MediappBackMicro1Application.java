package com.mitocode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;


@SpringBootApplication
@EnableEurekaClient
@EnableResourceServer
@Deprecated
public class MediappBackMicro1Application {

    public static void main(String[] args) {
        SpringApplication.run(MediappBackMicro1Application.class, args);
    }

}
