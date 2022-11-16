package algorithm11_01_30.day_11_12.剑指OfferII008;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_12.剑指OfferII008
 * @className: 和大于等于target的最短子数组
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/12 20:09
 * @version: 1.0
 */

public class 和大于等于target的最短子数组 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(7, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = 0;
        while (end < n) {
            sum += nums[end];
            while (sum >= target) {
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
