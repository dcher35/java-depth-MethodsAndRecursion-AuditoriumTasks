package com.edu.chmnu.ki_123.c3.AuditoriumTask234;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {
    // Тест перевірки відсортованості
    @Test
    public void testIsSorted() {
        ArraySortedChecker checker = new ArraySortedChecker();
        assertTrue(checker.isSorted(new int[]{1, 2, 3, 4, 5}));
        assertFalse(checker.isSorted(new int[]{5, 3, 1, 4, 2}));
        assertTrue(checker.isSorted(new int[]{1}));
        assertTrue(checker.isSorted(new int[]{}));
    }

    // Тест сортування методом вибору
    @Test
    public void testSelectionSort() {
        SelectionSort sorter = new SelectionSort();
        int[] array = {5, 3, 8, 6, 2};
        sorter.sort(array);
        assertArrayEquals(new int[]{2, 3, 5, 6, 8}, array);
    }

    // Тест сортування методом підрахунку
    @Test
    public void testCountingSort() {
        CountingSort sorter = new CountingSort();
        int[] array = {5, 3, 8, 6, 2};
        int[] sortedArray = sorter.sort(array);
        assertArrayEquals(new int[]{2, 3, 5, 6, 8}, sortedArray);
    }

    // Тест з перевіркою для від'ємних чисел у CountingSort
    @Test
    public void testCountingSortWithNegatives() {
        CountingSort sorter = new CountingSort();
        int[] array = {-5, -3, -8, -6, -2};
        int[] sortedArray = sorter.sort(array);
        assertArrayEquals(new int[]{-8, -6, -5, -3, -2}, sortedArray);
    }
}