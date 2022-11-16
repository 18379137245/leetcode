package algorithm8_01_31.day_8_02.leetcode_392;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_02.leetcode_392
 * @className: 判断子序列
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/2 20:31
 * @version: 1.0
 */
public class 判断子序列 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("b", "abc"));
    }
    public static boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return false;
        }
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if(j == chars1.length){
                return false;
            }
            if(chars1[j] == chars2[i]){
                j++;
            }
        }
        return j==chars1.length;
    }
}
