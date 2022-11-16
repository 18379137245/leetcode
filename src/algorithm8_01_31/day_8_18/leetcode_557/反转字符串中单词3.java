package algorithm8_01_31.day_8_18.leetcode_557;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_18.leetcode_557
 * @className: 反转字符串中单词3
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/18 19:33
 * @version: 1.0
 */

public class 反转字符串中单词3 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();

        for (int i = 0; i < s1.length; i++) {

            for (int j = 0; j < s1[i].length(); j++) {
                str.append(s1[i].charAt(j));
            }
            if (i != s1.length - 1) {
                str1.append(str.reverse() + " ");
            } else {
                str1.append(str.reverse());
            }

            str.delete(0, s1[i].length());
        }

        return str1.toString();
    }
}
