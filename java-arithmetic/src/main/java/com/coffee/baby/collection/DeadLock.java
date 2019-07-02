package com.coffee.baby.collection;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/5/23 20:06
 **/
public class DeadLock {

    private static String lockA = "lockA";

    private static String lockB = "lockB";

    public void methodA() {
        synchronized (lockA) {
            try {
                System.out.println("methodA get lockA.");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockB) {
                System.out.println("methodA get lockB.");
            }
        }
    }

    public void methodB() {
        synchronized (lockB) {
            try {
                System.out.println("methodB get lockB.");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lockA) {
                System.out.println("methodB get lockA.");
            }
        }
    }
}
