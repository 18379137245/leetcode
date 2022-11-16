package algorithm8_01_31.day_8_17.leetcode_522;

import java.util.HashSet;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_17.leetcode_522
 * @className: 最长特殊序列2
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/17 20:08
 * @version: 1.0
 */

public class 最长特殊序列2 {
    public static void main(String[] args) {
        String[] strs = {"aabbcc", "aabbcc","cb"};
        System.out.println(findLUSlength(strs));
    }

    public static int findLUSlength(String[] strs) {
        int length = strs[0].length();
        boolean result = true;
        HashSet<Character> set = new HashSet();
        int max = 0;
        int min = 100;
        for (int i = 0; i < strs.length; i++) {
            max = Math.max(strs[i].length(), max);
            min = Math.min(strs[i].length(), min);
            if (min != length) {
                result = false;
            }
            for (int j = 0; j < strs[i].length(); j++) {
                set.add(strs[i].charAt(j));
            }
        }
        if (set.size() == 1) {
            return -1;
        } else if(min >= 2) {
            return min;
        } else if(result == false){
            return -1;
        } else if(result){
            return max;
        }
        return -1;
    }
}
