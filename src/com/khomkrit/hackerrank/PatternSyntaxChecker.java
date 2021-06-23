package com.khomkrit.hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSyntax = Integer.parseInt(scanner.nextLine());
        String[] syntax = new String[numberOfSyntax];
        for (int i = 0; i < numberOfSyntax; i++) {
            syntax[i] = scanner.nextLine();
        }
        scanner.close();
        for (int i = 0; i < numberOfSyntax; i++) {
            try {
                Pattern pattern = Pattern.compile(syntax[i]);
                System.out.println("Valid");
            }catch (PatternSyntaxException exception){
                System.out.println("Invalid");
            }
        }

    }
}
