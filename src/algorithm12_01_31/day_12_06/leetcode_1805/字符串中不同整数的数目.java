package algorithm12_01_31.day_12_06.leetcode_1805;

import java.util.HashSet;

/**
 * @projectName: leetcode
 * @package: algorithm12_01_31.day_12_06.leetcode_1805
 * @className: 字符串中不同整数的数目
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/12/6 18:24
 * @version: 1.0
 */

public class 字符串中不同整数的数目 {
    public static void main(String[] args) {
        String word = "a123bc34d8ef34";
        System.out.println(numDifferentIntegers(word));
    }

    public static int numDifferentIntegers(String word) {
        StringBuilder builder = new StringBuilder();
        HashSet<String> set = new HashSet<>();
        int n = word.length();
        for (int i = 0; i < n; i++) {
            if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
                builder.append(word.charAt(i));
                if (i == word.length() - 1 || word.charAt(i + 1) > '9' || word.charAt(i + 1) < '0') {
                    while (builder.length() > 1 && builder.indexOf("0") == 0) {
                        builder.deleteCharAt(0);
                    }
                    boolean add = set.add(builder.toString());
                    builder = new StringBuilder();
                }
            }
        }
        return set.size();
    }
}
