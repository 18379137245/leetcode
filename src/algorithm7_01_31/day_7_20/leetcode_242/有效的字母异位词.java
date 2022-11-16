package algorithm7_01_31.day_7_20.leetcode_242;

import java.util.Arrays;

public class 有效的字母异位词 {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
    public static boolean isAnagram(String s, String t) {
        //toCharArray() 把字符串变成 一个字符数组
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();

        //Arrays.sort 可以对数组进行升序  默认升序
        Arrays.sort(chars);
        Arrays.sort(chars1);

        //  equals默认比较地址值  因为Arrays 重写equals 所以比较内容 成立ture 否则 false
        return Arrays.equals(chars,chars1);
    }
}
