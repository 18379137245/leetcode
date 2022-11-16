package algorithm10_06_31.day_10_23.leetcode_96.不同二叉树;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_23.leetcode_96.不同二叉树
 * @className: Main
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/23 19:59
 * @version: 1.0
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(numTrees(3));
    }
    /*
       dp[i] = i个不同的数组成的二叉搜索数的个数
       假设 i = 5
       当根节点等于 1 时 ，其余数字都比1大，只能在右边 dp[i] += dp[4]
       当根节点等于 2 时，左边有一个1比2小，右边有三个比2大的数字 dp[i] += dp[1] * dp[3]
       当根节点等于 3 时，左边有两个数比3小，右边有两个数比3大的数字 dp[i] += dp[2] * dp[2]
       ...
       知道根节点等于5，左边有4个数字比5小，只能放在5的左边,dp[i] += dp[4]
        */
    public static int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int leftNum = dp[j - 1];
                int rightNum = dp[i - j];
                dp[i] += leftNum * rightNum;
            }
        }
        return dp[n];
    }
}
