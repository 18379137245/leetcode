package algorithm9_01_30.day_9_17.leetcode_151;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_17.leetcode_151
 * @className: 反转字符串中的单词
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/17 20:14
 * @version: 1.0
 */

public class 反转字符串中的单词 {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] s1 = s.trim().split(" ");
        System.out.println(Arrays.toString(s1));
        StringBuffer str = new StringBuffer();
        for (int length = s1.length - 1; length >= 0; length--) {
            if(!s1[length].equals("")){
                str.append(s1[length]);
                if (length != 0) {
                    str.append(" ");
                }
            }

        }
        return str.toString();
    }
}
