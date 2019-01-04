package com.ouyang.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudConsumer8002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumer8002Application.class, args);
    }

}

