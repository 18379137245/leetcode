package algorithm10_06_31.day_10_31.剑指Offer21;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_31.剑指Offer21
 * @className: 调整数组顺序使奇数位于偶数前面
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/31 19:23
 * @version: 1.0
 */

public class 调整数组顺序使奇数位于偶数前面 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(exchange(nums)));
    }

    public static int[] exchange(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 1) {
                arr[j++] = nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                arr[j++] = nums[i];
            }
        }
        return arr;
    }
}
