package com.coffee.baby.arrays;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/3/6 22:15
 **/
public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int [] nums1 ={2,0};
        int m = 1;
        int [] nums2 = {1};
        int n = 1;

        mergeNew(nums1,m,nums2,n);

        for (int i=0; i<nums1.length;i++) {
            System.out.println(nums1[i]);
        }


    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m-- + n-- - 1;
        while(n >= 0)
            nums1[k--] = (m == -1 || nums2[n] >= nums1[m]) ? nums2[n--] : nums1[m--];
    }

    public static void mergeNew (int[] nums1, int m, int[] nums2, int n) {
        if ( m== 0 || n == 0)
           return;
        int [] nums3 = new int[m + n];

        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        while (index3 < (m+n)){
            if (index1 < m && index2 < n && nums1[index1] <= nums2[index2]) {
                nums3[index3] = nums1[index1];
                index1++;
            } else if (index1 <m && index2 < n){
                nums3[index3] = nums2[index2];
                index2++;
            } else if (index1 < m && index2 >= n) {
                nums3[index3] = nums1[index1];
                index1++;
            }
            index3 ++;
        }
        for (int i=0; i<nums3.length;i++) {
            nums1[i] = nums3[i];
        }
    }
}
