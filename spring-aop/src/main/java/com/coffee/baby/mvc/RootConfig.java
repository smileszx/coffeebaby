package com.coffee.baby.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/2/22 16:32
 **/
@Configuration
@ComponentScan(
        basePackages = {"com.coffee.baby"},
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)
        }
)
public class RootConfig {
}
