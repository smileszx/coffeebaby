package com.coffee.baby.arrays;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/3/7 16:27
 **/
public class SingleNumber {
    public static void main(String[] args) {
        int [] nums = {5,2,5};

        int result = singleNumber(nums);
        System.out.println(result);
    }

    public static int singleNumber(int [] nums) {

        int len = nums.length;
        int res = -1;
        if(len >= 1) {
            res = nums[0];
            for (int i = 1; i < len; i++) {
                res = res ^ nums[i];
            }
        }
        return res;
    }
}
