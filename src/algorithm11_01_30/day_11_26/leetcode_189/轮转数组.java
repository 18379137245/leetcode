package algorithm11_01_30.day_11_26.leetcode_189;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_26.leetcode_189
 * @className: 轮转数组
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/26 19:11
 * @version: 1.0
 */

public class 轮转数组 {
    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        int k = 2;
        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
        System.out.println(Arrays.toString(nums));
    }
}
