package algorithm8_01_31.day_8_25.leetcode_628;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_25.leetcode_628
 * @className: 三个数的最大乘积
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/25 18:55
 * @version: 1.0
 */

public class 三个数的最大乘积 {
    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        System.out.println(nums[0] * nums[1] * nums[n - 1]);
        System.out.println(nums[n - 1] * nums[n - 2] * nums[n - 3]);
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 1] * nums[n - 2] * nums[n - 3]);
    }
}
