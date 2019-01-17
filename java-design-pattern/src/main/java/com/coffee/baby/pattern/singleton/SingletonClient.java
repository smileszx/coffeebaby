package com.coffee.baby.pattern.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Classname SingletonClient
 * @Description TODO
 * @Date 2019/1/17 0:54
 * @Created by smile.szx
 */
public class SingletonClient {

    public static void main(String[] args) {

        //测试单例模式创建实例
        ExecutorService pool = Executors.newCachedThreadPool();
        HungryModeSingleton singleton = HungryModeSingleton.getInstance();
        for (int i=0; i<10000; i++) {
            Thread thread = new Thread(() -> {
                HungryModeSingleton instance = HungryModeSingleton.getInstance();
                if(!singleton.equals(instance)) {
                    System.out.println("singleton: " + singleton + " != instance: " + instance);
                }
            });
            pool.execute(thread);
        }
        pool.shutdown();
    }
}
