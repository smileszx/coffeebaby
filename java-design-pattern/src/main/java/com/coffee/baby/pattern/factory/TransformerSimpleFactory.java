package com.coffee.baby.pattern.factory;

/**
 * @Classname TransformerSimpleFactory
 * @Description TODO
 * @Date 2019/1/22 11:35
 * @Created by smile.szx
 */
public class TransformerSimpleFactory {

    /**
     * 根据待创建的汽车人名字创建
     * @param name
     * @return
     */
    public static Transformer createTransformer (String name) {
        Transformer transformer = null;

        if(name.equals("prime")) {
            transformer = new PrimeTransformer();
        } else if (name.equals("bubblebee")) {
            transformer = new BubbleBeeTransformer();
        } else {
            System.out.println("请检查待创建变形金刚名字" + name + "是否正确！");
        }
        return transformer;
    }

    /**
     * 擎天柱静态工厂方法
     * @return
     */
    public static Transformer getPrimeTransformer () {
        return new PrimeTransformer();
    }

    /**
     * 大黄蜂静态工厂方法
     * @return
     */
    public static Transformer getBubbleBeeTransformer() {
        return new BubbleBeeTransformer();
    }
}
