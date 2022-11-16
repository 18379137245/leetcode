package algorithm9_01_30.day_9_28.leetcode_300;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_28.leetcode_300
 * @className: 最长递增子序列
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/28 19:52
 * @version: 1.0
 */

public class 最长递增子序列 {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        lengthOfLIS(nums);
    }

    public static int lengthOfLIS(int[] nums) {
        if(nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        int res = 0;
        //给dp数组初始化值为1
        Arrays.fill(dp, 1);
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < i; j++) {
                //nums[i] 当前数组元素
                //nums[j] 数组内所有元素
                //只有数组内元素小于当前元素才能成为子序列
                if(nums[j] < nums[i]) {
                    //选最大值
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            //选最大值
            res = Math.max(res, dp[i]);
        }
        return res;

    }
}
