package com.algorithms.delenoynumber;

public class DelenoyNumbersMemeoization {

    public static void main(String[] args) {


        long startTime = System.currentTimeMillis();
        int result = calculateDelanoyNumber(3,4);

        long endTime = System.currentTimeMillis();
        System.out.println(result + " calculated in : "+(endTime-startTime)+ " ın milliseconds." );


    }

    private static int calculateDelanoyNumber(int m, int n) {

        int delanoyArr[][] = new int[m+1][n+1];


        for (int i = 0; i <= m; i++)
            delanoyArr[i][0] = 1;
        for (int i = 0; i <= n; i++)
            delanoyArr[0][i] = 1;

        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= n; j++) {
                   delanoyArr[i][j] = delanoyArr[i-1][j] + delanoyArr[i-1][j-1] + delanoyArr[i][j-1];
                System.out.println(i +" " +j + " : "+ delanoyArr[i][j]);
            }
        }

        return delanoyArr[m][n];

    }
}