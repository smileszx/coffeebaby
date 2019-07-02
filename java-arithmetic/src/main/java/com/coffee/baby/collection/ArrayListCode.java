package com.coffee.baby.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/5/20 23:29
 **/
public class ArrayListCode {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>(1);

        System.out.println(arrayList.size());
        arrayList.add(2);
        arrayList.add(4);
    }
}
