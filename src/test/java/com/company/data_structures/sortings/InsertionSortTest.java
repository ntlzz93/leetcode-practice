package com.company.data_structures.sortings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertionSortTest {

    @Test
    public void testInsertionSortAsc() {
        int[] data = {9, 5, 1, 4, 3};
        InsertionSort insertionSort = new InsertionSort(data);
        assertEquals(true, data == insertionSort.sortAsc());
    }
}
