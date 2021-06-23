package com.khomkrit.leetcode;

import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] target = createTargetArray(nums, index);
        System.out.println(Arrays.toString(target));
    }

    // Given two arrays of integers nums and index.
    // Your task is to create target array under the following rules:
    // Initially target array is empty.
    // From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
    // Repeat the previous step until there are no elements to read in nums and index.
    // Return the target array.
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (index[i] < i) {
                System.arraycopy(target, index[i], target, index[i] + 1, nums.length - index[i] - 1);
            }
            target[index[i]] = nums[i];
        }
        return target;
    }
}
