package algorithm11_01_30.day_11_11.剑指OfferII006;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_11.剑指OfferII006
 * @className: 排序数组中两个数字之和
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/11 20:26
 * @version: 1.0
 */

public class 排序数组中两个数字之和 {
    public static void main(String[] args) {
        int[] nums = {0,0,3,4};
        System.out.println(Arrays.toString(twoSum(nums, 8)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] arr = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(numbers[i] + numbers[j] == target && i != j ){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }
}
