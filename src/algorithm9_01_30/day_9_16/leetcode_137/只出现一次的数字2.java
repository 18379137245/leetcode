package algorithm9_01_30.day_9_16.leetcode_137;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_16.leetcode_137
 * @className: 只出现一次的数字2
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/16 20:34
 * @version: 1.0
 */

public class 只出现一次的数字2 {
    public static void main(String[] args) {

        int[] nums = {2, 2, 2, 3};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //key相同 值覆盖
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int ans = 0;
        //迭代器
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            //key = 键     value 值
            int key = entry.getKey(), value = entry.getValue();
            //值等于代表只出现过一次 返回键
            if (value == 1) {
                return key;
            }
        }
        return ans;
    }
}
