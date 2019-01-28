package com.coffee.baby.reflect;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/28 10:35
 **/
public class CommonClazz extends ParentClazz{

    private static String name;

    private static transient String password;

    public static String value;

    public CommonClazz() {
        System.out.println("调用无参数构造方法创建实例对象");
    }

    private CommonClazz(String name, String password) {
        this.name = name;
        this.password = password;
        System.out.println("调用有参数构造方法创建实例对象，name=" + name + ", password=" + password);
    }


    public void testNoReturn () {
        System.out.println("无返回值，无入参");
    }

    public void testNoReturnWithParam (String param) {
        System.out.println("无返回值，有入参，param：" + param);
    }

    public void testReturn () {
        System.out.println("有返回值，无入参");
    }

    public void testReturnWithParam (String param) {
        System.out.println("有返回值，有入参，param：" + param);
    }

    private void testPrivateMethod() {
        System.out.println("private method");
    }

}
