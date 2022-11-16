package algorithm11_01_30.day_11_13.剑指OfferII016;

import java.util.HashSet;
import java.util.Set;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_13.剑指OfferII016
 * @className: 不含重复字符的最长子字符串
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/13 19:22
 * @version: 1.0
 */

public class 不含重复字符的最长子字符串 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkwy"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Set<Character> set = new HashSet<>();
        for (int right = 0, left = 0; right < n; right++) {
            while (!set.add(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
