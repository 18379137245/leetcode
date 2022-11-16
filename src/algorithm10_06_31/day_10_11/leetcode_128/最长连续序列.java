package algorithm10_06_31.day_10_11.leetcode_128;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_11.leetcode_128
 * @className: 最长连续序列
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/11 20:22
 * @version: 1.0
 */

public class 最长连续序列 {
    public static void main(String[] args) {
        int[] nums = {0,1,1,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] <= nums[i]) {
                if(nums[i] - nums[i - 1] == 1){
                    count++;
                }else if(nums[i] - nums[i - 1] == 0){
                    continue;
                } else {
                    max = Math.max(max, count);
                    count = 1;
                }
            }
        }
        return Math.max(count, max);
    }
}
