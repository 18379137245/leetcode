package algorithm9_01_30.day_9_20.leetcode_152;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_20.leetcode_152
 * @className: 乘积最大子数组
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/20 19:47
 * @version: 1.0
 */

public class 乘积最大子数组 {
    public static void main(String[] args) {
        int[] nums = {-2, 3, -4};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], ans = nums[0];
        int length = nums.length;
        for (int i = 1; i < length; ++i) {
            //在(最大值乘以当前数) 和 (当前数和(最小值乘以当期数)) 找出最大值
            int maxF = Math.max(max * nums[i], Math.max(nums[i], min * nums[i]));
            //在(最小值乘以当前数) 和 (当前数和(最大值乘以当期数)) 找出最小值
            int minF = Math.min(min * nums[i], Math.min(nums[i], max * nums[i]));
            //找到最大值
            ans = Math.max(maxF, ans);
            //最大 max  最小 min
            max = maxF;
            min = minF;
        }
        //返回最大值
        return ans;
    }
}
