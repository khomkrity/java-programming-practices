package com.khomkrit.leetcode;

public class StringIndex {
    public static void main(String[] args) {
        System.out.println(strStr("abcdefghi", "ghi"));
    }

    // the method returns the first occurrence of string 'needle' in string 'haystack'
    // if 'needle' is empty, then the method returns 0
    // if both string are not matched, then the method returns -1
    // compare by substring haystack start from index (incremented by one at a time)
    // end at index + needle's length (depends on the length of needle)

    public static int strStr(String haystack, String needle) {
        int result = -1;
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        if (needleLength == 0) {
            return 0;
        }
        if (haystackLength == 0) {
            return result;
        }
        System.out.println("haystack: "+haystack);
        System.out.println("haystack length: "+haystackLength);
        System.out.println("needle: "+needle);
        System.out.println("needle length: "+ needleLength);
        System.out.println("max length: "+(haystackLength - needleLength + 1));
        for (int index = 0; index < (haystackLength - needleLength) + 1; index++) {
            String subHaystack = haystack.substring(index, (index + needleLength));
            System.out.println("index: "+index);
            System.out.print("substring("+index+",("+index+" + "+needleLength+"))");
            System.out.println(" => "+subHaystack);
            if (subHaystack.equals(needle)) {
                result = index;
                break;
            }
        }
        return result;
    }
}
