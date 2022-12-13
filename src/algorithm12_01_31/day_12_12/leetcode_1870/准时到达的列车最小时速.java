package algorithm12_01_31.day_12_12.leetcode_1870;

public class 准时到达的列车最小时速 {
    public static void main(String[] args) {
        int[] dist = {3, 1, 2};
        double hour = 3;
        System.out.println(minSpeedOnTime(dist, hour));
    }

    public static int minSpeedOnTime(int[] dist, double hour) {
        if (dist.length > Math.ceil(hour)) return -1;
        // 搜索边界
        int left = 1, right = Integer.MAX_VALUE;
        while (left < right) {
            int mid = left + (right - left) / 2;
            // 如果以 mid 速度可达，那么就尝试减小速度
            if (check(dist, hour, mid)) {
                right = mid;
            }
            // 否则就需要加了
            else {
                left = mid + 1;
            }

        }
        return left;
    }

    private static boolean check(int[] dist, double hour, int speed) {
        double cnt = 0.0;
        // 对除了最后一个站点以外的时间进行向上取整累加
        for (int i = 0; i < dist.length - 1; ++i) {
            // 除法的向上取整
            cnt += (dist[i] + speed - 1) / speed;
        }
        // 加上最后一个站点所需的时间
        cnt += (double) dist[dist.length - 1] / speed;

        return cnt <= hour;
    }
}
