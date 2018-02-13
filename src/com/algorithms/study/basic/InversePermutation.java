package com.algorithms.study.basic;

public class InversePermutation {

    public static void main(String[] args) {

        int a[] = new int[]{2,4,1,3,5};

        int b[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[a[i]-1] = i+1;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i] + " , ");
        }

    }
}
