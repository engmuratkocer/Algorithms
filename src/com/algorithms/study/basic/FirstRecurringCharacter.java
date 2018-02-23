package com.algorithms.study.basic;

import java.util.HashMap;

public class FirstRecurringCharacter {

    public static void main(String[] args) {

        String str = "klmngdhsabcdba";

        char firstRecurringChar = findFirstRecurringCharInString(str);

        System.out.println(firstRecurringChar + " is the first recurring char in the string.");

    }

    private static Character findFirstRecurringCharInString(String str) {
        HashMap<Character, Boolean> charMap = new HashMap();

        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (charMap.get(c) != null) {
                return c;
            }
            charMap.put(c, true);
        }
        return 0;
    }

}
