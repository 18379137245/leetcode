package algorithm11_01_30.day_11_06.剑指Offer56;

import java.util.*;
import java.util.function.ToIntFunction;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_06.剑指Offer56
 * @className: 数组中数字出现的次数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/6 18:14
 * @version: 1.0
 */

public class 数组中数字出现的次数 {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(singleNumbers(nums)));
    }

    public static int[] singleNumbers(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for (Map.Entry<Integer, Integer> integerIntegerEntry : set) {
            if (integerIntegerEntry.getValue() == 1) {
                list.add(integerIntegerEntry.getKey());
            }
        }

        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}
