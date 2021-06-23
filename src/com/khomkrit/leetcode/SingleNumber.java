package com.khomkrit.leetcode;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {3, 1, 1, 2, 2};
        System.out.println("Given an array: " + Arrays.toString(nums));
        System.out.println("Single number in the array: " + singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int answer = 0;
        for (int number : nums) {
            answer ^= number;
        }
        return answer;
    }
}
