package algorithm8_01_31.day_8_04.leetcode_414;

import java.util.*;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.leetcode_8_04.leetcode_414
 * @className: 第三大的数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/3 20:50
 * @version: 1.0
 */
public class 第三大的数 {
    public static void main(String[] args) {
        int[] nums = {1,1, 2};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {

        Arrays.sort(nums);
        TreeSet set = new TreeSet();
        for (int i = nums.length - 1; i >= 0; i--) {
            set.add(nums[i]);
        }
        Object[] objects = set.toArray();
        if(objects.length == 1){
            return  (int)objects[0];
        }else if(objects.length == 2) {
            return  (int)objects[1];
        }
        int j = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (j == 2) {
                return nums[i];
            }else if (nums[i] != nums[i - 1]) {
                j++;
            }
        }
        return -1;
    }

    public static int thirdMax1(int[] nums) {

        Arrays.sort(nums);
        if(nums.length == 2){
            return nums[1];
        }
        int j = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (j == 2) {
                return nums[i];
            }else if (nums[i] != nums[i - 1]) {
                j++;
            }
        }
        return -1;
    }
}
