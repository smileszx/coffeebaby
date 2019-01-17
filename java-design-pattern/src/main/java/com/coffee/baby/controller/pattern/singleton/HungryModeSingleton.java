package com.coffee.baby.controller.pattern.singleton;

/**
 * @Classname HungryModeSingleton
 * @Description TODO
 * @Date 2019/1/17 0:51
 * @Created by smile.szx
 */
public class HungryModeSingleton {

    private static HungryModeSingleton instance = null;

    private HungryModeSingleton() {

    }

    /**
     * 静态工厂方法
     * @return
     */
    public static HungryModeSingleton getInstance () {
        if (instance == null) {
            instance = new HungryModeSingleton();
        }
        return instance;
    }
}
