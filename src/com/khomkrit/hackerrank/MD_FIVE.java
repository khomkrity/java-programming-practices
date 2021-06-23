package com.khomkrit.hackerrank;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD_FIVE {
    public static  void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(input.getBytes("UTF-8"));
        byte[] digest = messageDigest.digest();
        /* Print the encoded value in hexadecimal */
        for (byte b : digest) {
            System.out.format("%02x", b);
        }
    }
}
