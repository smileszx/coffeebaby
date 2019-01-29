package com.coffee.baby.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/29 23:40
 **/
public class AOPAnnotationConfigTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springmvc.xml");

        CompassInterface shuttle = (CompassInterface) ctx.getBean("shuttleCompass");
        shuttle.statErrorData();
        shuttle.showErrorResult();
    }
}
