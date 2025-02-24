package com.company.data_structures.binary_search;

public class SelfBinarySearchTest {

    public static void main(String[] args) {
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int index = SelfBinarySearch.binarySearch(arr, 777777);
        if (index == -1) {
            System.out.println("Not found " + index);
        } else {
            System.out.println("Found " + index);
        }
    }
}
