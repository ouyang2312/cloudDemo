package com.ouyang.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //开启Zuul
public class CloudZuulGateway9527Application {

    /**
     * zuul会去eureka里面查找对应的服务 消费者没有注册到eureka，所以不能访问到
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(CloudZuulGateway9527Application.class, args);
    }

}

