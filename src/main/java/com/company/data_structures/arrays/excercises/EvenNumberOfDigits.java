package com.company.data_structures.arrays.excercises;

public class EvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int evenDigitNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            String numStr = String.valueOf(nums[i]);
            if (numStr.length() > 0 && numStr.length() % 2 == 0) {
                evenDigitNumber++;
            }
        }
        return evenDigitNumber;
    }
}
