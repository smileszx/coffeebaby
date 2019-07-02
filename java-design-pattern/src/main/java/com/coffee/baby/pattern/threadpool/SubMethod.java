package com.coffee.baby.pattern.threadpool;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/5/17 11:38
 **/
public class SubMethod extends TestInterfaceImpl {

    public static void staMethod(){
        System.out.println("重写父类静态方法");
    }
    public  void baseMethod(){
        System.out.println("重写父类实例方法");
    }
    public static void main(String[] args){
        TestInterfaceImpl parent=new SubMethod();
        parent.baseMethod();
        parent.staMethod();
    }
}
