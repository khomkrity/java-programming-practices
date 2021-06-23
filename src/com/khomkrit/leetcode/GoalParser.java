package com.khomkrit.leetcode;

public class GoalParser {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println("Goal Parser: " + interpret(command));
    }

    public static String interpret(String command) {
        int n = command.length();

        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < n) {
            if (command.charAt(i) == 'G') {
                stringBuilder.append("G");
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                stringBuilder.append("o");
                i += 2;
            } else {
                stringBuilder.append("al");
                i += 4;
            }
        }

        return stringBuilder.toString();
    }
}
