package algorithm8_01_31.day_8_23.leetcode_599;

import java.util.*;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_23.leetcode_599
 * @className: 两个列表的最小索引总和
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/23 20:21
 * @version: 1.0
 */

public class 两个列表的最小索引总和 {
    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Burger King","Tapioca Express", "KFC"} ,list2 = {"KFC", "Shogun", "Burger King"};

        String[] restaurant = findRestaurant(list1, list2);
        for (String s : restaurant) {
            System.out.println(s);
        }
    }
    public static String[] findRestaurant(String[] list1, String[] list2) {
        // 第一个数组长度小于第二个数组长度就调换一下
        if (list1.length > list2.length) {
            return findRestaurant(list2, list1);
        }

        Map<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            //添加短的数组元素
            map1.put(list1[i], i);
        }

        //看似最小实则最大 int类型最大的数值
        int min = Integer.MAX_VALUE;

        List<String> list = new ArrayList<>();
        //遍历
        for (int i = 0; i < list2.length; i++) {
            //判断 map集合key 是否 包含 list2数组元素
            if (map1.containsKey(list2[i])) {
                //map1.get(list2[i])  获取map1 key的值
                int cur = i + map1.get(list2[i]);
                //第一次基本不可能成立
                if (cur == min) {
                    list.add(list2[i]);
                } else if (cur < min) {
                    //赋值
                    min = cur;
                    //清空集合
                    list.clear();
                    //添加元素
                    list.add(list2[i]);
                }
            }
        }
        //返回数组
        return list.toArray(new String[list.size()]);
    }
}
