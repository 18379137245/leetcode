package algorithm8_01_31.day_8_13.leetcode_500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_13.leetcode_500
 * @className: 键盘行
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/13 19:55
 * @version: 1.0
 */

public class 键盘行 {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] words1 = findWords(words);
        System.out.println(Arrays.toString(words1));
    }

    public static String[] findWords(String[] words) {
        String row1 = "qwertyuiop", row2 = "asdfghjkl", row3 = "zxcvbnm";
        ArrayList<String> list = new ArrayList<>();
        int count1 = 0, count2 = 0, count3 = 0;
        for (int i = 0; i < words.length; i++) {
            count1 = 0;
            count2 = 0;
            count3 = 0;
            for (int j = 0; j < words[i].length(); j++) {
                String s = words[i].toLowerCase();
                int length = words[i].length();
                if (row1.contains(s.substring(j, j + 1))) {
                    count1++;
                    if (count1 == length) {
                        list.add(words[i]);
                    }
                } else if (row2.contains(s.substring(j, j + 1))) {
                    count2++;
                    if (count2 == length) {
                        list.add(words[i]);
                    }
                } else if (row3.contains(s.substring(j, j + 1))) {
                    count3++;
                    if (count3 == length) {
                        list.add(words[i]);
                    }
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
