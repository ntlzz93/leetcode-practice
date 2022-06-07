package com.company.data_structures.sortings;

import java.util.Arrays;

public class CountingSortApplicationTest {
    public static void main(String[] args) {
        int[] data = {4, 2, 2, 8, 3, 3, 1};
        int size = data.length;
        CountingSort cs = new CountingSort();
        cs.countSort(data, size);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
