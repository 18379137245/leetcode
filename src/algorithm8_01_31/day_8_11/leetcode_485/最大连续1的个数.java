package algorithm8_01_31.day_8_11.leetcode_485;

import com.sun.javafx.collections.MappingChange;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_11.leetcode_485
 * @className: 最大连续1的个数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/11 19:13
 * @version: 1.0
 */
public class 最大连续1的个数 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                min++;
            }else {
                max = Math.max(min, max);
                min = 0;
            }
        }
        return Math.max(min, max);
    }
}
