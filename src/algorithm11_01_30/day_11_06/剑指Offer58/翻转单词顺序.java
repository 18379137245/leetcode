package algorithm11_01_30.day_11_06.剑指Offer58;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_06.剑指Offer58
 * @className: 翻转单词顺序
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/6 19:13
 * @version: 1.0
 */

public class 翻转单词顺序 {
    public static void main(String[] args) {
        String s = "  hello world!  ";

        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] split = s.trim().split(" ");
        StringBuffer str = new StringBuffer();
        for (int length = split.length - 1; length >= 0; length--) {
            String s1 = split[length];
            if (!s1.equals("")) {
                str.append(split[length]);
                if (length > 0) {
                    str.append(" ");
                }
            }
        }
        return str.toString();
    }
}
