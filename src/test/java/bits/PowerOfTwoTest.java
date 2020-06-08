package bits;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfTwoTest {
    @Test
    public void isPowerOfTwo() {
        assertTrue(PowerOfTwo.isPowerOfTwo(1));
        assertTrue(PowerOfTwo.isPowerOfTwo(16));
        assertFalse(PowerOfTwo.isPowerOfTwo(218));
    }
}