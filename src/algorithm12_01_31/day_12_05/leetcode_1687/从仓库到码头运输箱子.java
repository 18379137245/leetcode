package algorithm12_01_31.day_12_05.leetcode_1687;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm12_01_31.day_12_05.leetcode_1687
 * @className: 从仓库到码头运输箱子
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/12/5 21:05
 * @version: 1.0
 */

public class 从仓库到码头运输箱子 {
    public static void main(String[] args) {
        int[][] boxes = {{1, 1}, {2, 1}, {1, 1}};
        int portsCount = 2, maxBoxes = 3, maxWeight = 3;
        System.out.println(boxDelivering(boxes, portsCount, maxBoxes, maxWeight));
    }

    public static int boxDelivering(int[][] boxes, int portsCount, int maxBoxes, int maxWeight) {
        int n = boxes.length;
        // dp[i] 代表配送 [0...i] 所需最少trip
        int[] dp = new int[n];
        // 初始化dp数组
        Arrays.fill(dp, 2 * n);
        // 一次卡车（窗口内）在不超过阈值的情况下，箱子总重量，跟随滑动窗口左端点更新
        long weightSum = 0;
        // 用于 记录 每次 贪心确定的窗口 [i...j] 中 最后 [k...j] 部分的码头，
        int lastPort = -1;
        // 用于 记录 每次 贪心确定的窗口 [i...j] 中 最后 [k...j] 部分 k 索引，
        int numTrips = 0;
        // 用于 记录 每次 贪心确定的窗口 [i...j] 中 i和i+1码头不一样的情况有几个
        int k = -1;
        // 对于每个左端点，通过贪心所能达到的右端点
        int j = 0;
        // 枚举左端点，滑动窗口左端点，每次自增1
        // 不要把这个for循环理解为dp的迭代
        // dp[i] 代表配送[0...i]所需的最少trip，那么你应该考虑枚举最后一卡车配送了哪些，也就是从后往前考虑 dp[i-?]
        // 采用滑动窗口。从前往后，考虑每次贪心及贪心弥补，避免了大量重复过程
        for (int i = 0; i < n; ++i) {
            // 贪心，确定右边界
            while (j < n && j - i + 1 <= maxBoxes && weightSum + boxes[j][1] <= maxWeight) {
                // 窗口内总重量
                weightSum += boxes[j][1];
                // 更新 numTrips，这些箱子需要消耗1次trip
                if (j > 0 && boxes[j][0] != boxes[j - 1][0]) {
                    numTrips++;
                }
                // 找到 [i...j] 中 [k...j] 部分，这部分箱子码头一样
                if (boxes[j][0] != lastPort) {
                    lastPort = boxes[j][0];
                    k = j;
                }
                // 扩大右边界
                j++;
            }
            // 上面贪心确定的这一次卡车装 [i...j-1] 范围箱子
            // 那么 [0...j-1] 箱子就可以分为 配送 [0...i-1]所需最少trip + [i...j] 所需的trip
            // 配送 [0...i-1]所需最少trip 为 dp[i-1]，如果越界认为值为0
            // [i...j] 所需的trip = i到j之间所需numTrips 加上 从仓库去i 和 从j回仓库
            // 因为可能多次更新这个值，因此还是要取min
            dp[j - 1] = Math.min(dp[j - 1], (i > 0 ? dp[i - 1] : 0) + numTrips + 2);

            // 对于贪心确定的范围 [i...j]，如果存在后续箱子j+1和j为同一码头，那么 [k...j]应该留到下一次
            // 本次卡车应负责 [0...k-1]，注意不要越界
            // [0...k-1] 箱子可以分为 配送 [0...i-1]所需最少trip + [i...k-1] 所需的trip
            // 配送 [0...i-1]所需最少trip 为 dp[i-1]，如果越界认为值为0
            // [i...k-1] 所需的trip = i到j之间所需numTrips - 1  加上 从仓库去i 和 从k-1回仓库
            if (k > 0 && j < n && boxes[j - 1][0] == boxes[j][0]) {
                dp[k - 1] = Math.min(dp[k - 1], (i > 0 ? dp[i - 1] : 0) + numTrips - 1 + 2);
            }

            // 循环体结束i++，代表窗口左边界右移，此时更新窗口内 weightSum 和 numTrips
            weightSum -= boxes[i][1];
            if (i + 1 < n && boxes[i][0] != boxes[i + 1][0]) {
                numTrips--;
            }
        }
        // 返回
        return dp[n - 1];
    }
}
