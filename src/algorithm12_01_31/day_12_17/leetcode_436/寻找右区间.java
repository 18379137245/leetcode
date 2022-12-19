package algorithm12_01_31.day_12_17.leetcode_436;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class 寻找右区间 {
    public static void main(String[] args) {
        int[][] intervals = {{3, 4}, {2, 3}, {1, 2}};
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }


    public static int[] findRightInterval(int[][] intervals) {
        TreeMap<Integer, Integer> left2Index = new TreeMap<>();
        for (int i = 0; i < intervals.length; i++) {
            left2Index.put(intervals[i][0], i);
        }
        int[] ans = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            Map.Entry<Integer, Integer> ceiling = left2Index.ceilingEntry(intervals[i][1]);
            ans[i] = ceiling == null ? -1 : ceiling.getValue();
        }
        return ans;
    }
}
