package algorithm9_01_30.day_9_08.leetcode_34;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_08.leetcode_34
 * @className: 在排序数组中查找元素的第一个和最后一个位置
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/8 20:43
 * @version: 1.0
 */

public class 在排序数组中查找元素的第一个和最后一个位置 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,8,8,10};

        int[] ints = searchRange(nums, 8);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target && a == 0){
                arr[0] = i;
                a++;
            }
            if(nums[i] == target && a >= 0){
                arr[1] = i;
            }
        }
        if(a == 0){
            return new int[]{-1,-1};
        }
        return arr;
    }
}
