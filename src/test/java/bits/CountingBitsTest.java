package bits;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountingBitsTest {
    @Test
    public void countBits() {
        int[] expectedArray = new int[]{0,1,1,2,1,2};

        assertArrayEquals(expectedArray, CountingBits.countBits(5));
    }
}