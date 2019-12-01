package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> add(int[] nums) {
        int n = nums.length;

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int x = 0; x < n - 2; x++) {
            if (x != 0 && nums[x] == nums[x-1])
                continue;

            int y = x + 1;
            int z = n - 1;

            while (y < z) {
                if (nums[x] + nums[y] + nums[z] == 0) {
                    result.add(Arrays.asList(nums[x], nums[y], nums[z]));
                    y++;

                    while (y < z && nums[y] == nums[y-1])
                        y++;
                } if (nums[x] + nums[y] + nums[z] > 0) {
                    z--;
                } else {
                    y++;
                }
            }
        }

        return result;
    }
}
