package algorithm12_01_31.day_12_03.leetcode_1608;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm12_01_31.day_12_01.leetcode_1608
 * @className: 特殊数组的特征值
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/12/3 21:09
 * @version: 1.0
 */

public class 特殊数组的特征值 {
    public static void main(String[] args) {
        int[] nums = {3,6,7,7,0};
        System.out.println(specialArray(nums));
    }

    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, left = 1, right = nums.length;
        while (left <= right) {
            int mid = left + right >> 1;
            if (nums[n - mid] >= mid) {
                if (mid == n || nums[n - mid - 1] < mid) {
                    return mid;
                } else {
                    left = mid + 1;
                }
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
