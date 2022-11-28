package algorithm11_01_30.day_11_27.leetcode;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_27.leetcode
 * @className: 加一
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/27 18:46
 * @version: 1.0
 */

public class 加一 {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        for (int i = n; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] digits1 = new int[n + 2];
        digits1[0] = 1;
        return digits1;
    }
}
