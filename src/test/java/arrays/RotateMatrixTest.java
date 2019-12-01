package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateMatrixTest {

    @Test
    public void by90Degrees() {
        int[][] expectedArray = new int[][]{{7,4,1}, {8,5,2}, {9,6,3}};
        int[][] actualArray = RotateMatrix.by90Degrees(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}});

        assertArrayEquals(expectedArray[0], actualArray[0]);
        assertArrayEquals(expectedArray[1], actualArray[1]);
        assertArrayEquals(expectedArray[2], actualArray[2]);
    }
}
