package algorithm8_01_31.day_8_02.leetcode_389;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_02.leetcode_389
 * @className: 找不同
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/2 20:08
 * @version: 1.0
 */
public class 找不同 {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }
    public static char findTheDifference(String s, String t) {
        if(s.length()==0){
            return t.charAt(0);
        }
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int i = 0; i < chars2.length; i++) {
            if(i == chars1.length){
                return chars2[i];
            }
            if(chars1[i] != chars2[i]){
                return chars2[i];
            }
        }
        return t.charAt(0);
    }

}
