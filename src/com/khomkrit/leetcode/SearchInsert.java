package com.khomkrit.leetcode;

public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 4;
        System.out.println(searchInsert(nums, target));
    }

    //Given a sorted array of distinct integers and a target value, return the index if the target is found.
    // If not, return the index where it would be if it were inserted in order.
    //write an algorithm with O(log n) runtime complexity.
    public static int searchInsert(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;
        int i = 0;
        while (low <= high) {
            i = (low + high) / 2;
            if (nums[i] > target) {
                high = i - 1;
            } else if (nums[i] == target) {
                return i;
            } else {
                low = i + 1;
            }
        }
        return low;
    }
}
