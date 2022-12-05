package algorithm12_01_31.day_12_04.leetcode_1774;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm12_01_31.day_12_04.leetcode_1774
 * @className: 最接近目标价格的甜点成本
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/12/4 20:32
 * @version: 1.0
 */

public class 最接近目标价格的甜点成本 {
    public static void main(String[] args) {
        int[] baseCosts = {1, 7}, toppingCosts = {3, 4};
        int target = 10;
        System.out.println(closestCost(baseCosts, toppingCosts, target));
    }

    public static int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        // 获取基料的最小值
        int x = Arrays.stream(baseCosts).min().getAsInt();

        // 进行特判
        if (x >= target) {
            return x;
        }

        // 表示每个价位是否存在合法的方案, 从 0 到 target
        boolean[] can = new boolean[target + 1];

        // 用一个变量来记录“开销超过 target ”的情况
        // 当取到 2 * target - x 的时候， 根据题目中 "返回成本相对较低的一种"，x 与 2 * target - x 关于 target 对称， 那么一定返回 x
        // 所以如果 “开销超过 target ”的值取到超过 res, 那么比 x 距离 target 还远， 一定不成立
        int res = 2 * target - x;

        // 遍历基料数组, 初始化can数组, 修改 res
        for (int b : baseCosts) {
            if (b <= target) {
                can[b] = true;
            } else {
                res = Math.min(res, b);
            }
        }

        // 遍历辅料数组
        for (int t : toppingCosts) {
            // 每种基料可以加两种辅料
            for (int count = 0; count < 2; count++) {
                // 从要凑配的目标开始反向遍历
                for (int i = target; i > 0; i--) {
                    // 进行动态规划，如果当前位置 can 数组设置为 true, 即允许进行下一步操作的话
                    // 如果比 target 大
                    if (can[i] && i + t > target) {
                        res = Math.min(res, i + t);
                    }
                    // 因为任意一个合法方案加上一份配料一定也是合法方案，所以 can 数组的状态转义方程是 can[i] = can[i] | can[i - t]
                    // can[i - t] 就是去掉当前这份配料以后，有可能存在的上一份合法方案, 根据此更新 can 数组的值
                    if (i - t > 0) {
                        can[i] = can[i] | can[i - t];
                    }
                }
            }
        }
        // 先找比 target 小的方案 （且注意范围，遍历 res - target + 1 次，保证 Math.abs(target - i) <= Math.abs(target - res) ）
        for (int i = 0; i <= res - target; i++) {
            // 从 target 往前依次找是否有满足条件的方案
            if (can[target - i]) {
                return target - i;
            }
        }
        // 若在范围内没找到比 target 小的，就返回“成本相对较低的”的 比 target 大的情况
        return res;
    }
}
