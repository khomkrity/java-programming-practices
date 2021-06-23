package com.khomkrit.leetcode;


import java.util.Arrays;

// Time Complexity: O(2log(n)) => O(log(n))
// find the last true for maximum or greater value
// find the first false for minimum or lesser value
public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7, 8, 10, 23, 24, 32, 40};
        int[] mountain = {0, 2, 3, 4, 8, 10, 5, 3, 1};
        int target = 5;
        int number = 4;
        int greater = 6;
        System.out.println("Given a sorted array: " + Arrays.toString(numbers));
        System.out.println("Find: " + target);
        System.out.println("Binary Search index: " + binarySearch(numbers, target));
        System.out.println("First greater or equal to " + greater + " => " + findFirstGreaterOrEqualValue(numbers, greater));
        System.out.println();
        System.out.println("From number: " + number);
        System.out.println("Its root = " + calculateRootOfNumber(number));
        System.out.println();
        System.out.println("Given an increasing and decreasing array: " + Arrays.toString(mountain));
        System.out.println("Peak: " + findPeak(mountain));
    }

    public static int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + ((right - left) / 2);
            if (numbers[mid] == target) {
                return mid;
            }
            if (numbers[mid] < target) {
                left = mid + 1;
            }
            if (numbers[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int calculateRootOfNumber(int number) {
        int left = 0;
        int right = number;
        int mid = 0;
        while (left <= right) {
            mid = left + ((right - left) / 2);
            if (Math.pow(mid, 2) == number) {
                return mid;
            }
            if (Math.pow(mid, 2) < number) {
                left = mid + 1;
            }
            if (Math.pow(mid, 2) > number) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int findFirstGreaterOrEqualValue(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int answer = -1;
        int mid = 0;
        // exit only when left > right
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (numbers[mid] >= target) {
                answer = numbers[mid];
                right = mid - 1;
            }
            if (numbers[mid] < target) {
                left = mid + 1;
            }
        }
        return answer;
    }

    // {0, 2, 3, 4, 8, 10, 5, 3, 1} => 10
    public static int findPeak(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        int mid = 0;
        int answer = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (mid == 0 || numbers[mid] >= numbers[mid - 1]) {
                answer = numbers[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return answer;
    }


}
