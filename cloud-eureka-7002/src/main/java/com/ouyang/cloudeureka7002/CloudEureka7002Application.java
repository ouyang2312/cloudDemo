package com.ouyang.cloudeureka7002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer     // EurekaServer服务器端启动类,接受其它微服务注册进来
public class CloudEureka7002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEureka7002Application.class, args);
    }

}

