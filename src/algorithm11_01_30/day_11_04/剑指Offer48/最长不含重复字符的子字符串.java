package algorithm11_01_30.day_11_04.剑指Offer48;

import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_04.剑指Offer48
 * @className: 最长不含重复字符的子字符串
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/4 19:38
 * @version: 1.0
 */

public class 最长不含重复字符的子字符串 {


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwpwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int r = 0, l = 0, res = 0;
        //不重复的集合
        HashSet<Character> set = new HashSet<>();
        while (r < s.length()) {
            //获取当前字符
            char c = s.charAt(r++);
            //判断集合是否存在这个字符
            while (set.contains(c)) {
                //存在删除集合元素 从第一个元素开始删一直删到不存在该元素
                set.remove(s.charAt(l++));
            }
            //加入集合
            set.add(c);
            //选取最大集合长度
            res = Math.max(res, set.size());
        }
        return res;
    }
}
