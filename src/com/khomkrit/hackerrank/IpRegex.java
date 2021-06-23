package com.khomkrit.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyRegex {
    private String pattern;

    public MyRegex() {
        pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
    }

    public List<Boolean> validateIp(List<String> ipAddresses) {
        Pattern pattern = Pattern.compile(this.pattern);
        List<Boolean> result = new ArrayList<>();
        for (String ip : ipAddresses) {
            Matcher matcher = pattern.matcher(ip);
            result.add(matcher.matches());
        }
        return result;
    }
}

public class IpRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> ipAddresses = new ArrayList<>();
        while(scanner.hasNextLine()){
            ipAddresses.add(scanner.nextLine());
        }
        scanner.close();
        MyRegex myRegex = new MyRegex();
        List<Boolean> validatedIp = myRegex.validateIp(ipAddresses);
        for (Boolean b : validatedIp) {
            System.out.println(b);
        }

    }
}
