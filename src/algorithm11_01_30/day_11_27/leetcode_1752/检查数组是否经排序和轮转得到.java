package algorithm11_01_30.day_11_27.leetcode_1752;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_27.leetcode_1752
 * @className: 检查数组是否经排序和轮转得到
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/27 20:21
 * @version: 1.0
 */

public class 检查数组是否经排序和轮转得到 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2,3};
        System.out.println(check(nums));
    }

    public static boolean check(int[] nums) {
        int t = 0, n = nums.length;
        for (int i = 1; i < n; i++) {
            if (t > 1) return false; // 如果出现超过1次的“非递增”情况，则直接返回false
            if (nums[i - 1] > nums[i]) t++; // 如果出现“非递增”情况，则t加1
        }
        return t == 0 || (t == 1 && nums[0] >= nums[n - 1]);

    }
}
