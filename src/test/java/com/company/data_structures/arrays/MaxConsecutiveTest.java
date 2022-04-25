package test.java.com.company.data_structures.arrays;

import main.java.com.company.data_structures.arrays.excercises.MaxConsecutive;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxConsecutiveTest {

    @Test
    public void givenInputExample_returnMaxConsecutive_thenReturnSuccess() {
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        MaxConsecutive maxConsecutive = new MaxConsecutive();
        int result = maxConsecutive.findMaxConsecutiveOnes(nums);
        assertEquals(3, result);
    }

    @Test
    public void givenInputTestCase4_returnMaxConsecutive_thenReturnSuccess() {
        int[] nums = new int[]{0};
        MaxConsecutive maxConsecutive = new MaxConsecutive();
        int result = maxConsecutive.findMaxConsecutiveOnes(nums);
        assertEquals(0, result);
    }
}
