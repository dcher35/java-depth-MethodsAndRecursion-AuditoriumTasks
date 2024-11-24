package com.edu.chmnu.ki_123.c3.AuditoriumTask6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    //Тест для перевірки ітеративного методу, якщо елемент є в масиві
    @Test
    void testIterativeBinarySearch_ElementExists() {
        BinarySearch search = new BinarySearch();

        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int target = 7;
        int result = search.iterativeBinarySearch(sortedArray, target);

        assertEquals(3, result, "Element 7 must be found at index 3");
    }

    //Тест для перевірки ітеративного методу, якщо елементу немає в масиві
    @Test
    void testIterativeBinarySearch_ElementNotExists() {
        BinarySearch search = new BinarySearch();

        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int target = 8;
        int result = search.iterativeBinarySearch(sortedArray, target);

        assertEquals(-1, result, "Element 8 should not be found");
    }

    //Тест для перевірки хвосторекурсивного методу, якщо елемент є в масиві
    @Test
    void testRecursiveBinarySearch_ElementExists() {
        BinarySearch search = new BinarySearch();

        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int target = 15;
        int result = search.recursiveBinarySearch(sortedArray, target, 0, sortedArray.length - 1);

        assertEquals(7, result, "Element 15 must be found at index 7");
    }

    //Тест для перевірки хвосторекурсивного методу, якщо елементу немає в масиві
    @Test
    void testRecursiveBinarySearch_ElementNotExists() {
        BinarySearch search = new BinarySearch();

        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int target = 20;
        int result = search.recursiveBinarySearch(sortedArray, target, 0, sortedArray.length - 1);

        assertEquals(-1, result, "Element 20 should not be found");
    }
}