package com.algorithms.fibonecci;

public class FibonecciByRecursive {

    public static void main(String[] args) {


        long startTime = System.currentTimeMillis();
        int result = calculateFibFor(42);

        long endTime = System.currentTimeMillis();
        System.out.println(result + " calculated in : "+(endTime-startTime)+ " ın milliseconds." );


    }

    private static int calculateFibFor(int i) {

        if (i == 1)
            return 1;
        if (i == 2)
            return 1;

        i = calculateFibFor(i-2)+calculateFibFor(i-1);

        return i;

    }
}
