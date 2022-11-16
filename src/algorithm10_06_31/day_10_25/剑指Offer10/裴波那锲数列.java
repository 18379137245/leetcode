package algorithm10_06_31.day_10_25.剑指Offer10;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_25.剑指Offer10
 * @className: 裴波那锲数列
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/25 19:22
 * @version: 1.0
 */

public class 裴波那锲数列 {
    public static void main(String[] args) {
        System.out.println(fib(7));
    }

    public static int fib(int n) {
        if (n == 0) return 0;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
