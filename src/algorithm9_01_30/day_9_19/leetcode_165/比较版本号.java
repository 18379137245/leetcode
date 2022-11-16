package algorithm9_01_30.day_9_19.leetcode_165;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_19.leetcode_165
 * @className: 比较版本号
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/19 20:24
 * @version: 1.0
 */

public class 比较版本号 {

    public static void main(String[] args) {
        System.out.println(compareVersion("0.1.101.1", "0.011"));
    }

    public static int compareVersion(String version1, String version2) {

        String[] split = version1.split("\\.");
        System.out.println(Arrays.toString(split));

        int n = version1.length(), m = version2.length();
        int i = 0, j = 0;
        while (i < n || j < m) {
            int x = 0;
            for (; i < n && version1.charAt(i) != '.'; ++i) {
                x = x * 10 + version1.charAt(i) - '0';
            }
            ++i; // 跳过点号
            int y = 0;
            for (; j < m && version2.charAt(j) != '.'; ++j) {
                y = y * 10 + version2.charAt(j) - '0';
            }
            ++j; // 跳过点号
            if (x != y) {
                return x > y ? 1 : -1;
            }
        }
        return 0;
    }
}
