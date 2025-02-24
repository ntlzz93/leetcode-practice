package com.company.data_structures.binary_search;

public class SelfBinarySearch {
    public static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int count = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            System.out.println("Count: " + count++);
            if (nums[mid] == target) {
                return nums[mid];
            }
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
