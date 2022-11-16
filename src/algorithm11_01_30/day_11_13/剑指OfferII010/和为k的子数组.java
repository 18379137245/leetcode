package algorithm11_01_30.day_11_13.剑指OfferII010;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_13.剑指OfferII010
 * @className: 和为k的子数组
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/13 18:36
 * @version: 1.0
 */

public class 和为k的子数组 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subarraySum(nums, 4));
    }

    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
