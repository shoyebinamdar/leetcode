package bits;

public class CountingBits {
    private static int countSetBits(int n) {
        int count = 0;

        while(n > 0) {
            count += n & 1;
            n >>= 1;
        }

        return count;
    }
    public static int[] countBits(int num) {
        int[] result = new int[num+1];

        for (int i = 0; i <= num; i++) {
            result[i] = countSetBits(i);
        }

        return result;
    }
}