package algorithm12_01_31.day_12_11.leetcode;

public class 打家劫舍 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
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
        return dp[dp.length - 1];
    }
}
