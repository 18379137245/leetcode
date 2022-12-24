package algorithm12_01_31.day_12_24.leetcode_1488;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class 避免洪水泛滥 {
    public static void main(String[] args) {
        int[] rains = {1, 2, 0, 0, 2, 1};
        System.out.println(Arrays.toString(avoidFlood(rains)));
    }

    public static int[] avoidFlood(int[] rains) {
        int n = rains.length;
        // 用map记录每个湖泊上一次下雨的日期
        Map<Integer, Integer> lastDayMap = new HashMap<>();
        int[] res = new int[n];
        TreeSet<Integer> zero = new TreeSet<>();
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                zero.add(i);
                res[i] = 1; //随便抽一个，后面如果有需要直接覆盖
            } else {
                res[i] = -1;
                if (lastDayMap.containsKey(rains[i])) {
                    Integer draw = zero.ceiling(lastDayMap.get(rains[i]));
                    if (draw == null) {
                        return new int[0];
                    }
                    res[draw] = rains[i];
                    zero.remove(draw);
                }
                lastDayMap.put(rains[i], i);
            }
        }
        return res;
    }
}
