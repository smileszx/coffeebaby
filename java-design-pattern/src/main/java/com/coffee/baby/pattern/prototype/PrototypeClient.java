package com.coffee.baby.pattern.prototype;

/**
 * @Classname PrototypeClient
 * @Description TODO
 * @Date 2019/1/18 10:41
 * @Created by smile.szx
 */
public class PrototypeClient {
    public static void main(String[] args) {
        Prototype prototypeA = new ConcretePrototypeA();
        prototypeA.setAttr("I am real A");

        Prototype cloneA = prototypeA.cloneObj();

        Prototype prototypeB = new ConcretePrototypeB();
        prototypeB.setAttr("I am real B");

        Prototype cloneB = prototypeB.cloneObj();

        System.out.println(prototypeA == cloneA);
        System.out.println(cloneA.equals(prototypeA));

        System.out.println(prototypeA.getAttr());
        System.out.println(cloneA.getAttr());

        System.out.println(prototypeB.getAttr());
        System.out.println(cloneB.getAttr());
    }
}
