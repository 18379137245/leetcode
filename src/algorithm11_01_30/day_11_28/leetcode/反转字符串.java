package algorithm11_01_30.day_11_28.leetcode;

import java.util.Arrays;
import java.util.Locale;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_28.leetcode
 * @className: 反转字符串
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/28 19:00
 * @version: 1.0
 */

public class 反转字符串 {
    public static void main(String[] args) {
        char[] s = "hello".toCharArray();
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            ++left;
            --right;
        }
        System.out.println(Arrays.toString(s));
    }
}
