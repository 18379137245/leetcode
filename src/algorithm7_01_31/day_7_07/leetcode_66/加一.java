package algorithm7_01_31.day_7_07.leetcode_66;

import java.util.Arrays;

public class 加一 {
    public static void main(String[] args) {
        int[] digits = {9,9,9,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] digits1 = new int[n + 1];
        digits1[0] = 1;
        return digits1;
    }
}
