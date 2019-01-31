package com.coffee.baby.common.createinstance;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/30 9:30
 **/
public class CreateInstanceTest {
    public static void main(String[] args) {
        //1.通过new关键字创建
        UserInfo newStyle = new UserInfo();
        System.out.println("new 关键字创建对象：" + newStyle);

        //2.Class的newInstance方法
        try {
            UserInfo classNew = (UserInfo) Class.forName("com.coffee.baby.common.createinstance.UserInfo").newInstance();
            System.out.println("Class.forName创建对象：" + newStyle);

            UserInfo clazzNew = UserInfo.class.newInstance();
            System.out.println("UserInfo.class创建对象：" + newStyle);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //3.Constructor的newInstance方法
        try {
            Constructor constructor = UserInfo.class.getConstructor();
            UserInfo constructorNew = (UserInfo) constructor.newInstance();
            System.out.println("UserInfo.class.getConstructor创建对象：" + newStyle);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        //clone方式


    }
}
