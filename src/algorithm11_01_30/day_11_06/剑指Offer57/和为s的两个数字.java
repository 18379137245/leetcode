package algorithm11_01_30.day_11_06.剑指Offer57;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_06.剑指Offer57
 * @className: 和为s的两个数字
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/6 18:48
 * @version: 1.0
 */

public class 和为s的两个数字 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 45, 6, 7};
        System.out.println(Arrays.toString(twoSum(nums, 8)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j) {

            int s = nums[i] + nums[j];
            if (s < target){
                i++;
            } else if (s > target) {
                j--;
            } else{
                return new int[]{nums[i], nums[j]};
            }
        }
        return new int[0];
    }
}
