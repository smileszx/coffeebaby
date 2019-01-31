package com.coffee.baby.arithmetic.sum;

import java.util.*;

/**
 * @Description
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @Author Thinkpad
 * @Date 2019/1/31 17:36
 **/
public class TwoSum {


    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int target = 13;

        int [] result = twoSumMethodOneHash(nums, target);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    /**
     * 复杂度分析：
     * 时间复杂度：O(n)， 我们把包含有 n 个元素的列表遍历两次。由于哈希表将查找时间缩短到 O(1) ，所以时间复杂度为 O(n)。
     * 空间复杂度：O(n)， 所需的额外空间取决于哈希表中存储的元素数量，该表中存储了 n 个元素。
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSumMethod (int [] nums, int target) {
        if (nums == null && nums.length == 0) {
            throw new IllegalArgumentException("Input array is empty.");
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++) {
            map.put(Integer.valueOf(nums[i]), Integer.valueOf(i));
        }

        for (int j=0; j<nums.length; j++) {
            int temp = target - nums[j];
            if (map.keySet().contains(temp) && (j != map.get(temp))) {
                return new int [] {j, map.get(temp)};
            }
        }
        throw new IllegalArgumentException("No two sum solution.");
    }

    /**
     * 复杂度分析：
     * 时间复杂度：O(n)， 我们只遍历了包含有 n个元素的列表一次。在表中进行的每次查找只花费 O(1)的时间。
     * 空间复杂度：O(n)， 所需的额外空间取决于哈希表中存储的元素数量，该表最多需要存储 n个元素。
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSumMethodOneHash (int [] nums, int target) {
        int [] result = new int[2];

        if (nums == null && nums.length == 0) {
            throw new IllegalArgumentException("Input array is empty.");
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int j=0; j<nums.length; j++) {
            int temp = target - nums[j];
            if (map.keySet().contains(temp) && (j != map.get(temp))) {
                return new int[] {j, map.get(temp)};
            }
            map.put(Integer.valueOf(nums[j]), j);
        }
        throw new IllegalArgumentException("No two sum solution.");
    }
}
