package com.algorithms.study.basic;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRecurringCharacter {

    public static void main(String[] args) {

        String str = "akflgjsnmshfbcdba";

        char firstNonRecurringChar = findFirstNonRecurringCharInString(str);

        System.out.println(firstNonRecurringChar + " is the first non recurring char in the string.");

    }

    private static Character findFirstNonRecurringCharInString(String str) {
        HashMap<Character, Integer> charMap = new LinkedHashMap<>();

        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (charMap.get(c) != null) {
                charMap.put(c, -1);
            } else {
                charMap.put(c, index++);
            }
        }

        for (Character c :
                charMap.keySet()) {
            if (charMap.get(c) != -1) {
                return c;
            }
        }

        return 0;
    }

}
