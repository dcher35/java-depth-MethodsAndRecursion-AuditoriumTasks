package com.edu.chmnu.ki_123.c3.AuditoriumTask6;

public class BinarySearch {
    public int iterativeBinarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int recursiveBinarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1; // Елемент не знайдено
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid; // Елемент знайдено
        } else if (array[mid] < target) {
            return recursiveBinarySearch(array, target, mid + 1, right);
        } else {
            return recursiveBinarySearch(array, target, left, mid - 1);
        }
    }
}