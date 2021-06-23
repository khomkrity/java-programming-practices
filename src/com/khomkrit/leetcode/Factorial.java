package com.khomkrit.leetcode;

public class Factorial {
    public static void main(String[] args) {
        int number = 3;
        System.out.println("Factorial: " + recursivelyCalculateFactorial(number));
    }

    public static int calculateFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            // 1 * 1 => 1 * 2 => 2 * 3 => 6
            result = result * i;
        }
        return result;
    }

    public static int recursivelyCalculateFactorial(int number) {
        if(number == 0){
            return 1;
        }
        return number * recursivelyCalculateFactorial(number - 1);
    }
}
