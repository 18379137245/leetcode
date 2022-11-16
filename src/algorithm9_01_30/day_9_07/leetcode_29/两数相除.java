package algorithm9_01_30.day_9_07.leetcode_29;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_07.leetcode_29
 * @className: 两数相除
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/7 20:03
 * @version: 1.0
 */

public class 两数相除 {
    public static void main(String[] args) {
        System.out.println(divide(10, 3));
    }

    public static int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1)return Integer.MAX_VALUE;
        return dividend/divisor;
    }
}
