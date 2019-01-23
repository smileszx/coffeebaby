package com.coffee.baby.arithmetic.sort;

/**
 * @Description 快速排序算法
 * @Author Thinkpad
 * @Date 2019/1/23 10:58
 **/
public class QuickSort {

    //分治思想
    //空间复杂度：快速排序是一种原地排序，只需要一个很小的栈作为辅助空间
    //空间复杂度为O(log2(n))，适合在数据集较大的时候使用
    //时间复杂度比较复杂，最好的情况是O(n)，最差的情况是O(n2)，所以平时说的O(nlogn)，为其平均时间复杂度。

    public static void main(String[] args) {
        int [] arr = {6,  1,  2, 7,  9,  3,  4,  5, 10,  8};
        quickSort(arr, 0, arr.length);
    }

    public static void quickSort (int[] arr, int start, int end) {
        if (arr.length == 0) {
            return;
        }

        if (start >= end) {
            return;
        }

        int midindex = arr.length / 2;

        int middle = arr[midindex];

        for (int i=0; i<midindex; i++) {
            if (arr[i] > middle){

            }
        }
    }
}
