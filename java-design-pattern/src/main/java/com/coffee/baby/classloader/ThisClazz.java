package com.coffee.baby.classloader;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/28 22:15
 **/
public class ThisClazz extends SuperClazz{

    public int count = 10;

    public void testMethod() {
        super.testMethod();

        count = 30;

        System.out.println("this: " + this.count);

        System.out.println("super:" + super.count);

    }
}
