package com.khomkrit.leetcode;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Fibonacci: " + displayFibonacci(number));
    }

    public static int displayFibonacci(int number) {
        int[] fibonacci = new int[number + 2];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) {
            // start at index 3
            // Fibonacci = Fn-1 + Fn-2
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println("All numbers: "+ Arrays.toString(fibonacci));
        return fibonacci[number];
    }

    public static int recursivelyDisplayFibonacci(int number) {
        if (number <= 1) {
            return number;
        }
        return recursivelyDisplayFibonacci(number - 1) + recursivelyDisplayFibonacci(number - 2);
    }
}
