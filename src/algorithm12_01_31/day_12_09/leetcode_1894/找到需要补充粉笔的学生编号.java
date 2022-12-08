package algorithm12_01_31.day_12_09.leetcode_1894;

/**
 * @projectName: leetcode
 * @package: algorithm12_01_31.day_12_09.leetcode_1894
 * @className: 找到需要补充粉笔的学生编号
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/12/8 17:51
 * @version: 1.0
 */

public class 找到需要补充粉笔的学生编号 {
    public static void main(String[] args) {
        int[] chalk = {3, 4, 1, 2};
        int k = 25;
        System.out.println(chalkReplacer(chalk, k));
    }

    public static int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        long total = 0;
        for (int num : chalk) {
            total += num;
        }
        k %= total;
        int res = -1;
        for (int i = 0; i < n; ++i) {
            if (chalk[i] > k) {
                res = i;
                break;
            }
            k -= chalk[i];
        }
        return res;
    }
}
