package algorithm11_01_30.day_11_19.面试题0804;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_19.面试题0804
 * @className: 幂集
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/19 19:20
 * @version: 1.0
 */

public class 幂集 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        System.out.println(1 << nums.length);
        List<List<Integer>> res = new ArrayList<>();
        //先添加一个空的集合
        res.add(new ArrayList<>());
        for (int num : nums) {
            //每遍历一个元素就在之前子集中的每个集合追加这个元素，让他变成新的子集
            for (int i = 0, j = res.size(); i < j; i++) {
                //遍历之前的子集，重新封装成一个新的子集
                List<Integer> list = new ArrayList<>(res.get(i));
                //然后在新的子集后面追加这个元素
                list.add(num);
                //把这个新的子集添加到集合中
                res.add(list);
            }
        }
        return res;
    }
}
