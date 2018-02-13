package com.algorithms.maths;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class A3PrimeFactors {

    public static void main(String[] args) {

        long n = 600851475143l;

        Set<Long> multiplier = new HashSet();

        for (long i = n; i > 1; i--) {
            if (n % i == 0 ) {
                multiplier.add(i);
            }
        }

        System.out.println(" fınıshed ");

//        for (Long i : multiplier
//                ) {
//            System.out.println(i);
//        }

        Set<Long> notPrimeSet = new HashSet<>();

        long max = 0;

        for (Long i : multiplier
                ) {

            boolean notPrime = false;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    notPrime = true;
                }
            }

            if (notPrime == false) {
                if (i > max)
                        max = i;
            }

        }
        System.out.println("---------------- PRIMES -------------------");
        System.out.println(max);

    }
}
