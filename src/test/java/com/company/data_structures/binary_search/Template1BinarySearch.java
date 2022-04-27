package com.company.data_structures.binary_search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Template1BinarySearch extends NumbericBinarySearch{

    @Test
    public void givenInput_numberic_shouldSuccess() {
        int[] nums = new int[]{-1, 0, 1, 3, 5, 9};
        assertEquals(4, NumbericBinarySearch.search(nums, 5));
    }

    // #3
    @Test
    public void givenInput_sqrt_shouldSuccess() {
        assertEquals(2, NumbericBinarySearch.sqrtUnsigned(4));
        assertEquals(2, NumbericBinarySearch.sqrtUnsigned(8));
        assertEquals((int) Math.sqrt(2147395599), NumbericBinarySearch.sqrtUnsigned(2147395599));
    }

    @Test
    public void  givenInput_guessGame_shouldSuccess(){
        assertEquals(10, guessNumber(10));
        assertEquals(10, guessNumber(20));
        assertEquals(10, guessNumber(15));
    }

    public int guessNumber(int n) {
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
}
