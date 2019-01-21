package com.coffee.baby.pattern.prototype;

/**
 * @Classname ConcretePrototypeA
 * @Description TODO
 * @Date 2019/1/18 10:39
 * @Created by smile.szx
 */
public class ConcretePrototypeA extends Prototype {

    private String attr;

    @Override
    public Prototype cloneObj() {
        Prototype prototype = new ConcretePrototypeA();
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
