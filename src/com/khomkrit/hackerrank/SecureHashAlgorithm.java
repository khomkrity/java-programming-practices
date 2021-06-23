package com.khomkrit.hackerrank;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Scanner;

public class SecureHashAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(input.getBytes(StandardCharsets.UTF_8));
            byte[] digest = messageDigest.digest();
            for(byte b : digest){
                System.out.format("%02x",b);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
