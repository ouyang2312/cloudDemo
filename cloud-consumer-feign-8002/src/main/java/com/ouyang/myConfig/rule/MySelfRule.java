package com.ouyang.myConfig.rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义的负载规则不能定义到springboot的启动类的包下，所以放在这里
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule()
    {
        return new RandomRule_OY();// 自定义为每台机器3次
    }

}
