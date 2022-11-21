package algorithm11_01_30.day_11_20.面试题1002;

import java.util.*;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_20.面试题1002
 * @className: 变位词组
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/20 20:33
 * @version: 1.0
 */

public class 变位词组 {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(Arrays.toString(groupAnagrams(strs).toArray()));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
}
