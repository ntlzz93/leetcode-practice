package com.company.data_structures.arrays;

import com.company.data_structures.arrays.excercises.EvenNumberOfDigits;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenDigitNumberTest {

    @Test
    public void givenInputExample_findNumberEvenOfDigits_shouldSuccess() {
        int[] nums = new int[]{555, 901, 482, 1771};
        EvenNumberOfDigits evenNumberOfDigits = new EvenNumberOfDigits();
        assertEquals(1, evenNumberOfDigits.findNumbers(nums));
    }
}
