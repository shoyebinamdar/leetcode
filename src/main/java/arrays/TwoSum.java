package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueVsIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (valueVsIndexMap.containsKey(complement))
                return new int[] {valueVsIndexMap.get(complement), i};

            valueVsIndexMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("Solution doesn't exist");
    }
}
