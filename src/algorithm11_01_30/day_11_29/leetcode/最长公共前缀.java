package algorithm11_01_30.day_11_29.leetcode;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_29.leetcode
 * @className: 最长公共前缀
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/29 19:01
 * @version: 1.0
 */

public class 最长公共前缀 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < count; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
