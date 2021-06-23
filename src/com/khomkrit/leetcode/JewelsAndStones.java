package com.khomkrit.leetcode;

import java.util.HashMap;

// You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
// Each character in stones is a type of stone you have.
// You want to know how many of the stones you have are also jewels.
// Letters are case sensitive, so "a" is considered a different type of stone from "A".
public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aAaBb";
        String stones = "aAAbbbb";
        System.out.println("jewels in stones: " + anotherWay(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int answer = 0;
        HashMap<Integer, Character> jewelMap = new HashMap<>();
        for (int i = 0; i < jewels.length(); i++) {
            if (!jewelMap.containsValue(jewels.charAt(i))) {
                jewelMap.put(i, jewels.charAt(i));
            }
        }
        for (int i = 0; i < stones.length(); i++) {
            if (jewelMap.containsValue(stones.charAt(i))) {
                answer++;
            }
        }
        return answer;
    }

    public static int anotherWay(String jewels, String stones) {
        int answer = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                answer++;
            }
        }
        return answer;
    }
}
