package com.coffee.baby.arithmetic.sort;

import java.util.*;

/**
 * @Description 冒泡排序，最基础的排序算法
 * 冒泡排序：N个数字要排序完成，总共进行N-1趟排序，每i趟的排序次数为(N-i)次，
 * 所以可以用双重循环语句，外层控制循环多少趟，内层控制每一趟的循环次数
 * @Author Thinkpad
 * @Date 2019/1/23 11:37
 **/
public class BubbleSort {


    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<Integer>();
//
//        list.add(7);
//        list.add(6);
//        list.add(10);
//        list.add(9);
//        list.add(8);
//        System.out.println("before sort: " + list);
//            bubbleSort(list);
//        System.out.println("after sort: " + list);


//        int [] arr = {7, 6, 10, 9, 8, 2, 1, 5, 3};
        int [] arr = {10,9,8,7,6,5,4,3,2,1};
        System.out.println("before sort: ");
        for (int temp : arr) {
            System.out.printf(temp + " ");
        }
        System.out.println("\n=============================");
        bubbleSortIntArr(arr);
        System.out.println("after sort: ");
        for (int temp : arr) {
            System.out.printf(temp + " ");
        }

        int [] arrA = {10,9,8,7,6,5,4,3,2,1};
        int [] arrB = {101,91,8,7,6,51,4,31,21,11};
        bubbleSortByMap(arrA, arrB);

    }

    public static boolean bubbleSortIntArr (int [] arr) {

        //判断数组是否为空
        if(arr.length == 0) {
            System.out.println("数组arr为空");
            return false;
        }
        int m=0, n=0;
        for(int i=0; i<arr.length-1; i++) { // 外层控制比较轮数
            for(int j=0; j<arr.length-1-i; j++) { //内层控制每轮的比较次数，每轮比较次数递减1
                    if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println("m=" + m + ", n=" + n);
                    for (int tp : arr) {
                        System.out.printf(tp + " ");
                    }
                    System.out.println(" ");
                }
                n++;
            }
            m++;
        }
        System.out.println("遍历次数,m= "+ m + ", n= " + n);

        return true;
    }

    /**
     * List数组升序排序
     * @param list
     * @return
     */
    public static boolean bubbleSort(List<Integer> list) {
        //判断数组是否为空
        if (list == null || list.isEmpty()){
            return false;
        }

        int m=0, n=0;
        for (int i = 0; i<list.size()-1; i++ ) {
            for (int j=i+1; j<list.size(); j++) {
                if(list.get(i) > list.get(j)) {
                   Integer temp = list.get(i);
                   list.set(i, list.get(j));
                   list.set(j, temp);
                }
                n++;
            }
            m++;
        }
        System.out.println("遍历次数,m= "+ m + ", n= " + n);
        return true;
    }


    /**
     * 两个整形数组，输出同时出现在两个数组中的数据
     * @param arrA
     * @param arrB
     * @return
     */
    public static boolean bubbleSortByMap(int[] arrA, int [] arrB) {
        //判断数组是否为空
        if (arrA.length == 0 && arrB.length == 0) {
            System.out.println("数组为空");
            return false;
        }

        //冒泡算法实现
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arrA.length; i++) {
            map.put(arrA[i], arrA[i]);
        }
        System.out.println("map ：" + map);

        for (int j=0; j<arrB.length; j++) {
            if (Integer.valueOf(arrB[j]).equals(map.get(arrB[j]))) {
                System.out.println(arrB[j]);
            }
        }

        return true;
    }

}
