package algorithm9_01_30.day_9_26.leetcode_215;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_26.leetcode_215
 * @className: 数组中的第K个最大元素
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/26 20:17
 * @version: 1.0
 */

public class 数组中的第K个最大元素 {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            if (k == 1) {
                return nums[i];
            }
            k--;
        }
        return -1;
    }
}
