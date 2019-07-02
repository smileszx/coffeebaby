package com.coffee.baby.collection;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/5/22 9:44
 **/
public class TestClazz {
    public static void main(String[] args) {
        final DeadLock deadLock = new DeadLock();
        Thread threadA = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        deadLock.methodA();
                    }
                }, "A");
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                deadLock.methodB();
            }
        }, "B");

        threadA.start();
//        threadB.start();
    }
}
