package algorithm9_01_30.day_9_23.leetcode_189;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_23.leetcode_189
 * @className: 转轮数组
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/23 19:24
 * @version: 1.0
 */

public class 转轮数组 {

    public static void main(String[] args) {
        int[] nums = {1,2};
        int k = 3;
        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
        System.out.println(Arrays.toString(newArr));
    }
}
