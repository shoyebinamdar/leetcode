package strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();

        Set<Character> characterSet = new HashSet<>();

        int ans = 0, i = 0, j = 0;

        while (i < n && j < n) {
            if (!characterSet.contains(s.charAt(j))) {
                characterSet.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                characterSet.remove(s.charAt(i++));
            }
        }

        return ans;
    }
}
