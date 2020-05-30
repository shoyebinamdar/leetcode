package arrays;

import bits.CountingBits;
import org.junit.Test;

import static org.junit.Assert.*;

public class KClosestPointsToRiginTest {
    @Test
    public void kClosest() {
        int[] expectedArray = new int[]{0,1,1,2,1,2};

        assertArrayEquals(new int[][]{{-2,2}}, KClosestPointsToRigin.kClosest(new int[][]{{1,3},{-2,2}}, 1));
        assertArrayEquals(new int[][]{{3,3}, {-2,4}}, KClosestPointsToRigin.kClosest(new int[][]{{3,3},{5,-1},{-2,4}}, 2));
    }
}