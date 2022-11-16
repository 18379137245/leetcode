package algorithm11_01_30.day_11_07.剑指Offer58;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.dai_11_07.剑指Offer58
 * @className: 左旋转字符串
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/7 18:37
 * @version: 1.0
 */

public class 左旋转字符串 {

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseLeftWords(s, 2));
    }

    public static String reverseLeftWords(String s, int n) {
        String s1 = s.substring(0, n);
//        int length = s.length();
        String s2 = s.substring(n,  s.length());
        return s2 + s1;
    }
}
