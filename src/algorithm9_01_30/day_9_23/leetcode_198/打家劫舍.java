package algorithm9_01_30.day_9_23.leetcode_198;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_23.leetcode_198
 * @className: 打家劫舍
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/23 20:03
 * @version: 1.0
 */

public class 打家劫舍 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        int N = nums.length;
        int[] dp = new int[N + 1]; //6
        dp[0] = 0;
        dp[1] = nums[0];
        for (int k = 2; k <= N; k++) {
            dp[k] = Math.max(dp[k - 1], nums[k - 1] + dp[k - 2]);
        }
        //System.out.println(Arrays.toString(dp));
        //0 2 7 11 11 12
        return dp[N];
    }
}
