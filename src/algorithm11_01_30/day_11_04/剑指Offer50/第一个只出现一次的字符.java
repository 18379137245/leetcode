package algorithm11_01_30.day_11_04.剑指Offer50;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_04.剑指Offer50
 * @className: 第一个只出现一次的字符
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/4 20:16
 * @version: 1.0
 */

public class 第一个只出现一次的字符 {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }

    public static char firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
//        for (int i = 0; i < s.length(); i++) {
//            if (map.get(s.charAt(i)) == 1) {
//                return s.charAt(i);
//            }
//        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return ' ';
    }
}
