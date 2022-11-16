package algorithm9_01_30.day_9_28.leetcode_279;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_28.leetcode_279
 * @className: 完全平方数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/28 16:14
 * @version: 1.0
 */

public class 完全平方数 {
    public static void main(String[] args) {
        System.out.println(numSquares(13));
    }

    public static int numSquares(int n) {
        int[] f = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                minn = Math.min(minn, f[i - j * j]);
            }
            f[i] = minn + 1;
        }
        return f[n];
    }
}
