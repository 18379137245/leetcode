package algorithm11_01_30.day_11_15.剑指OfferII020;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_15.剑指OfferII020
 * @className: 回文子字符串的个数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/15 20:28
 * @version: 1.0
 */

public class 回文子字符串的个数 {
    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
    }

    public static int countSubstrings(String s) {
        int n = s.length(), ans = 0;
        for (int i = 0; i < 2 * n - 1; ++i) {
            int l = i / 2, r = i / 2 + i % 2;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                --l;
                ++r;
                ++ans;
            }
        }
        return ans;
    }
}
