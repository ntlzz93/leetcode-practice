package com.company.data_structures.sortings;

public class SelectionSort {
    int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    public int[] sortAsc() {
        for (int i = 0; i < array.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    minIdx = j;
                }
            }

            // swap
            int temp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = temp;
        }
        return getArray();
    }

    public int[] getArray() {
        return this.array;
    }
}
