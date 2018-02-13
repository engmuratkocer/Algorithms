package com.algorithms.longestincreasingnumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LongestIncreasingSequence {

    public static void main(String[] args) {


        int a[] = new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80};

        calculateLIS(a);

    }

    private static int calculateLIS(int[] a) {

        Stack<Integer> lcsStack = new Stack<>();
        List<Stack> lcsStackList = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            lcsStack = new Stack<>();

            for (int j = i; j < a.length; j++) {
                if (lcsStack.isEmpty() || a[j] > lcsStack.peek())
                    lcsStack.push(a[j]);
            }
            lcsStackList.add(lcsStack);
        }

        int max = -1;
        for (Stack<Integer> stack : lcsStackList
                ) {
            System.out.println("-----------------------------START-----------------------------");
            System.out.println(stack);
            System.out.println("-----------------------------END-----------------------------");

            if (max < stack.size()) {
                max = stack.size();
            }
        }

        System.out.println("Max : " + max);


        return 1;

    }
}
