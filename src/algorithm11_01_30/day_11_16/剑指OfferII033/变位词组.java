package algorithm11_01_30.day_11_16.剑指OfferII033;

import java.util.*;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_16.剑指OfferII033
 * @className: 变位词组
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/16 21:07
 * @version: 1.0
 */

public class 变位词组 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(Arrays.toString(groupAnagrams(strs).toArray()));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
