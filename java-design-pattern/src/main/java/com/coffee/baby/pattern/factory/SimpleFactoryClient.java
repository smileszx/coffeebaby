package com.coffee.baby.pattern.factory;

/**
 * @Classname SimpleFactoryClient
 * @Description TODO
 * @Date 2019/1/22 11:41
 * @Created by smile.szx
 */
public class SimpleFactoryClient {

    public static void main(String[] args) {
        Transformer prime = TransformerSimpleFactory.getPrimeTransformer();
        Transformer bubble = TransformerSimpleFactory.getBubbleBeeTransformer();

        System.out.println(prime);
        System.out.println(bubble);

        Transformer primeCopy = TransformerSimpleFactory.createTransformer("prime");
        Transformer bubbleCopy = TransformerSimpleFactory.createTransformer("bubblebee");

        System.out.println(primeCopy);
        System.out.println(bubbleCopy);
    }
}
