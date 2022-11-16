package algorithm11_01_30.day_11_13.剑指OfferII012;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_13.剑指OfferII012
 * @className: 左右两边子数组的和相等
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/13 19:07
 * @version: 1.0
 */

public class 左右两边子数组的和相等 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 7, 6, 5, 6};
        pivotIndex(nums);
    }

    public static int pivotIndex(int[] nums) {
        //总和
        int total = Arrays.stream(nums).sum();
        //当前和
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            //2*当前和 + 当前元素 == 总和
            if (2 * sum + nums[i] == total) {
                //返回索引
                return i;
            }
            //和累加
            sum += nums[i];
        }
        return -1;
    }
}
