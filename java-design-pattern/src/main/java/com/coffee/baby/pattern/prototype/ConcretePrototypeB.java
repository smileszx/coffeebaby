package com.coffee.baby.pattern.prototype;

/**
 * @Classname ConcretePrototypeB
 * @Description TODO
 * @Date 2019/1/18 10:40
 * @Created by smile.szx
 */
public class ConcretePrototypeB extends Prototype {
    private String attr;

    @Override
    public Prototype cloneObj() {
        Prototype prototype = new ConcretePrototypeB();
        prototype.setAttr(this.attr);
        return prototype;
    }

    @Override
    public String getAttr() {
        return attr;
    }

    @Override
    public void setAttr(String attr) {
        this.attr = attr;
    }
}
