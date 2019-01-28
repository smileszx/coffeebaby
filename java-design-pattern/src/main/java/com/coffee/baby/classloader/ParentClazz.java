package com.coffee.baby.classloader;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/28 17:30
 **/
public class ParentClazz {

    public static int value = 10;

    static {
        System.out.println("Parent static initialized");
    }

    public ParentClazz() {
        System.out.println("Parent initialized");
    }
}
