package com.coffee.baby.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/5/12 14:42
 **/
public class StatArrayItem {


    public static void main(String[] args) {
        int [] arr = {1, 1, 1, 4, 5, 6, 6, 6, 34, 34};

        Map<Integer, Integer> map = statArray(arr);
        System.out.println(map);
    }

    public static Map<Integer, Integer> statArray (int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        if (arr == null)
            return map;
        for (int i=0; i<arr.length; i++) {
            if (map.containsKey(arr[i])) {
                Integer sum = map.get(arr[i]);
                sum++;
                map.put(arr[i], sum);
            } else {
                map.put(arr[i], 1);
            }
        }
        return map;
    }
}
