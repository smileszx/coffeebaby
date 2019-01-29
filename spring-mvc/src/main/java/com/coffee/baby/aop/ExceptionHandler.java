package com.coffee.baby.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/30 0:02
 **/
@Slf4j
@Component
@Aspect
public class ExceptionHandler {


    @Before(value = "execution(* com.coffee.baby.aop.ShuttleCompass.*(..))")
    public void exceptionHandler() throws InterruptedException {
        System.out.println("正在处理异常...");
        Thread.sleep(3000);
    }
}
