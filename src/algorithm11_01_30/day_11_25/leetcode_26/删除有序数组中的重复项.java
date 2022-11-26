package algorithm11_01_30.day_11_25.leetcode_26;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_25.leetcode_26
 * @className: 删除有序数组中的重复项
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/25 19:36
 * @version: 1.0
 */

public class 删除有序数组中的重复项 {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0, j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                nums[++i] = nums[j];
            }
        }
        return i;
    }
}
