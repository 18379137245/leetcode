package algorithm9_01_30.day_9_21.leetcode_167;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_21.leetcode_167
 * @className: 两数之和2
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/21 19:08
 * @version: 1.0
 */

public class 两数之和2 {
    public static void main(String[] args) {
        int[] numbers = {5,25,75};
        int target = 100;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target && i != j) {
                    arr[0] = i + 1;
                    arr[1] = j + 1;
                    return arr;
                }
            }
        }
        return arr;
    }
}
