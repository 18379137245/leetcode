package algorithm12_01_31.day_12_11.leetcode_1552;

import java.util.Arrays;

public class 两球之间的磁力 {
    public static void main(String[] args) {
        int[] position = {1, 2, 3, 4, 7};
        int m = 3;
        System.out.println(maxDistance(position, m));
    }

    public static int maxDistance(int[] position, int m) {
        // 假设最小磁力是 f，此时可以放入的最多的球数是 num
        // 显然 num 随着 f 的增加而单调递减
        // 对 f 进行二分查找，计算对应的 num 与 m 进行比较作为二分的判断条件
        // 如果 num >= m，说明可以放下 m 个球，则 f <= 我们要找的目标磁力
        // f 的取值范围是[1, max(position) - min(position)]
        Arrays.sort(position);
        int left = 1, right = position[position.length - 1] - position[0];
        while (left < right) {
            int mid = ((right - left + 1) / 2) + left;
            if (check(position, mid, m)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static boolean check(int[] position, int f, int m) {
        // 排序后的第一个位置一定放一个球
        int cnt = 1, curPos = position[0];
        for (int pos : position) {
            // 如果遍历到的位置与前一个放球的位置间距不小于 f，则满足条件，可以放球
            if (pos - curPos >= f) {
                cnt++;
                curPos = pos;
            }
        }
        return cnt >= m;
    }
}
