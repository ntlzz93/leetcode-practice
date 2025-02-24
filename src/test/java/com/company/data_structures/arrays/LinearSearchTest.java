package com.company.data_structures.arrays;

public class LinearSearchTest {

    public static void main(String[] args) {
        // linear search = Iterate through a collection on element at a time

        //  runtime complexity: 0(n)
        //  Disadvantages:
        //  Slow for large data sets

        // Advantages:
        // Fast for searches for small to medium data sets
        // Does not need to sorted
        // Useful for data structures that do not have random access (Linked List)

        int[] arr = new int[]{9,1,8,2,7,3,6,4,5};
        int index = linearSearch(arr, 1);
        if (index != -1) {
            System.out.println("Found at index " + index);
        }else {
            System.out.println("Not found");
        }
    }

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
