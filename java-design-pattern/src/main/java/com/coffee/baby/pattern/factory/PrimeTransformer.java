package com.coffee.baby.pattern.factory;

/**
 * @Classname PrimeTransformer
 * @Description TODO
 * @Date 2019/1/22 11:30
 * @Created by smile.szx
 */
public class PrimeTransformer implements Transformer {
    public PrimeTransformer() {
        System.out.println("I am Prime!");
    }

    @Override
    public void color(String color) {
        System.out.println("红色");
    }

    @Override
    public void hideType(String hideType) {
        System.out.println("隐蔽形态是大卡车");
    }

    @Override
    public void size(Long height, Long width) {
        System.out.println("高度：" + height + "米， 宽：" + width + "米");
    }
}
