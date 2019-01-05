package com.ouyang.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class CloudHystrix9001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudHystrix9001Application.class, args);
    }

}

