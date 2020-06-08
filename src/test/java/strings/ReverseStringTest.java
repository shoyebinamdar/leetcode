package strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    @Test
    public void reverseString() {
        char[] inputArray = new char[]{'h','e','l','l','o'};
        ReverseString.reverseString(inputArray);
        assertArrayEquals(new char[]{'o','l','l','e','h'}, inputArray);
    }
}