package com.khomkrit.oop;

public class Main {

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {

        int result = -1;
        int needleLength = needle.length();
        int haystackLength = haystack.length();

        if (needleLength == 0) {
            return 0;
        }

        if (haystackLength == 0) {
            return result;
        }

        for (int i = 0; i < (haystackLength - needleLength) + 1; i++) {
            // substring from haystack starting from index to needle's length
            // then compare by value with needle
            if (haystack.substring(i, (i + needleLength)).equals(needle)) {
                result = i;
                break;
            }
        }
        return result;
    }
}
