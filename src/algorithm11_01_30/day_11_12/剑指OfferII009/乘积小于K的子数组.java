package algorithm11_01_30.day_11_12.剑指OfferII009;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_12.剑指OfferII009
 * @className: 乘积小于K的子数组
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/12 20:23
 * @version: 1.0
 */

public class 乘积小于K的子数组 {

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        System.out.println(numSubarrayProductLessThanK(nums, 100));
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length, ret = 0;
        int prod = 1, i = 0;
        for (int j = 0; j < n; j++) {
            prod *= nums[j];
            while (i <= j && prod >= k) {
                prod /= nums[i];
                i++;
            }
            ret += j - i + 1;
        }
        return ret;
    }
}
