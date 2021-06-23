package com.khomkrit.hackerrank;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParentheses {
    public static void main(String[] args) {
        String expression = "[({})]";
        System.out.println("Given an expression: " + expression);
        System.out.println("Is this expression balanced: " + isBalanced(expression));
    }

    public static boolean isBalanced(String expression) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            char character = expression.charAt(i);
            if (character == '(' || character == '{' || character == '[') {
                // push the open bracket into the stack
                stack.push(character);
                // continue to the next iteration
                // it only needs to check the later conditions when the character is not an opening bracket
                continue;
            }
            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.size() == 0) {
                return false;
            }
            char check;
            switch (character) {
                case ')':
                    check = stack.pop();
                    if (check != '(')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check != '{')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check != '[')
                        return false;
                    break;
            }
        }
        // if stack is not empty (not in balanced), returns false
        return stack.isEmpty();
    }
}
