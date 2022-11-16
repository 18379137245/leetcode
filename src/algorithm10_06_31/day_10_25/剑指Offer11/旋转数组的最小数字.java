package algorithm10_06_31.day_10_25.剑指Offer11;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_25.剑指Offer11
 * @className: 旋转数组的最小数字
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/25 19:42
 * @version: 1.0
 */

public class 旋转数组的最小数字 {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 1, 2};
        System.out.println(minArray(numbers));
    }

    public static int minArray(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                return numbers[i];
            }
        }
        return numbers[0];
    }
}
