package strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringTest {

    @Test
    public void lengthOfLongestSubstring() {
        assertEquals(3, LongestSubstring.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, LongestSubstring.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, LongestSubstring.lengthOfLongestSubstring("pwwkew"));
    }
}
