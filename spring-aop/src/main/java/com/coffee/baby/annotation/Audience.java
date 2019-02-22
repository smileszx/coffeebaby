package com.coffee.baby.annotation;

import org.aspectj.lang.annotation.*;

/**
 * @Description 定义一个切面
 * @Author Thinkpad
 * @Date 2019/2/22 12:21
 **/
@Aspect
public class Audience {

    @Pointcut("execution(* com.coffee.baby.annotation.PerformImpl.perform(..))")
    public void performance () {}

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("观影前请关闭手机或将手机调至静音模式");
    }


    @AfterReturning("performance()")
    public void applause() {
        System.out.println("热烈鼓掌！");
    }
    @After("performance()")
    public void leaveThePlace() {
        System.out.println("电影结束请有秩序离场");
    }
}
