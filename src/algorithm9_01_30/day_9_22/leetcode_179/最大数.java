package algorithm9_01_30.day_9_22.leetcode_179;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_22.leetcode_179
 * @className: 最大数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/22 20:06
 * @version: 1.0
 */

public class 最大数 {
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        largestNumber(nums);
    }

    public static String largestNumber(int[] nums) {
        //定义一个有长度的集合
        List<Integer> list = new ArrayList<>(nums.length);
        //往集合挨个添加
        for (int x : nums) list.add(x);

        //利用lambda表达式将list中的数按照s2 + s1的字典序从大到小排序
        list.sort((o1, o2) -> {
            String s1 = String.valueOf(o1), s2 = String.valueOf(o2);
            return (s2 + s1).compareTo(s1 + s2);
        });
        String s = list.toString();
        StringBuilder res = new StringBuilder();
        //快速拼接
        for (int x : list) res.append(x);

        //第一个如果是0 返回0
        if (res.charAt(0) == '0') return "0";
        //返回最后结果转字符串
        return res.toString();
    }
}
