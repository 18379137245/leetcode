package algorithm12_01_31.day_12_22.leetcode_1292;

public class 元素和小于等于阈值的正方形的最大边长 {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 3, 2, 4, 3, 2}, {1, 1, 3, 2, 4, 3, 2}, {1, 1, 3, 2, 4, 3, 2}};
        int threshold = 4;
        System.out.println(maxSideLength(mat, threshold));
    }

    public static int maxSideLength(int[][] mat, int threshold) {
        // 前缀和+类似DP的思路
        // presum 可以理解为矩形的前缀和 presum[i + 1][j + 1] 表示的是 mat[0][0]-mat[i][j] 这个矩形的和
        int ans = 0, m = mat.length, n = mat[0].length;
        int[][] presum = new int[m + 1][n + 1];
        // 遍历每一个下标
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                // 统计矩形的前缀和 减去 presum[i][j] 是避免重复统计
                presum[i + 1][j + 1] = presum[i][j + 1] + presum[i + 1][j] - presum[i][j] + mat[i][j];
                // 1.判断下标是否合法 2.若存在边长为 ans + 1 的正方形总和小于等于阈值 ans++ 继续找下一个更大的正方形
                if (i - ans >= 0 && j - ans >= 0 && presum[i + 1][j + 1] - presum[i - ans][j + 1] - presum[i + 1][j - ans] + presum[i - ans][j - ans] <= threshold) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
