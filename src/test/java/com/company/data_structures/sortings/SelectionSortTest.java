package com.company.data_structures.sortings;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class SelectionSortTest {

    @Test
    public void testSortIntAsc() {
        int[] array = {20, 12, 10, 15, 2};
        SelectionSort selectionSort = new SelectionSort(array);
        assertEquals(true, array == selectionSort.sortAsc());
    }

    public static void main(String[] args) {
        int[] array = {20, 12, 10, 15, 2};
        System.out.println(Arrays.toString(RemainSelectionSort.remainSelectionSort(array)));
    }
}
