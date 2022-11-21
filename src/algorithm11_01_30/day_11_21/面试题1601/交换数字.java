package algorithm11_01_30.day_11_21.面试题1601;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_21.面试题1601
 * @className: 交换数字
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/21 19:02
 * @version: 1.0
 */

public class 交换数字 {
    public static void main(String[] args) {
        int[] numbers = {1,2};
        System.out.println(Arrays.toString(swapNumbers(numbers)));
    }

    public static int[] swapNumbers(int[] numbers) {
        numbers[0] = numbers[0] + numbers[1];
        numbers[1] = numbers[0] - numbers[1];
        numbers[0] = numbers[0] - numbers[1];
        return numbers;
    }
}
