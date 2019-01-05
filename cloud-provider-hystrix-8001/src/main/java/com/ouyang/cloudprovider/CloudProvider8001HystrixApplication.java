package com.ouyang.cloudprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//本服务启动后会自动注册进eureka服务中
//服务发现 @EnableDiscoveryClient和@EnableEurekaClient共同点就是：都是能够让注册中心能够发现，扫描到改服务
//         不同点：@EnableEurekaClient只适用于Eureka作为注册中心，@EnableDiscoveryClient 可以是其他注册中心。
@EnableDiscoveryClient
@EnableCircuitBreaker//对hystrix熔断机制的支持 也是使用hystrixDashBoard的开关
public class CloudProvider8001HystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProvider8001HystrixApplication.class, args);
    }

}

