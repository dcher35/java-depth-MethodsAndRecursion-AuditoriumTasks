package com.edu.chmnu.ki_123.c3.AuditoriumTask234;

public class ArraySortedChecker {
    public boolean isSorted(int[] array) {
        if (array == null || array.length <= 2) {
            return true;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }
}