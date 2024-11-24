package com.edu.chmnu.ki_123.c3.AuditoriumTask234;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {1321, 13, 124, 324, 0, 24};
        int[] nonSortedArray = {43, 3, 23, 2, 0, 12};
        int[] sortedArray;

        ArraySortedChecker checker = new ArraySortedChecker();
        System.out.println("Is the array sorted? -> " + checker.isSorted(nonSortedArray));

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);
        System.out.println("Array after selection sort: " + Arrays.toString(array));

        CountingSort countingSort = new CountingSort();
        sortedArray = countingSort.sort(array);
        System.out.println("Array after counting sort: " + Arrays.toString(sortedArray));
    }
}