package com.coffee.baby.pattern.singleton;

/**
 * @Classname HungryModeSingleton
 * @Description TODO
 * @Date 2019/1/17 0:51
 * @Created by smile.szx
 */
public class HungryModeSingleton {

    private HungryModeSingleton() {

    }

    public static class SingletonHolder {
        private static HungryModeSingleton instance = new HungryModeSingleton();
    }

    /**
     * 静态内部类
     * @return
     */
    public static HungryModeSingleton getInstance () {
        return SingletonHolder.instance;
    }
}
