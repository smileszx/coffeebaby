package com.coffee.baby.pattern.observer;

/**
 * @Classname ObserverClient
 * @Description TODO
 * @Date 2019/1/22 11:09
 * @Created by smile.szx
 */
public class ObserverClient {

    public static void main(String[] args) {
        ObserverI o1 = new MyObserver();
        ObserverI o2 = new MyObserver();
        ObserverI o3 = new MyObserver();
        ObserverI o4 = new MyObserver();
        ObserverI o5 = new MyObserver();

        MessageSender sender = new MessageSender();
        sender.add(o1);
        sender.add(o2);
        sender.add(o3);
        sender.add(o4);
        sender.add(o5);

        sender.setState(true);

        sender.remove(o1);

        sender.setState(true);

    }
}
