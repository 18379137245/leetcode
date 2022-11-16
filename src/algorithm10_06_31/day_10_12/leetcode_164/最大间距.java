package algorithm10_06_31.day_10_12.leetcode_164;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_12.leetcode_153
 * @className: 寻找旋转排序数组中的最小值
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/12 19:15
 * @version: 1.0
 */

public class 最大间距 {
    public static void main(String[] args) {
        int[] nums = {3, 6, 9, 1};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        if(nums.length <= 1){
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(nums[i] - nums[i - 1],max);
        }
        return max;
    }

}
