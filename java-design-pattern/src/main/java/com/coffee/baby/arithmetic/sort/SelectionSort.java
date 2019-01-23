package com.coffee.baby.arithmetic.sort;

/**
 * @Description 选择排序
 * @Author Thinkpad
 * @Date 2019/1/23 16:38
 **/
public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {23,43, 546, 6573, 24,123,989};

        System.out.println("before sort: ");
        for (int temp : arr) {
            System.out.printf(temp + " ");
        }
        System.out.println(" ");

        simpleSelectionSort(arr);

        System.out.println("after sort: ");
        for (int temp : arr) {
            System.out.printf(temp + " ");
        }
        System.out.println(" ");
    }

    /**
     * 简单选择排序
     * @param arr
     */
    public static void simpleSelectionSort (int [] arr) {
        //判断数组是否为空
        if (arr.length == 0) {
            return;
        }

        //遍历数组，将最小值放在指定位置，
        // 比如第一轮，那么比较出的最小元素就放在index=0的位置，以此类推
        for (int i=0; i<arr.length-1; i++) {
            int k = i;//arr[k] 临时变量，存储最小值
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j] < arr[k]) {
                    k=j;
                }
            }
            if (i != k) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
    }
}
