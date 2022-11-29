package algorithm11_01_30.day_11_28.leetcode;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_28.leetcode
 * @className: 有效的字母异位词
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/28 19:16
 * @version: 1.0
 */

public class 有效的字母异位词 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaraam";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        return Arrays.equals(chars, chars1);
    }
}
