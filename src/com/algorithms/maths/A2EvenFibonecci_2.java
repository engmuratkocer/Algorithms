package com.algorithms.maths;

public class A2EvenFibonecci_2 {

    public static void main(String[] args) {

        int n = 4;

        int twoPre = 1;
        int onePre = 2;
        int c = 3;
        int next = 0;

        int sum = 2;

        while(next < 13){

            if (next %2 == 0)
                   sum+= next;

            next = onePre + twoPre;
            System.out.println( next + " = " + onePre+ " +  "+ twoPre);

            twoPre = onePre;
            onePre = next;

        }
        System.out.println(" result ");
        System.out.println(sum);



    }

}