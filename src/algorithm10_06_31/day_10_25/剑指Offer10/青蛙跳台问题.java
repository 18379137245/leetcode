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

public class 青蛙跳台问题 {
    public static void main(String[] args) {
        System.out.println(fib(7));
    }

    public static int fib(int n) {
        if (n == 0 || n == 1 ) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            dp[i] %= 1000000007;
        }
        return dp[n];
    }
}
