package com.coffee.baby.reflect;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/28 15:22
 **/
public class ParentClazz {

    private static String parentName;

    public static String parentPublic;

    public void testParentMethod() {
        System.out.println("我是父类公共方法");
    }

    private void testParentPrivateMethod(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("我是父类私有方法");
    };
}
