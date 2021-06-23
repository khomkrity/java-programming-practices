package com.khomkrit.leetcode;

public class DefangIPAddress {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));
    }

    // Given a valid (IPv4) IP address, return a defanged version of that IP address.
    // A defanged IP address replaces every period "." with "[.]".
    public static String defangIPaddr(String address) {
        String defangedIP = "";
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) != '.') {
                defangedIP += address.charAt(i);
            } else {
                defangedIP += "[.]";
            }
        }
        return defangedIP;
    }

    // another way:
    // String defangedIP = address.replace(".","[.]");
    // return defangedIP;
}
