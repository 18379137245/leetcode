package algorithm8_01_31.day_8_17.leetcode_521;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_17.leetcode_521
 * @className: 最长特殊序列1
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/17 20:02
 * @version: 1.0
 */

public class 最长特殊序列1 {
    public static void main(String[] args) {
        System.out.println(findLUSlength("abc", "a23bc"));
    }

    public static int findLUSlength(String a, String b) {
//        if(a.equals(b)){
//            return -1;
//        }else if(a.length() > b.length()) {
//            return a.length();
//        }else if(a.length() < b.length()){
//            return b.length();
//        }else {
//            return a.length();
//        }

        return !a.equals(b) ? Math.max(a.length(), b.length()) : -1;
    }
}
