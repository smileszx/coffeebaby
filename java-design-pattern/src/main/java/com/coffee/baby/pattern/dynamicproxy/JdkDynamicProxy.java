package com.coffee.baby.pattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description InvocationHandler是Java反射类中的接口
 * @Author Thinkpad
 * @Date 2019/1/28 14:44
 **/
public class JdkDynamicProxy implements InvocationHandler {

    private Object proxyed;

    public JdkDynamicProxy(Object proxyed) {
        this.proxyed = proxyed;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("我是代理类，我开始干活……");
        return method.invoke(proxyed, args);
    }
}
