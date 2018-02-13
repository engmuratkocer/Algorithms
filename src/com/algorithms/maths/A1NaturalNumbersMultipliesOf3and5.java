package com.algorithms.maths;

public class A1NaturalNumbersMultipliesOf3and5 {


    public static void main(String[] args) {


        int n = 1000;
        int a[] = new int[n];
        int index = 0;

        for (int i = 1; i < n; i++) {

            if (i % 3 == 0) {
                a[index++] = i;
            } else if (i % 5 == 0) {
                a[index++] = i;
            }

        }

        int sum = 0;
        System.out.println("-------------------------------");
        for (int num : a
                ) {
            if (num != 0) {
                System.out.println(num);
                sum += num;
            }

        }
        System.out.println("-------------------------------");
        System.out.println(" Sum : " + sum);

    }

}
