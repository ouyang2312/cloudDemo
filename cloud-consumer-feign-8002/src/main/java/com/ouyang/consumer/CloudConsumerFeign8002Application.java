package com.ouyang.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.ouyang.cloudapi.service"})//扫描父包下面的CustomerService的FeignClients
//让spring容器能扫描到自定义的负载规则,顺带测试@ComponentScan注解（所以两个包不合并写 ）
//第一个注解是扫描父包，第二个注解是扫描轮询配置包（官方说明自定义的轮询包不能放在和springboot启动类当前的包下面）
@ComponentScan({"com.ouyang","com.ouyang.myConfig"})
@EnableCircuitBreaker//对hystrix熔断机制的支持 使用hystrixDashBoard也可以检测
public class CloudConsumerFeign8002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeign8002Application.class, args);
    }

}

