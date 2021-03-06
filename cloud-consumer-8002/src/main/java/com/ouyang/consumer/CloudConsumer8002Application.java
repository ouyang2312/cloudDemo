package com.ouyang.consumer;

import com.myConfig.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
@RibbonClient(name = "CLOUD-PROVIDER", configuration = MySelfRule.class)
public class CloudConsumer8002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumer8002Application.class, args);
    }

}

