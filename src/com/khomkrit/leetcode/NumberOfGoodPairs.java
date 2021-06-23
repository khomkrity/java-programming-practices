package com.khomkrit.leetcode;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1, 1, 3};
        System.out.println("number of good pairs: " + numIdenticalPairs(nums));
    }

    // A pair is called good if nums[i] == nums[j] and i < j (equal value and lower index).
    //Return the number of good pairs.
    public static int numIdenticalPairs(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result++;
                }
            }
        }
        return result;
    }
}
