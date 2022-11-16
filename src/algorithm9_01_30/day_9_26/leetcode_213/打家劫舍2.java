package algorithm9_01_30.day_9_26.leetcode_213;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_26.leetcode_213
 * @className: 打家劫舍2
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/26 19:52
 * @version: 1.0
 */

public class 打家劫舍2 {

    public static void main(String[] args) {
        int[] nums = {2,3,2};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return nums[0];
        }
        //环形的看成直线的话，可以理解成去掉最有一个元素，或者去掉第一个元素，然后找到这两种场景的最大值。
        int[] dp1 = new int[length - 1];//场景一：去掉最后一个元素
        int[] dp2 = new int[length - 1];//场景二：去掉第一个元素
        for (int i = 0; i < length - 1; i++) {
            dp1[i] = nums[i];
            dp2[i] = nums[i + 1];
        }
        return Math.max(InRob(dp1), InRob(dp2));
    }
    public static int InRob(int[] nums) {
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
