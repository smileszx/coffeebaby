package com.coffee.baby.pattern.prototype;

/**
 * @Classname Prototype
 * @Description TODO
 * @Date 2019/1/18 10:38
 * @Created by smile.szx
 */
public abstract class Prototype {

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    private String attr;

    //克隆方法
    abstract Prototype cloneObj();
}
