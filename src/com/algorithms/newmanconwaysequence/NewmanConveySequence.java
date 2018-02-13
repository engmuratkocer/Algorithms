package com.algorithms.newmanconwaysequence;

public class NewmanConveySequence {

    public static void main(String[] args) {

        int newmanNum = 30;
        long startTime = System.currentTimeMillis();
        int result = calculateNewmanSeqRecursively(newmanNum);

        long endTime = System.currentTimeMillis();
        System.out.println("newmanNum" + newmanNum + " : " +result + " calculated in : " + (endTime - startTime) + " ın milliseconds.");


        startTime = System.currentTimeMillis();
        result = calculateNewmanSeqDynamically(newmanNum);

        endTime = System.currentTimeMillis();
        System.out.println("newmanNum" + newmanNum + " : " +result + " calculated in : " + (endTime - startTime) + " ın milliseconds.");

    }

    private static int calculateNewmanSeqDynamically(int newmanNum) {

        int nman[] = new int[newmanNum+1];

        nman[1] = 1;
        nman[2] = 1;

        for (int i = 3; i <= newmanNum; i++) {
            nman[i]= nman[nman[i-1]]+nman[i-nman[i-1]];
        }

        return nman[newmanNum];
    }

    private static int calculateNewmanSeqRecursively(int newmanNum) {

        if (newmanNum == 1)
            return 1;
        if (newmanNum == 2)
            return 1;

        newmanNum = calculateNewmanSeqRecursively(calculateNewmanSeqRecursively(newmanNum-1))+ calculateNewmanSeqRecursively(newmanNum- calculateNewmanSeqRecursively(newmanNum-1));

        return newmanNum;

    }

}