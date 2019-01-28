package com.coffee.baby.reflect;

import javafx.scene.Parent;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description
 * 反射就是在运行时才知道要操作的类是什么，并且可以在运行时获取类的完整构造，并调用对应的方法。
 * @Author Thinkpad
 * @Date 2019/1/28 10:35
 **/
@Slf4j
public class ClazzReflectTest {


    public static void main(String[] args) {

        //com.coffee.baby.reflect.CommonClazz

        try {
            //获取Class对象实例
            Class clazz = Class.forName("com.coffee.baby.reflect.CommonClazz");

            Field[] fields = clazz.getDeclaredFields();
            System.out.println(fields.length);
            for (Field field : fields) {
                System.out.println(field.getName());
            }


            //根据Class对象实例获取Constructor对象
            Constructor constructor = clazz.getConstructor();

            //调用有参数构造方法
            Constructor constructor1 = clazz.getDeclaredConstructor(String.class, String.class);
            constructor1.setAccessible(true);
            Object obj1 = constructor1.newInstance("京东", "jd.com");

            //使用 Constructor 对象的 newInstance 方法获取反射类对象
            Object obj = constructor.newInstance();
            //获取方法的 Method 对象
            Method method1 = clazz.getMethod("testNoReturn");
            //利用 invoke 方法调用方法
            method1.invoke(obj);

            Method method2 = clazz.getMethod("testNoReturnWithParam", String.class);
            method2.invoke(obj, " 测试无返回值有参方法");

            method2.invoke(obj1, "有参数构造方法创建的实例， 测试无返回值有参方法");


            /****************************************/

            Class parent = clazz.getSuperclass();

            Field[] parentFields = parent.getDeclaredFields();
            for (Field field : parentFields) {
                System.out.println(field.getName());
            }

            Method[] parentMethods = parent.getDeclaredMethods();
            for(Method method : parentMethods) {
                System.out.println(method.getName());
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}
