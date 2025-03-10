package com.company.data_structures.sortings;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class InsertionSortTest {

    @Test
    public void testInsertionSortAsc() {
        int[] data = {9, 5, 1, 4, 3};
        InsertionSort insertionSort = new InsertionSort(data);
        assertEquals(true, data == insertionSort.sortAsc());
    }

    public static void main(String[] args) {
        int[] data = {9, 5, 1, 4, 3, 6, 2, 8, 7};
        System.out.println(Arrays.toString(RemainInsertionSort.remainInsertionSort(data)));
    }
}
