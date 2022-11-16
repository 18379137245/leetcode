package algorithm11_01_30.day_11_11.剑指OfferII004;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_11.剑指OfferII004
 * @className: 只出现一次的数字
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/11 19:56
 * @version: 1.0
 */

public class 只出现一次的数字 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1, 2, 3, 4, 5};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }

}
