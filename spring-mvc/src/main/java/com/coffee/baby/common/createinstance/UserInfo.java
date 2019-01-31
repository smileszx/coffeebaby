package com.coffee.baby.common.createinstance;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/30 9:28
 **/
public class UserInfo implements Cloneable, Serializable {

    private static String name;

    private static transient String password;

    public void showUserInfo () {
        System.out.println(String.format("%s,%s", name, password));
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
