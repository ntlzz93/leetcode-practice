package com.company.data_structures.arrays;

import com.company.data_structures.sortings.BubbleSort;

public class SortingArrayIntTest {

    public static void main(String[] args) {
        int[] arr = new int[]{5,2,4,3,1};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
