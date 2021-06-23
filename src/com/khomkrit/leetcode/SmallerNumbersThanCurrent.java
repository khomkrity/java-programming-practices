package com.khomkrit.leetcode;

import java.util.Arrays;

// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
// That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
// Return the answer in array.
public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int nums[] = {6, 5, 4, 8};
        int smallerNumber[] = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(smallerNumber));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int count;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
