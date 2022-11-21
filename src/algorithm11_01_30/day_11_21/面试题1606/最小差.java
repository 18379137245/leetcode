package algorithm11_01_30.day_11_21.面试题1606;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_21.面试题1606
 * @className: 最小差
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/21 19:24
 * @version: 1.0
 */

public class 最小差 {
    public static void main(String[] args) {
        int[] a = {-2147483648, 1}, b = {2147483647, 0};
        System.out.println((long) Math.abs(-2147483648 - 0));
        System.out.println(smallestDifference(a, b));
    }

    public static int smallestDifference(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;
        long min = Long.MAX_VALUE;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) return 0;
            else if (a[i] > b[j]) {
                min = Math.min(min, (long) a[i] - (long) b[j]);
                j++;
            } else {
                min = Math.min(min, (long) b[j] - (long) a[i]);
                i++;
            }
        }
        return (int) min;
    }
}
