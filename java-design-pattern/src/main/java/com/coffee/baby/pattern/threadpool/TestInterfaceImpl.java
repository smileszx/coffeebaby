package com.coffee.baby.pattern.threadpool;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/5/17 11:32
 **/
public class TestInterfaceImpl implements TestInterface {

    public static void staMethod(){
        System.out.println("调用父类静态方法");
    }
    public  void baseMethod(){
        System.out.println("调用父类实例方法");
    }
}
