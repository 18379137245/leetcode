package algorithm11_01_30.day_11_02.剑指Offer42;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_02.剑指Offer42
 * @className: 连续子数组的最大和
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/2 20:29
 * @version: 1.0
 */

public class 连续子数组的最大和 {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            sum = Math.max(nums[i] + sum, nums[i]);
            max = Math.max(sum, max);
        }
        return max;
    }
}
