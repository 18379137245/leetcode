package algorithm11_01_30.day_11_08.剑指Offer62;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_08.剑指Offer62
 * @className: 圆圈中最后剩下的数字
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/8 21:57
 * @version: 1.0
 */

public class 圆圈中最后剩下的数字 {

    public static void main(String[] args) {
        System.out.println(lastRemaining(10, 17));
    }

    public static int lastRemaining(int n, int m) {

        int res = 0;
        for (int i = 2; i != n + 1; i++) {
            res = (m + res) % i;
        }
        return res;
    }
}
