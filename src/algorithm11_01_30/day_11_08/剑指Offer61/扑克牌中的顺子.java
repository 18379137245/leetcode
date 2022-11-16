package algorithm11_01_30.day_11_08.剑指Offer61;

import java.util.*;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_08.剑指Offer61
 * @className: 扑克牌中的顺子
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/8 19:48
 * @version: 1.0
 */

public class 扑克牌中的顺子 {

    public static void main(String[] args) {
        int[] nums = {9, 2, 6, 7, 10};
        System.out.println(isStraight(nums));
    }

    public static boolean isStraight(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num == 0) continue;
            max = Math.max(max, num);
            min = Math.min(min, num);
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
        }
        return max - min < 5;
//        Arrays.sort(nums);
//        int min = Integer.MAX_VALUE;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i - 1] != 0) {
//                min = Math.min(nums[i - 1], min);
//            }
//            if (nums[i] == nums[i - 1] && nums[i] != 0) {
//                return false;
//            }
//        }
//        return nums[nums.length - 1] - min < 5;
    }
}
