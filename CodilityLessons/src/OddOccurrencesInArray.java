package com.test.CodilityTraining;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OddOccurrencesInArray {


    public static void main(String[] args) {

        int n = 67;

        Set nonPairs = new HashSet();

        int a[] = {1, 2, 3, 4, 5, 2, 3, 4, 5};

        for (int i = 0; i < a.length; i++) {
            if (nonPairs.contains(a[i]) == true) {
                nonPairs.remove(a[i]);
            } else {
                nonPairs.add(a[i]);
            }
        }

        System.out.println(nonPairs.iterator().next());

    }
}
