package algorithm8_01_31.day_8_07.leetcode_459;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_07.leetcode_459
 * @className: 重复的子字符串
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/7 18:23
 * @version: 1.0
 */
public class 重复的子字符串 {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abac"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for (int i = 1; i < s.length(); i++) {
            String substring1 = s.substring(0, i);
            String substring3 = s.substring(length - i, length);
            String substring2 = s.substring(i, length);
            String substring4 = s.substring(0, length - i);
            if (substring1.equals(substring3)) {
                if (substring2.equals(substring4) && length % 2 == 0) {
                    return true;
                }
            }

        }
        return false;
    }
}
