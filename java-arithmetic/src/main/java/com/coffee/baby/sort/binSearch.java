package com.coffee.baby.sort;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/5/13 21:25
 **/
public class binSearch {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 4, 8};
//        int tmp = binSearch(arr, 3);
//        System.out.println(tmp);

        System.out.println(findDuplicate(arr));

    }

    public static int binSearch(int [] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left)>>>1;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if(arr[mid] > target) {
                right = mid - 1;
            } else  {
                return mid;
            }
        }

        return -1;
    }

    public static int findDuplicate(int[] nums) {

        /**
         快慢指针思想, fast 和 slow 是指针, nums[slow] 表示取指针对应的元素
         注意 nums 数组中的数字都是在 1 到 n 之间的(在数组中进行游走不会越界),
         因为有重复数字的出现, 所以这个游走必然是成环的, 环的入口就是重复的元素,
         即按照寻找链表环入口的思路来做
         **/
        int fast = 0, slow = 0;
        while(true) {
            fast = nums[nums[fast]];
            slow = nums[slow];
            if(slow == fast) {
                fast = 0;
                while(nums[slow] != nums[fast]) {
                    fast = nums[fast];
                    slow = nums[slow];
                }
                return nums[slow];
            }
        }
    }
}
