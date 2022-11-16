package algorithm10_06_31.day_10_24.剑指Offer03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_24.剑指Offer03
 * @className: 数组中重复的数字
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/24 20:04
 * @version: 1.0
 */

public class 数组中重复的数字 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
    }

    public static int findRepeatNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
//        for (Integer integer : map.keySet()) {
//            if(integer > 1){
//                return integer;
//            }
//        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if(entry.getValue() > 1){
                return entry.getValue();
            }
        }
        return 0;
    }

}
