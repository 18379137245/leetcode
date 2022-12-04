package algorithm12_01_31.day_12_03.leetcode_167;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm12_01_31.day_12_01.leetcode_167
 * @className: 两数之和II输入有序数组
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/12/3 21:02
 * @version: 1.0
 */

public class 两数之和II输入有序数组 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }
        return new int[]{-1, -1};
    }
}
