package algorithm9_01_30.day_9_16.leetcode_97;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_16.leetcode_97
 * @className: 交错字符串
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/16 20:13
 * @version: 1.0
 */

public class 交错字符串 {
    public static void main(String[] args) {
        isInterleave("aabcc", "dbbca", "aadbbcbcac");
    }

    public static boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length(), m = s2.length(), t = s3.length();

        if (n + m != t) {
            return false;
        }

        boolean[][] f = new boolean[n + 1][m + 1];

        f[0][0] = true;
        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= m; ++j) {
                int p = i + j - 1;
                if (i > 0) {
                    f[i][j] = f[i][j] || (f[i - 1][j] && s1.charAt(i - 1) == s3.charAt(p));
                }
                if (j > 0) {
                    f[i][j] = f[i][j] || (f[i][j - 1] && s2.charAt(j - 1) == s3.charAt(p));
                }
            }
        }

        return f[n][m];
    }
}
