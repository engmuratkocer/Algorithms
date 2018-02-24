package com.algorithms;

/**
 *
 * Calculate minumum steps eggs broken, at 100 step stairs, by totally moving eggs minumum.
 *
 */
public class HundredStepsWith2Eggs {

    public static void main(String[] args) {

        int a[] = new int[101];

        for (int i = 1; i <= 100; i++) {
            a[i] = (100 / i) + (i - 1);
        }

        System.out.println(" constructed array ");
        for (int i : a
                ) {
            System.out.println(a[i]);
        }

        System.out.println("---------------------------------------------------------------------");

        int min = -1;
        for (int i = 1; i <= 101; i++) {
            if (min == -1) {
                min = a[i];
            }

            System.out.println(" compare min : " + min + "with " + a[i] + " " + i);
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("---------------------------------------------------------------------");

        System.out.println("result : " + min);

    }

}