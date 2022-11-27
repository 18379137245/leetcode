package algorithm11_01_30.day_11_26.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_26.leetcode
 * @className: 只出现一次的数字
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/26 19:45
 * @version: 1.0
 */

public class 只出现一次的数字 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return nums[0];
    }
}
