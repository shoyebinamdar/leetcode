package strings;

public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        StringBuilder str = new StringBuilder();
        int carry = 0;
        int pass = 1;

        if (num1.equals("0") || num2.equals("0"))
            return "0";

        for (int i = num1.length() - 1; i >= 0; i--) {
            StringBuilder tempStr = new StringBuilder();
            int k = str.length() - pass;

            for (int j = num2.length() - 1; j >= 0; j--) {
                if (k >= 0) {
                    int val = Character.getNumericValue(str.charAt(k)) + Character.getNumericValue(num1.charAt(i)) * Character.getNumericValue(num2.charAt(j)) + carry;
                    if (j != 0) {
                        carry = val / 10;
                        str.setCharAt(k, (char) ((val % 10) + '0'));
                    } else {
                        carry = 0;
                        str.deleteCharAt(0);
                        str.insert(0, val);
                    }
                    k--;
                } else {
                    int val = Character.getNumericValue(num1.charAt(i)) * Character.getNumericValue(num2.charAt(j)) + carry;
                    if (j != 0) {
                        carry = val / 10;
                        str.insert(0, val % 10);
                    } else {
                        carry = 0;
                        str.insert(0, val);
                    }
                }
            }
            pass++;
        }

        return str.toString();
    }
}
