package algorithm8_01_31.day_8_16.leetcode_509;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_16.leetcode_509
 * @className: 斐波那契数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/16 20:02
 * @version: 1.0
 */

public class 斐波那契数 {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }

    public static int fib(int n) {
        return n <= 1 ? n : fib(n - 1) + fib(n - 2);
    }
}
