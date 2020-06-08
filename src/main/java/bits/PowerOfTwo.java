package bits;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        int numberOfSetBits = 0;

        while (n > 0) {
            numberOfSetBits += n & 1;
            n >>= 1;
        }

        return numberOfSetBits == 1;
    }
}
