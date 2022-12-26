package algorithm12_01_31.day_12_25.leetcode_1562;

import java.util.Map;
import java.util.TreeMap;

public class 查找大小为M的最新分组 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 4};
        int m = 1;
        System.out.println(findLatestStep(arr, m));
    }

    public static int findLatestStep(int[] arr, int m) {
        if (arr.length == m) {
            return m;
        }
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        tm.put(0, arr.length + 1);
        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i];
            Map.Entry<Integer, Integer> entry = tm.floorEntry(num);
            int l = entry.getKey(), r = entry.getValue();
            if (num - l - 1 == m) {
                return i;
            }
            if (r - num - 1 == m) {
                return i;
            }
            tm.put(l, num);
            tm.put(num, r);
        }
        return -1;
    }
}
