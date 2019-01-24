package com.coffee.baby.common;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/24 11:15
 **/
public class HelloBean {

    private String setValue;

    public String getSetValue() {
        return setValue;
    }

    public void setSetValue(String setValue) {
        this.setValue = setValue;
    }

    public HelloBean(String name, String word) {

        System.out.println("name: " + name + ", word: " + word);
    }


}
