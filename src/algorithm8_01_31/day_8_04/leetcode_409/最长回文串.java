package algorithm8_01_31.day_8_04.leetcode_409;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.leetcode_8_04.leetcode_409
 * @className: 最长回文串
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/4 19:13
 * @version: 1.0
 */
public class 最长回文串 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaabbbc"));
        System.out.println(1/2);
    }

    public static int longestPalindrome(String s) {
        //定义一个 HashMap 集合 键是字符 值是整数
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            //ch 是字符串中的每一个字符
            char ch = s.charAt(i);
            //集合添加元素
            //键不能重复 值可以重复
            //键重复的情况下 map.getOrDefault(ch, 0)+ 1 默认值为 0 值会进行覆盖 每次加一
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        //定义一个变量 count
        int count = 0;
        //迭代器 获取每一个map的键和值
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            //获取键的值 value
            int value = entry.getValue();
            //获取满足回文的个数 value值必须大于等于2 小于 就相当于 count 加 0
            count += value / 2 * 2;

            //需要同时满足两个条件
            //value % 2 == 1 代表 value 是个奇数
            //count % 2 == 0 代表 count 是一个偶数
            //应为回文数中间数为一个所以需要加一
            //只会加一次 因为 count加完就会变成一个奇数
            if(value % 2 == 1 && count % 2 ==0){
                count++;
            }
        }
        //返回 count
        return count;
    }
}
