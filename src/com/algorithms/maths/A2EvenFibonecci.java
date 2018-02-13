package com.algorithms.maths;

public class A2EvenFibonecci {

    public static void main(String[] args) {

        int n = 4;
        int a[] = new int[1000];

        a[1] = 1;
        a[2] = 2;
        a[3] = 3;

        int sum = 2;
        int i = 3;

        while(a[i] < 4000000){

            if (a[i] % 2 == 0){
                sum+=a[i];
            }

            a[i+1] = a[i] + a[i-1];
            System.out.println("a["+(i+1)+"]" + a[i+1]);


            i++;
        }
        System.out.println(" result ");
        System.out.println(sum);



    }

}