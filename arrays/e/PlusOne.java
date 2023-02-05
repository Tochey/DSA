package arrays.e;

public class PlusOne {
    // https://leetcode.com/problems/plus-one/
    // TODO : Optimize if possible
    public static int[] plusOne(int[] digits) {
        int index = digits.length - 1;

        if (digits[index] != 9) {
            digits[index]++;
            return digits;
        }

        try {
            while (digits[index] == 9) {
                digits[index] = 0;
                if (digits[index - 1] == 9) {
                    index = index - 1;
                    continue;
                }
                digits[index - 1] = digits[index - 1] + 1;
            }

        } catch (Exception e) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] n = plusOne(new int[] { 9, 9, 9 });
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}
