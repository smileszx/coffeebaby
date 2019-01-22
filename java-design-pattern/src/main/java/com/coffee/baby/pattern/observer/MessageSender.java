package com.coffee.baby.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname MessageSender
 * @Description TODO
 * @Date 2019/1/22 11:04
 * @Created by smile.szx
 */
public class MessageSender {

    List<ObserverI> observers = new ArrayList<>();

    private boolean state = false;

    public void setState(boolean state) {
        this.state = state;
        if(this.state) {
            notifyObservers();
        }
    }

    public void add (ObserverI observer) {
        this.observers.add(observer);
        System.out.println(observer + " added.");
    }

    public void remove(ObserverI observer){
        this.observers.remove(observer);
        System.out.println(observer + " removed.");
    }

    public void notifyObservers() {
        for (ObserverI o : observers) {
            o.update();
        }
    }
}
