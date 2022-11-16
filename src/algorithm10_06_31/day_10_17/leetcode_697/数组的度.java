package algorithm10_06_31.day_10_17.leetcode_697;

import java.util.*;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_17.leetcode_697
 * @className: 数组的度
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/17 19:17
 * @version: 1.0
 */

public class 数组的度 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 3, 1};
        System.out.println(findShortestSubArray(nums));
    }

    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            max = Math.max(entry.getValue(), max);
        }
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }
        Arrays.sort(list.toArray());
        System.out.println(list);
        int count = 0;
        int min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        int minn = Integer.MAX_VALUE;
        if (list.size() == 1) {
            for (int j = 0; j < nums.length; j++) {
                if (list.get(0) == nums[j]) {
                    count = j;
                    min = Math.min(count, min);
                    max = Math.max(count, max);
                }
            }
            return Math.min(max - min + 1, minn);
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = 0; j < nums.length; j++) {
                if (list.get(i) == nums[j]) {
                    count = j;
                    min = Math.min(count, min);
                    max = Math.max(count, max);
                }
            }
            minn = Math.min(max - min + 1, minn);
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
        }
        return minn;
    }
}
