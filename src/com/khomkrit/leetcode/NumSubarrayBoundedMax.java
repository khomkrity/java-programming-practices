package com.khomkrit.leetcode;

import java.util.Arrays;

public class NumSubarrayBoundedMax {
    public static void main(String[] args) {
        int[] nums = {2, 9, 2, 5, 6};
        int left = 2;
        int right = 8;
        System.out.println("Given array: " + Arrays.toString(nums));
        System.out.println("Minimum value: " + left);
        System.out.println("Maximum value: " + right);
        System.out.println("Number of Sub-array Bounded by maximum value: " + numSubarrayBoundedMax(nums, left, right));
    }

    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int ans = 0, low = 0, mid = 0;
        for (int num : nums) {
            if (num > right) {
                mid = 0;
            } else {
                mid++;
                ans += mid;
            }
            if (num >= left) {
                low = 0;
            } else {
                low++;
                ans -= low;
            }
        }
        return ans;
    }
}
