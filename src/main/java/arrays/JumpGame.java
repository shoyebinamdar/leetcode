package arrays;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        int n = nums.length;

        boolean[] good = new boolean[n];

        for (int i = 0; i < n; i++)
            good[i] = false;

        good[n - 1] = true;

        for (int i = n - 2; i >= 0; i--) {
            int maxAllowedJump = Math.min(i + nums[i], n - 1);

            for (int j = i + 1; j <= maxAllowedJump; j++) {
                if (good[j]) {
                    good[i] = true;
                    break;
                }

            }
        }

        return good[0];
    }
}
