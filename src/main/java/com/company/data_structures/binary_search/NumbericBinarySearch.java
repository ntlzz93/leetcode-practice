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

    private static int guess(int num) {
        int pick =  10;
        if (num == pick) return 0;
        if (num > pick) return -1;
        return 1;
    }

    public static int guessNumber(int n) {
        int left = 1; int pivot = 0;
        int right = n;
        while(left <= right) {
            pivot = left + (right -left) /2;
            int res = guess(pivot);
            if (res == 0) return pivot;
            if(res == 1) {
                left  = pivot  +1;
            }else {
                right  = pivot - 1;
            }
        }
        return -1;
    }

    public static int searchRotated(int[] nums, int target) {
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int i = findStartIndex(nums, target);
        int n = nums.length;

        if (nums[i] == target) {
            return i;
        }

        if (i == 0) {
            return search(0, n - 1, nums, target);
        }

        if (target < nums[0]){
            // search in the right side
            return search(i, n - 1, nums, target);
        }
        // search in the left side
        return search(0, i, nums, target);
    }
    private static int findStartIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        if (nums[left] < nums[right]) {
            return 0;
        }

        while (left <= right) {
            int pivot = (left + right) / 2;
            if (nums[pivot] > nums[pivot + 1]){
                return pivot + 1;
            } else {
                if (nums[pivot] < nums[left]){
                    right = pivot - 1;
                } else {
                    left = pivot + 1;
                }
            }
        }
        return 0;
    }

    protected static int search(int left, int right, int[] nums, int target) {
        while (left <= right) {
            int pivot = (left + right) / 2;
            if (nums[pivot] == target) {
                return pivot;
            } else {
                if (target < nums[pivot]) {
                    right = pivot - 1;
                } else{
                    left = pivot + 1;
                }
            }
        }
        return -1;
    }
}
