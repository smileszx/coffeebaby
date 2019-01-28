package com.coffee.baby.classloader;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/28 17:32
 **/
public class ClazzLoadTest {
    public static void main(String[] args) {

        //new 新对象
        ChildClazz childClazz = new ChildClazz();


        //反射
        try {
            Class child = Class.forName("com.coffee.baby.classloader.ChildClazz");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        //类加载过程中的特殊情况

        //1.通过子类访问父类的静态变量，不会初始化子类
        System.out.println(ChildClazz.value);

        //2.定义引用数组，不会初始化类
        ChildClazz[] childClazzes = new ChildClazz[10];

        //3.final修饰的常量会在编译期间放到常量池，不会初始化类
        System.out.println(ChildClazz.salary);

        //4.final修饰的复杂引用，在编译期间无法得出，需要初始化类
        System.out.println(ChildClazz.random);
    }
}
