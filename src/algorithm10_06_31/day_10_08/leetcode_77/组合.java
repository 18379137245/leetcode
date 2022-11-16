package algorithm10_06_31.day_10_08.leetcode_77;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_08.leetcode_77
 * @className: 组合
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/8 19:56
 * @version: 1.0
 */

public class 组合 {
    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }

    // 【典型的01背包问题】每个数两种选择：要 or 不要
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new LinkedList<>();
        if (k > n) return ans;

        dfs(n, 1, k, new LinkedList<>(), ans);

        return ans;
    }

    // n：固定变量，数字选择范围上限
    // cur：当前可选择的范围为 [cur ... n] （零食数组）
    // rest：当前还剩rest个数可选（背包容量）
    // 之前的路径已放入path中，你无需操心，你只需要在[cur ... n]上选出rest个数，加入ans
    private static void dfs(int n,
                            int cur, int rest,
                            LinkedList<Integer> path, List<List<Integer>> ans) {
        if (rest == 0) { // 没数可选了，之前尝试方案有效，形成了一条有效路径，加入答案
            ans.add(new ArrayList<>(path));
            return;
        }
        // 【剪枝】：当前[cur ... n]总共还有n - cur + 1个数可选，如果小于rest，说明，无论如何也不可能选够rest个数了，剪枝返回
        if (n - cur + 1 < rest) return;

        // 选择：不要当前的cur，后续从[cur+1 ... n]上选择rest个数
        dfs(n, cur + 1, rest, path, ans);

        // 选择：要当前的cur，后续从[cur+1 ... n]上选择rest - 1个数
        path.addLast(cur);
        dfs(n, cur + 1, rest - 1, path, ans);
        path.removeLast();
    }
}
