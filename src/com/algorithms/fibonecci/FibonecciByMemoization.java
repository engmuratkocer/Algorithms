package com.algorithms.fibonecci;

public class FibonecciByMemoization {

    public static void main(String[] args) {


        long startTime = System.currentTimeMillis();
        int result = calculateFibFor(42);

        long endTime = System.currentTimeMillis();
        System.out.println(result + " calculated in : "+(endTime-startTime)+ " ın milliseconds." );


    }

    private static int calculateFibFor(int i) {

        int fib[] = new int[i+1];

        fib[1] = 1;
        fib[2] = 1;

        for (int t = 3; t <= i; t++) {
            fib[t] = fib[t - 2] + fib[t - 1];
        }

        return fib[i];

    }
}