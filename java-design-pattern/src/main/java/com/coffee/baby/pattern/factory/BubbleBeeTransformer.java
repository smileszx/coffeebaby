package com.coffee.baby.pattern.factory;

/**
 * @Classname BubbleBeeTransformer
 * @Description TODO
 * @Date 2019/1/22 11:33
 * @Created by smile.szx
 */
public class BubbleBeeTransformer implements Transformer {
    public BubbleBeeTransformer() {
        System.out.println("I am BubbleBee！");
    }

    @Override
    public void color(String color) {
        System.out.println("黄色");
    }

    @Override
    public void hideType(String hideType) {
        System.out.println("隐蔽形态是甲壳虫轿车");
    }

    @Override
    public void size(Long height, Long width) {
        System.out.println("高度：" + height + "米， 宽：" + width + "米");
    }
}
