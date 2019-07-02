package com.coffee.baby.collection;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/5/22 9:43
 **/
public abstract class AbstractBuilding {

    public AbstractBuilding() {
        System.out.println("实例化抽象基类");
        this.print();
    }

    public abstract void print();
}
