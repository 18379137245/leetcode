package algorithm9_01_30.day_9_27.leetcode_238;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_27.leetcode_238
 * @className: 除自身以外数组的乘积
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/27 20:44
 * @version: 1.0
 */

public class 除自身以外数组的乘积 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int k = 1;
        for (int i = 0; i < res.length; i++) {
            res[i] = k;
            k = k * nums[i]; // 此时数组存储的是除去当前元素左边的元素乘积
        }
        k = 1;
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] *= k; // k为该数右边的乘积。
            k *= nums[i]; // 此时数组等于左边的 * 该数右边的。
        }
        return res;
    }
}
