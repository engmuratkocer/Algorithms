package com.algorithms.study.basic;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SubsetsOfSet {


    static <T> Set<Set<T>> powerSet(Set<T> set) {
        T[] element = (T[]) set.toArray();
        final int SET_LENGTH = 1 << element.length;

        System.out.println("SET_LENGTH : " + SET_LENGTH);
        Set<Set<T>> powerSet = new HashSet<>();
        for (int binarySet = 0; binarySet < SET_LENGTH; binarySet++) {
            Set<T> subset = new HashSet<>();
            for (int bit = 0; bit < element.length; bit++) {
                int mask = 1 << bit;
                System.out.println(" binarySet : " + binarySet + " bit : " + bit + " Res : " + Integer.toBinaryString(binarySet & mask));
                if ((binarySet & mask) != 0) {
                   // System.out.println(" Number : " + Integer.toBinaryString(binarySet) + " Mask : " + Integer.toBinaryString(mask) + " Res : " + Integer.toBinaryString(binarySet & mask));
                    subset.add(element[bit]);
                }
            }
            powerSet.add(subset);
        }
        return powerSet;
    }

    public static void main(String[] args) {
        Set<Character> test = new HashSet<>();
        test.add('a');
        test.add('b');
        test.add('c');
        System.out.println("test = " + test);
        Set<Set<Character>> result = powerSet(test);
        System.out.println(result);
    }

}