package com.algorithms.study.basic;

/**
 * if it is ordered does not process,
 * at every search removes last element
 */
public class BubbleSort {


    public static void main(String[] args) {

        int a[] = {4, 2, 3, 2, 4, 6, 1, 2, 7, 4, 8, 9};

        System.out.println(" Before Bubble Sort.");

        printArray(a);

        System.out.println(" After Bubble Sort.");

        sortByBubble(a);

        printArray(a);

    }

    private static void sortByBubble(int[] a) {
        int arrayLengthToSearch = a.length - 1;

        for (int i = 0; i < a.length - 1; i++) {
            boolean isOrdered = true;
            for (int j = 0; j < arrayLengthToSearch; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = tmp;
                    isOrdered = false;
                }
                if (isOrdered) {
                    break;
                }

            }
            arrayLengthToSearch--;
        }
    }

    private static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
