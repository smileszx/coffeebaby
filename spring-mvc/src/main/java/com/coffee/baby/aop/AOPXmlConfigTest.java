package com.coffee.baby.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/29 23:40
 **/
public class AOPXmlConfigTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springmvc.xml");
        CompassInterface agv = (CompassInterface) ctx.getBean("agvCompass");
        CompassInterface sort = (CompassInterface) ctx.getBean("sortCompass");

        agv.statErrorData();
        System.out.println();
        agv.showErrorResult();

        System.out.println();

        sort.statErrorData();
        System.out.println();
        sort.showErrorResult();
    }
}
