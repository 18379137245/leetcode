package algorithm10_06_31.day_10_30.剑指Offer16;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_30.剑指Offer16
 * @className: 数值的整数次方
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/30 19:12
 * @version: 1.0
 */

public class 数值的整数次方 {

    public static void main(String[] args) {
        System.out.println(myPow(2.0000, 10));
    }

    public static double myPow(double x, int n) {
        if (x == 0) return 0;
        long b = n;
        double res = 1.0;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        while (b > 0) {
            if ((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }
}
