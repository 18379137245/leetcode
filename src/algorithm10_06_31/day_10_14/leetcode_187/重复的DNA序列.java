package algorithm10_06_31.day_10_14.leetcode_187;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_14.leetcode_187
 * @className: 重复的DNA序列
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/14 20:00
 * @version: 1.0
 */

public class 重复的DNA序列 {
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequences(s));
    }

    private static final Integer L = 10;

    public static List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        int n = s.length();
        for (int i = 0; i <= n - 10; i++) {
            String s1 = s.substring(i, i + 10);
            map.put(s1, map.getOrDefault(s1, 0) + 1);
            if (map.get(s1) == 2) {
                list.add(s1);
            }
        }
        return list;
    }
}
