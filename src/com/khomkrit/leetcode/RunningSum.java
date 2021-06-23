package com.khomkrit.leetcode;

import java.util.Arrays;

// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.
public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 10, 1};
        System.out.println("Given an array: " + Arrays.toString(nums));
        System.out.println("Running Sum: " + Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = nums[i] + result[i - 1];
        }
        return result;
    }
}
