package com.edu.chmnu.ki_123.c3.AuditoriumTask6;

public class SearchApp {
    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};

        int target = 7;

        int iterativeResult = search.iterativeBinarySearch(sortedArray, target);
        System.out.println("Iterative search: Element > " + target + " found in the index " + iterativeResult);

        int recursiveResult = search.recursiveBinarySearch(sortedArray, target, 0, sortedArray.length - 1);
        System.out.println("Recursive search: Element > " + target + " found in the index " + recursiveResult);
    }
}