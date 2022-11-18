package algorithm11_01_30.day_11_17.面试题03;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_17.面试题03
 * @className: URL化
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/17 19:58
 * @version: 1.0
 */

public class URL化 {

    public static void main(String[] args) {
        System.out.println(replaceSpaces("         ", 5));
    }

    public static String replaceSpaces(String S, int length) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == ' ') {
                buffer.append("%20");
            } else {
                buffer.append(S.charAt(i));
            }
        }
        return buffer.toString();
    }
}
