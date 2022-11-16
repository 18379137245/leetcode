package algorithm11_01_30.day_11_05.剑指Offer53;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_05.剑指Offer53
 * @className: 在排序数组中查找数字1
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/5 19:48
 * @version: 1.0
 */

public class 在排序数组中查找数字1 {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(search(nums, 8));
    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for (Map.Entry<Integer, Integer> integerIntegerEntry : set) {
            if (integerIntegerEntry.getKey() == target) {
                return integerIntegerEntry.getValue();
            }
        }
        return 0;
    }
}
