package algorithm11_01_30.day_11_28.leetcode_813;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_28.leetcode_813
 * @className: 最大平均值和的分组
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/28 19:42
 * @version: 1.0
 */

public class 最大平均值和的分组 {
    public static void main(String[] args) {
        int[] nums = {9, 1, 2, 3, 9};
        int k = 3;
        System.out.println(largestSumOfAverages(nums, k));
    }

    public static double largestSumOfAverages(int[] nums, int k) {

        // 表示nums数组前i+1个元素之和
        int n = nums.length;
        double[] sum = new double[n + 1];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        // dp[i][k]：将 nums 中的前 i 个数分成 k 个子数组的最大平均值总和
        double[][] dp = new double[n + 1][k + 1];
        // 初始化, 划分为一组情况
        for (int i = 1; i <= n; i++) {
            dp[i][1] = sum[i] / i;
        }
        for (int i = 1; i <= n; i++) {
            for (int ki = 2; ki <= k; ki++) {
                for (int j = 1; j < i; j++) {
                    // 求[j, i - 1]的平均值
                    double avg = (sum[i] - sum[j]) / (i - j);
                    dp[i][ki] = Math.max(dp[i][ki], dp[j][ki - 1] + avg);
                }
            }
        }
        return dp[n][k];
    }
}
