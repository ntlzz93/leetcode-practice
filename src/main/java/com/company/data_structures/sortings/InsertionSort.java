package com.company.data_structures.sortings;

public class InsertionSort {
    private int[] array;

    public InsertionSort(int[] array) {
        this.array = array;
    }

    public int[] sortAsc() {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                --j;
            }
            // Place key at after the element just smaller than it.
            array[j + 1] = key;
        }
        return array;
    }
}
