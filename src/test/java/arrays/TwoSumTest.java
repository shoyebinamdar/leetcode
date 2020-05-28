package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {
    @Test
    public void twoSum() {
        int[] expectedArray = new int[]{0, 1};

        assertArrayEquals(expectedArray, TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
    }
}