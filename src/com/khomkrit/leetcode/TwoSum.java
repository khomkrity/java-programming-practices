package com.khomkrit.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println("two sum: " + Arrays.toString(twoSumFastest(nums, target)));
    }

    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution");
    }

    public static int[] twoSumFaster(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // assign value to key, index to value in map
            map.put(nums[i], i);
        }
        System.out.println(map);
        for (int i = 0; i < nums.length; i++) {
            // check if map contains value and index is not equal to value
            if (map.containsKey(target - nums[i]) && i != map.get(target - nums[i]))
                return new int[]{i, map.get(target - nums[i])};
        }
        return new int[2];
    }
    // y = target - x => complement of the target
    // map.get(key) returns value in the given key
    // map.containsKey(key) returns boolean of the existence of the given key in map
    public static int[] twoSumFastest(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement))
                return new int[]{i, map.get(complement)};
            map.put(nums[i], i);
        }

        return new int[2];
    }
}
