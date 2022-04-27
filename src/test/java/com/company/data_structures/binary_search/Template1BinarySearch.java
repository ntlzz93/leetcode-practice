package com.company.data_structures.binary_search;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Template1BinarySearch{

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
        assertEquals(10, NumbericBinarySearch.guessNumber(10));
        assertEquals(10, NumbericBinarySearch.guessNumber(20));
        assertEquals(10, NumbericBinarySearch.guessNumber(15));
    }

    @Test
    public void givenInput_searchRotated_shouldSuccess(){
        int[] nums = new int[]{4,5,6,7,0,1,2};
        assertEquals(4, NumbericBinarySearch.searchRotated(nums, 0));
    }
}
