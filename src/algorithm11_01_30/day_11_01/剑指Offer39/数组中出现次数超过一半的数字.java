package algorithm11_01_30.day_11_01.剑指Offer39;

import java.rmi.MarshalledObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_01.剑指Offer39
 * @className: 数组中出现次数超过一半的数字
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/1 20:21
 * @version: 1.0
 */

public class 数组中出现次数超过一半的数字 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int n = nums.length;
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        return nums[0];
    }
}
