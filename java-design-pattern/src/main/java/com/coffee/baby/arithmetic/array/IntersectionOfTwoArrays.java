package com.coffee.baby.arithmetic.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Description
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Note:
 *
 * Each element in the result must be unique.
 * The result can be in any order.
 * @Author Thinkpad
 * @Date 2019/1/31 20:59
 **/
public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int [] nums2 = {9,4,9,8,4};

        int[] result = intersectionWith2Map(nums1, nums2);
        for (int i = 0; i<result.length; i++) {
            System.out.printf(result[i] + " ");
        }
    }

    /**
     * 取两个数组的交集，返回数组不包含重复元素
     * @param nums1
     * @param nums2
     * @return
     */
    private static int[] intersection(int[] nums1, int[] nums2) {

        if (nums1.length == 0 && nums2.length == 0) {
            throw new IllegalArgumentException("Input array is empty.");
        }

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> resultMap = new HashMap<>();
        for (int i = 0; i<nums1.length; i++) {
            map.put(nums1[i], nums1[i]);
        }

        for (int j = 0; j<nums2.length; j++) {
            if (Integer.valueOf(nums2[j]).equals(map.get(Integer.valueOf(nums2[j])))) {
                resultMap.put(nums2[j],nums2[j]);
            }
        }
        int [] result = new int[resultMap.size()];
        final int[] index = {0};
        resultMap.forEach((k,v) ->{
            result[index[0]] = v;
            index[0]++;
        });
        return result;
    }


    /**
     * 取两个数组的交集，返回数组不包含重复元素
     * @param nums1
     * @param nums2
     * @return
     */
    private static int[] intersectionWith2Map(int[] nums1, int[] nums2) {
        //check input params
        if (nums1.length == 0 && nums2.length == 0) {
            throw new IllegalArgumentException("Input array is empty.");
        }

        Map<Integer, Integer> mapA = new HashMap<>();
        for (int i = 0; i<nums1.length; i++) {
            mapA.put(nums1[i], nums1[i]);
        }

        Map<Integer, Integer> mapB = new HashMap<>();
        for (int j = 0; j<nums2.length; j++) {
            if (Integer.valueOf(nums2[j]).equals(mapA.get(nums2[j]))) {
                mapB.put(nums2[j], nums2[j]);
            }
        }
        int [] result = new int[mapB.size()];
        int index = 0;
        for (Integer element : mapB.values()){
            result[index] = element;
            index++;
        }
        return result;
    }
}
