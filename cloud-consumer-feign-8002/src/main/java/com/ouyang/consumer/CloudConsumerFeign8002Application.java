package com.ouyang.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.ouyang.cloudapi.service"})//扫描父包下面的CustomerService的FeignClients
@ComponentScan({"com.ouyang.consumer","com.ouyang.myConfig"})//让spring容器能扫描到自定义的负载规则,顺带测试@ComponentScan注解
public class CloudConsumerFeign8002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeign8002Application.class, args);
    }

}

