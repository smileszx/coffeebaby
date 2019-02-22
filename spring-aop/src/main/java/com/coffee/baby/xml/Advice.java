package com.coffee.baby.xml;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/2/22 13:56
 **/
public class Advice {

    public void beforeAdvice() {
        System.out.println("前置通知");
    }

    public void afterAdvice() {
        System.out.println("后置通知");
    }
}
