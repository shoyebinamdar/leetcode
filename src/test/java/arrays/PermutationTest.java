package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationTest {

    @Test
    public void nextPermutation() {
        assertArrayEquals(new int[]{1, 3, 2}, Permutation.nextPermutation(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3}, Permutation.nextPermutation(new int[]{3, 2, 1}));
        assertArrayEquals(new int[]{1, 5, 1}, Permutation.nextPermutation(new int[]{1, 1, 5}));
    }
}
