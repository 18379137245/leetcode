package algorithm10_06_31.day_10_07.leetcode_57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_07.leetcode_56
 * @className: 合并区间
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/7 19:16
 * @version: 1.0
 */

public class 插入区间 {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[] newInterval = {7,9};
        int[][] merge = insert(intervals, newInterval);
        for (int[] ints : merge) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if (newInterval.length == 0) return intervals;
        if (intervals.length == 0) return new int[][]{newInterval};
        List<int[]> res = new ArrayList<>();
        int L = newInterval[0], R = newInterval[1], len = intervals.length, j = 0;
        while (j < len && intervals[j][1] < L){
            res.add(intervals[j++]);      //重叠前直接加入List
        }
        while (j < len && intervals[j][0] <= R) {     //处理重叠区域
            L = Math.min(L, intervals[j][0]);
            R = Math.max(R, intervals[j++][1]);
        }
        res.add(new int[]{L, R});
        while (j < len) res.add(intervals[j++]);     //不会再出现重叠区域，直接加入List
        return res.toArray(new int[res.size()][]);
    }
}
