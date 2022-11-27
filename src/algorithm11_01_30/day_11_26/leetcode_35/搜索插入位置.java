package algorithm11_01_30.day_11_26.leetcode_35;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_26.leetcode_35
 * @className: 搜索插入位置
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/26 16:20
 * @version: 1.0
 */

public class 搜索插入位置 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int min = 0;
        while (left <= right) {
            min = (right + left) / 2;
            if (target > nums[min]) {
                left = min + 1;
            } else if (target < nums[min]) {
                right = min - 1;
            } else {
                return min;
            }
        }
        return left;
    }
}
