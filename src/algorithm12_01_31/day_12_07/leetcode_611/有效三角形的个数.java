package algorithm12_01_31.day_12_07.leetcode_611;

import algorithm12_01_31.day_12_05.leetcode.环形链表.Solution;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm12_01_31.day_12_07.leetcode_611
 * @className: 有效三角形的个数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/12/7 18:28
 * @version: 1.0
 */

public class 有效三角形的个数 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 4};
        System.out.println(triangleNumber(nums));
    }

    public static int triangleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int left = j + 1, right = n - 1, k = j;
                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (nums[mid] < nums[i] + nums[j]) {
                        k = mid;
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                ans += k - j;
            }
        }
        return ans;
    }
}
