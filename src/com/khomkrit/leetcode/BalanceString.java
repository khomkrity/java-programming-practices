package com.khomkrit.leetcode;

// Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
// Given a balanced string s, split it in the maximum amount of balanced strings.
// Return the maximum amount of split balanced strings.
public class BalanceString {
    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        System.out.println("numbers of balanced strings: " + balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s) {
        int r = 0;
        int l = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                r++;
            } else {
                l++;
            }
            if (r == l && r != 0) {
                count++;
                r = 0;
                l = 0;
            }
        }
        return count;
    }
}
