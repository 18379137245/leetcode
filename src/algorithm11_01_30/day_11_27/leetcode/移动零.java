package algorithm11_01_30.day_11_27.leetcode;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_27.leetcode
 * @className: 移动零
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/27 18:56
 * @version: 1.0
 */

public class 移动零 {
    public static void main(String[] args) {
        int[] nums = {0};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                arr[j++] = nums[i];
            }
        }
        System.arraycopy(arr, 0, nums, 0, n);
        System.out.println(Arrays.toString(nums));
    }
}
