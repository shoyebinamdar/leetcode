package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void plusOne() {
        assertArrayEquals(new int[]{1,2,4}, Addition.plusOne(new int[]{1,2,3}));
        assertArrayEquals(new int[]{4,3,2,2}, Addition.plusOne(new int[]{4,3,2,1}));
    }
}
