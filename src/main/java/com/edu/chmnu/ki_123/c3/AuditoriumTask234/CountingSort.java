package com.edu.chmnu.ki_123.c3.AuditoriumTask234;

import java.util.Arrays;

public class CountingSort {
    public int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        int max = Arrays.stream(array).max().orElse(0);
        int min = Arrays.stream(array).min().orElse(0);
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[array.length];

        for (int num : array) {
            count[num - min]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            output[count[array[i] - min] - 1] = array[i];
            count[array[i] - min]--;
        }
        return output;
    }
}