package algorithm8_01_31.day_8_01.leetcode_387;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_01.leetcode_387
 * @className: 字符串中的唯一字符
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/1 20:29
 * @version: 1.0
 */
public class 字符串中的唯一字符 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }

    public static int firstUniqChar(String s) {
        //定义一个长度为26的数字数组 默认值0
        int[] arr = new int[26];
        //给 n 赋值 s的长度
        int n = s.length();
        //遍历n
        for (int i = 0; i < n; i++) {
            //给数组的索引的元素 赋值 每次加一
            arr[s.charAt(i) - 'a']++;
        }
        //遍历n
        for (int i = 0; i < n; i++) {
            //给数组的索引的元素 是否等于 1
            if (arr[s.charAt(i) - 'a'] == 1) {
                //成立返回 索引 i
                return i;
            }
        }
        //到这代表数组没有1 返回-1
        return -1;
    }

    public static int firstUniqChar2(String s) {
        //定义一个 键是字符 值是数值的 Map的集合 frequency
        Map<Character, Integer> frequency = new HashMap<Character, Integer>();
        //遍历循环s的长度
        for (int i = 0; i < s.length(); ++i) {
            //把字符串一个一个遍历成字符
            char ch = s.charAt(i);
            //给 Map frequency 添加元素 键一样 值会覆盖
            // ch 是键  frequency.getOrDefault(ch, 0) + 1 是值  默认是0; 键重复 值加一
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        //遍历循环s的长度
        for (int i = 0; i < s.length(); ++i) {
            //判断Map frequency的键的值 是不是等于1
            //成立返回 i 为索引 不成立下一次循环 直至循环结束
            //s.charAt(i) 是它的键
            //frequency.get(s.charAt(i)) 返回的是它的值
            if (frequency.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        //到这代表没有唯一的字符 返回-1
        return -1;
    }
}
