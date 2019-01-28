package com.coffee.baby.pattern.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/28 14:50
 **/
public class DynamicProxyTest {

    public static void main(String[] args) {
        TargetObjectImpl object = new TargetObjectImpl();

        TagetObject proxy = (TagetObject) Proxy.newProxyInstance(JdkDynamicProxy.class.getClassLoader(), new Class[] {TagetObject.class}, new JdkDynamicProxy(object));


        proxy.doSomethig();
        proxy.doSomethingElse();

    }
}
