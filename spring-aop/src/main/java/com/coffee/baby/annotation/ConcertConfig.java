package com.coffee.baby.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/2/22 12:36
 **/
//配置文件注解
@Configuration
//激活启用AspectJ动态代理，
// proxyTargetClass=true支持实体类，proxyTargetClass=false支持接口
@EnableAspectJAutoProxy(proxyTargetClass=true)
//扫描Component
@ComponentScan
public class ConcertConfig {
    @Bean
    public Audience audience () {
        return new Audience();
    }
}
