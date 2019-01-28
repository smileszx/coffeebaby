package com.coffee.baby.pattern.dynamicproxy;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/28 14:45
 **/
public class TargetObjectImpl implements TagetObject {
    @Override
    public void doSomethig() {
        System.out.println("代理目标类，do something");
    }

    @Override
    public void doSomethingElse() {
        System.out.println("代理目标类，do something else");
    }
}
