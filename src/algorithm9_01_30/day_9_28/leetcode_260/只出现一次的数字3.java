package algorithm9_01_30.day_9_28.leetcode_260;

import java.util.*;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_28.leetcode_260
 * @className: 只出现一次的数字3
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/28 14:51
 * @version: 1.0
 */

public class 只出现一次的数字3 {
    public static void main(String[] args) {
        int[] nums = {1, 2,12,23,21,12,2};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }
    public static int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //key相同 值覆盖
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            //key = 键     value 值
            int key = entry.getKey(), value = entry.getValue();
            //值等于代表只出现过一次 返回键
            if (value == 1) {
                list.add(key);
            }
        }
        int[] arr1 = list.stream().mapToInt(Integer::valueOf).toArray();
        return arr1;
    }
}
