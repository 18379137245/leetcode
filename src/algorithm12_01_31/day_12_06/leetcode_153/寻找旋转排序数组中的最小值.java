package algorithm12_01_31.day_12_06.leetcode_153;

/**
 * @projectName: leetcode
 * @package: algorithm12_01_31.day_12_06.leetcode_153
 * @className: 寻找旋转排序数组中的最小值
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/12/6 17:48
 * @version: 1.0
 */

public class 寻找旋转排序数组中的最小值 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        int min = findMin(nums);
        System.out.println(min);
    }

    private static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }


}
