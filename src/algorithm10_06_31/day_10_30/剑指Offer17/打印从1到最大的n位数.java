package algorithm10_06_31.day_10_30.剑指Offer17;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_30.剑指Offer17
 * @className: 打印从1到最大的n位数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/30 19:26
 * @version: 1.0
 */

public class 打印从1到最大的n位数 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNumbers(4)));
    }

    public static int[] printNumbers(int n) {
        int end = (int) Math.pow(10, n) - 1;
        int[] res = new int[end];
        for (int i = 0; i < end; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
