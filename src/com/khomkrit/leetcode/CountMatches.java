package com.khomkrit.leetcode;

import java.util.ArrayList;
import java.util.List;

// You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item.
// You are also given a rule represented by two strings, ruleKey and ruleValue.
// The ith item is said to match the rule if one of the following is true:
// ruleKey == "type" and ruleValue == typei.
// ruleKey == "color" and ruleValue == colori.
// ruleKey == "name" and ruleValue == namei.
// Return the number of items that match the given rule.
public class CountMatches {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        String ruleKey = "color";
        String ruleValue = "silver";
        items.add(newItem("phone", "blue", "pixel"));
        items.add(newItem("computer", "silver", "lenovo"));
        items.add(newItem("phone", "gold", "iphone"));

        System.out.println("Given items: " + items.toString());
        System.out.println("Given key: " + ruleKey + ", value: " + ruleValue);
        System.out.println("Count matches: " + countMatches(items, ruleKey, ruleValue));
    }

    public static List<String> newItem(String type, String color, String name) {
        List<String> newItem = new ArrayList<>();
        newItem.add(type);
        newItem.add(color);
        newItem.add(name);
        return newItem;
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int matches = 0;
        int keyIndex = 0;
        if (ruleKey.equals("type")) {
            keyIndex = 0;
        } else if (ruleKey.equals("color")) {
            keyIndex = 1;
        } else if (ruleKey.equals("name")) {
            keyIndex = 2;
        }
        for (List<String> item : items) {
            if (item.get(keyIndex).equals(ruleValue) && !item.get(keyIndex).equals(ruleKey)) {
                matches++;
            }
        }
        return matches;
    }
}
