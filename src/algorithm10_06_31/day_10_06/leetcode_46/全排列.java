package algorithm10_06_31.day_10_06.leetcode_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_06.leetcode_46
 * @className: 全排列
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/6 19:04
 * @version: 1.0
 */

public class 全排列 {
    private  static List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        List<List<Integer>> permute = permute(nums);
        String s = permute.toString();
        System.out.println(s);
    }

    public static List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> trace = new LinkedList<>();
        backTrace(nums, trace);
        return res;
    }

    private static void backTrace(int[] nums, LinkedList<Integer> trace) {
        // 结束条件
        if (nums.length == trace.size()){
            res.add(new LinkedList<>(trace));
            return;
        }
        for (int num : nums) {
            // 如果trace已包含该数字则跳过
            if (trace.contains(num)) {
                continue;
            }
            trace.add(num);
//           System.out.println("添加后"+trace); -->
            backTrace(nums,trace);
            trace.removeLast();
//         System.out.println("移除后-->"+trace);
        }
    }

}
