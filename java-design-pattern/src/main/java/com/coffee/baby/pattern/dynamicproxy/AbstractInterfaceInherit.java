package com.coffee.baby.pattern.dynamicproxy;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/28 15:04
 **/
public abstract class AbstractInterfaceInherit implements InterfaceInheritTest {


    abstract void testAbstract();

    @Override
    public void doSomethingElse() {
        System.out.println("抽象类中实现接口方法");
    }

    @Override
    public void extendInterface() {
        System.out.println("我是抽象类中实现接口方法");
    }
}
