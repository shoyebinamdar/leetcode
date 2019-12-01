package arrays;

public class Addition {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                int val = digits[i] + 1 + carry;
                digits[i] = val % 10;
                carry = val / 10;
            } else if (carry > 0) {
                int val = digits[i] + carry;
                digits[i] = val % 10;
                carry = val / 10;
            }
        }

        if (carry > 0) {
            int[] temp = new int[n + 1];
            temp[0] = carry;
            System.arraycopy(digits, 0, temp, 1, n);

            return temp;
        }

        return digits;
    }
}
