package com.coffee.baby.controller.pattern.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Classname SingletonClient
 * @Description TODO
 * @Date 2019/1/17 0:54
 * @Created by smile.szx
 */
public class SingletonClient {
    private static final Logger logger = LogManager.getLogger(SingletonClient.class.getName());

    public static void main(String[] args) {

        //测试单例模式创建实例
        ExecutorService pool = Executors.newCachedThreadPool();
        HungryModeSingleton singleton = HungryModeSingleton.getInstance();
        logger.warn("========华丽的分割线=============");
        for (int i=0; i<10000; i++) {
            Thread thread = new Thread(() -> {
                HungryModeSingleton instance = HungryModeSingleton.getInstance();
                if(!singleton.equals(instance)) {
                    logger.info("singleton: {} != instance: {}",singleton, instance);
                }
            });
            pool.execute(thread);
        }
        pool.shutdown();
    }
}
