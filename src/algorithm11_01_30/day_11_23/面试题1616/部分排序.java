package algorithm11_01_30.day_11_23.面试题1616;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_23.面试题1616
 * @className: 部分排序
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/23 20:41
 * @version: 1.0
 */

public class 部分排序 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
        System.out.println(Arrays.toString(subSort(array)));
    }

    public static int[] subSort(int[] array) {
        if (array == null || array.length <= 1) {
            return new int[]{-1, -1};
        }

        int n = array.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int left = -1;
        int right = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] < max) {
                right = i;
            } else {
                max = array[i];
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (array[i] > min) {
                left = i;
            } else {
                min = array[i];
            }
        }
        return new int[]{left, right};
    }
}
