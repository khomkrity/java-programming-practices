package com.khomkrit.leetcode;

import java.util.Arrays;
// Given a square matrix mat, return the sum of the matrix diagonals.
// Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};
        System.out.println("Given matrix: " + Arrays.toString(mat));
        System.out.println("Diagonal sum: " + diagonalSumTwo(mat));
    }
    // bruteforce solution
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int k = mat.length - 1; // last index
        if (mat.length == 1) {
            return mat[0][0];
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j) {
                    sum += mat[i][j];
                } else {
                    if (j == k) {
                        sum += mat[i][j];
                    }
                }
            }
            k--;
        }
        return sum;
    }
    // faster solution
    public static int diagonalSumTwo(int[][] mat) {
        int sum = 0;
        for (int i = 0, j = mat.length - 1; i < mat.length; i++, j--) {
            sum += mat[i][i] + mat[i][j];//adding each elements of both the diagonals
        }
        //if n is even then there will be no common elements in the diagonals i.e. 4x4 matrix has no middle value
        //if n is odd , means odd square matrix, then middle element will be common for both the diagonals i.e. 3x3 matrix has a middle value
        if (mat.length % 2 == 1) {
            sum = sum - mat[mat.length / 2][mat.length / 2];// eliminating the common element aka the middle value in odd matrix
        }
        return sum;
    }
}
