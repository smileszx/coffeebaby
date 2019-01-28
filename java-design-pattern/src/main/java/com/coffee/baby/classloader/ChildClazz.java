package com.coffee.baby.classloader;

import java.util.Random;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/28 17:30
 **/
public class ChildClazz extends ParentClazz{

    public static final int salary = 100000;

    public static final int random = new Random().nextInt(100);

    static {
        System.out.println("Child static initialized");
    }

    public ChildClazz() {
        System.out.println("Child initialized");
    }
}
