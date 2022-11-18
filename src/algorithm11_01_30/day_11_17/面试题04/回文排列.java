package algorithm11_01_30.day_11_17.面试题04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_17.面试题04
 * @className: 回文排列
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/17 20:09
 * @version: 1.0
 */

public class 回文排列 {

    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("abccbad"));
    }

    public static boolean canPermutePalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() % 2 == 1) {
                count++;
            }
        }
        return count == 1;
    }
}
