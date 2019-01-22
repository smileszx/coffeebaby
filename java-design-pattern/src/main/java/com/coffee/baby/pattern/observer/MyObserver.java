package com.coffee.baby.pattern.observer;

/**
 * @Classname MyObserver
 * @Description TODO
 * @Date 2019/1/22 11:03
 * @Created by smile.szx
 */
public class MyObserver implements ObserverI {

    @Override
    public void update() {
        System.out.println("A new message！");
    }
}
