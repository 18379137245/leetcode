package algorithm12_01_31.day_12_24.leetcode_1901;

import java.util.Arrays;

public class 寻找峰值II {
    public static void main(String[] args) {
        int[][] mat = {{1, 4}, {3, 2}};
        System.out.println(Arrays.toString(findPeakGrid(mat)));
    }

    public static int[] findPeakGrid(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int l = -1, r = m;
        while (l + 1 < r) {
            int cRow = l + (r - l) / 2;
            int maxCol = findMaxIdx(mat[cRow]);
            if (cRow == m - 1 || mat[cRow][maxCol] > mat[cRow + 1][maxCol]) {
                r = cRow;
            } else {
                l = cRow;
            }
        }
        int j = findMaxIdx(mat[r]);
        return new int[]{r, j};
    }

    private static int findMaxIdx(int[] row) {
        int n = row.length;
        int max = 0, maxIdx = -1;
        for (int i = 0; i < n; i++) {
            if (row[i] > max) {
                max = row[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }

}
