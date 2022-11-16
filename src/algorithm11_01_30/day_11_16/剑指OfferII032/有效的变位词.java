package algorithm11_01_30.day_11_16.剑指OfferII032;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_16.剑指OfferII032
 * @className: 有效的变位词
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/16 20:46
 * @version: 1.0
 */

public class 有效的变位词 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length() || s.equals(t)) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
