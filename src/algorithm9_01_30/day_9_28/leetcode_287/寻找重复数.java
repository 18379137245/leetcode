package algorithm9_01_30.day_9_28.leetcode_287;

import java.util.*;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_28.leetcode_287
 * @className: 寻找重复数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/28 18:51
 * @version: 1.0
 */

public class 寻找重复数 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));

    }
    public static int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //key相同 值覆盖
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int key = 0;
        int value = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            //key = 键     value 值
            key = entry.getKey();
            value = entry.getValue();
            //值等于代表只出现过一次 返回键
            if (value >= 2) {
                return key;
            }
        }
        return key;
    }
}
