package algorithm10_06_31.day_10_27.剑指Offer14;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_27.剑指Offer14
 * @className: 剪绳子1
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/27 20:47
 * @version: 1.0
 */

public class 剪绳子2 {
    public static void main(String[] args) {
        System.out.println(cuttingRope(127));
    }

    public static int cuttingRope(int n) {
        if (n < 4) {
            return n - 1;
        }
        long result = 1;
        while (n > 4) {
            result *= 3;
            result %= 1000000007;
            n -= 3;
        }
        return (int)(result * n % 1000000007);
    }
}
