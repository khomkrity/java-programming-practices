package com.khomkrit.leetcode;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 8}, {2, 8, 4}, {3, 5, 7}};
        System.out.println("maximum wealth: " + maximumWealth(accounts));
    }
    // Return the wealth that the richest customer has.
    // A customer's wealth is the amount of money they have in all their bank accounts (inner array index).
    // The richest customer is the customer that has the maximum wealth.
    public static int maximumWealth(int[][] accounts) {
        int sum;
        int maxWealth = 0;
        for (int index = 0; index < accounts.length; index++) {
            sum = 0;
            for (int j = 0; j < accounts[index].length; j++) {
                sum += accounts[index][j];
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
