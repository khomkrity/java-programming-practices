package com.khomkrit.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


class Result {

    /*
     * Complete the 'formingMagicSquare' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY s as parameter.
     */

    public static int formingMagicSquare(List<List<Integer>> square) {
        int cost[] = {0, 0, 0, 0, 0, 0, 0, 0};
        // 8 possible magic squares
        // each i index contains 1 magic square
        int magicSquares[][] =
                {
                        {4, 9, 2, 3, 5, 7, 8, 1, 6},
                        {4, 3, 8, 9, 5, 1, 2, 7, 6},
                        {2, 9, 4, 7, 5, 3, 6, 1, 8},
                        {2, 7, 6, 9, 5, 1, 4, 3, 8},
                        {8, 1, 6, 3, 5, 7, 4, 9, 2},
                        {8, 3, 4, 1, 5, 9, 6, 7, 2},
                        {6, 7, 2, 1, 5, 9, 8, 3, 4},
                        {6, 1, 8, 7, 5, 3, 2, 9, 4},
                };
        // compare a given square with all 8 possibilities
//        int topLeft = square.get(0).get(0);
//        int topEdge = square.get(0).get(1);
//        int topRight = square.get(0).get(2);
//        int middleLeftEdge = square.get(1).get(0);
//        int middle = square.get(1).get(1);
//        int middleRightEdge = square.get(1).get(2);
//        int bottomLeft = square.get(2).get(0);
//        int bottomEdge = square.get(2).get(1);
//        int bottomRight = square.get(2).get(2);
        for (int i = 0; i < 8; i++) {

            cost[i] = Math.abs(magicSquares[i][0] - square.get(0).get(0)) + Math.abs(magicSquares[i][1] - square.get(0).get(1)) + Math.abs(magicSquares[i][2] - square.get(0).get(2));

            cost[i] += Math.abs(magicSquares[i][3] - square.get(1).get(0)) + Math.abs(magicSquares[i][4] - square.get(1).get(1)) + Math.abs(magicSquares[i][5] - square.get(1).get(2));

            cost[i] += Math.abs(magicSquares[i][6] - square.get(2).get(0)) + Math.abs(magicSquares[i][7] - square.get(2).get(1)) + Math.abs(magicSquares[i][8] - square.get(2).get(2));

        }
        Arrays.sort(cost);
        System.out.println("cost of change: " + Arrays.toString(cost));
        return cost[0];

    }

}


public class MagicSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> square = new ArrayList<>();
        String[] input = new String[3];
        for (int i = 0; i < 3; i++) {
            input[i] = scanner.nextLine();
            List<Integer> rowValue = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                String[] row = input[i].split(" ");
                rowValue.add(Integer.parseInt(row[0]));
                rowValue.add(Integer.parseInt(row[1]));
                rowValue.add(Integer.parseInt(row[2]));
            }
            square.add(rowValue);
        }
        System.out.println("lowest cost: " + Result.formingMagicSquare(square));
    }
}
