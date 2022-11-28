package algorithm11_01_30.day_11_27.leetcode;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_27.leetcode
 * @className: 两数之和
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/27 19:02
 * @version: 1.0
 */

public class 两数之和 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}
