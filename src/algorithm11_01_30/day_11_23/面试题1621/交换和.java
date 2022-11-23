package algorithm11_01_30.day_11_23.面试题1621;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_23.面试题1621
 * @className: 交换和
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/23 20:50
 * @version: 1.0
 */

public class 交换和 {
    public static void main(String[] args) {
        int[] array1 = {4, 1, 2, 1, 1, 2}, array2 = {3, 6, 3, 3};
        System.out.println(Arrays.toString(findSwapValues(array1, array2)));
    }

    public static int[] findSwapValues(int[] array1, int[] array2) {
        // 记录两个数组的和
        int sum1 = 0, sum2 = 0;
        // 记录 array2 中的数都出现过哪些
        Set<Integer> container = new HashSet<>();
        for (int num : array1) {
            sum1 += num;
            container.add(num);
        }
        for (int num : array2) {

            sum2 += num;
        }
        // 求两个数组之差
        int diff = sum2 - sum1;
        // 如果不是偶数差值，那么直接返回空数组
        if (diff % 2 != 0) return new int[]{};
        diff /= 2;
        // 从 array2 中找到能和 array1 中 num 配对的数，如果找到了就直接返回，没找到就返回空数组。
        for (int num : array2) {
            if (container.contains(num - diff)) {
                return new int[]{num, num - diff};
            }
        }

        return new int[]{};
    }
}
