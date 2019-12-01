package strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplyStringsTest {

    @Test
    public void multiply() {
        assertEquals("6", MultiplyStrings.multiply("2", "3"));
        assertEquals("56088", MultiplyStrings.multiply("123", "456"));
        assertEquals("0", MultiplyStrings.multiply("123", "0"));
    }
}
