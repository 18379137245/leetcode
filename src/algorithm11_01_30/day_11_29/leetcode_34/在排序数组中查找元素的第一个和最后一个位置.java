package algorithm11_01_30.day_11_29.leetcode_34;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_29.leetcode_34
 * @className: 在排序数组中查找元素的第一个和最后一个位置
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/29 18:01
 * @version: 1.0
 */

public class 在排序数组中查找元素的第一个和最后一个位置 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        Arrays.fill(arr, -1);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target && count == 0) {
                arr[0] = i;
                count++;
            }if (nums[i] == target && count > 0) {
                arr[1] = i;
            }
        }
        return arr;
    }
}
