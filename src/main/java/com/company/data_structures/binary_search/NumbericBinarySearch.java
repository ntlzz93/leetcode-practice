package com.company.data_structures.binary_search;

import java.util.Arrays;

public class NumbericBinarySearch {

    public static int search(int[] nums, int target) {
        int left = 0, pivot = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) return pivot;
            if (nums[pivot] > target) {
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }
        return -1;
    }

    public static int sqrtUnsigned(int x) {
        if (x < 2) return x;
        int left = 2, right = x / 2;
        long square = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            square = (long) mid * mid;
            if (square == x) return mid;
            if (square > x) {
                right = mid - 1;
            } else left = mid + 1;
        }
        return right;
    }
}
