package algorithm9_01_30.day_9_18.leetcode_162;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_18.leetcode_162
 * @className: 寻找峰值
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/18 20:21
 * @version: 1.0
 */

public class 寻找峰值 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return i - 1;
            }
        }
        return 0;
    }
}
