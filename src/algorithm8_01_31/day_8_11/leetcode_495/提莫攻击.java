package algorithm8_01_31.day_8_11.leetcode_495;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_11.leetcode_495
 * @className: 提莫攻击
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/11 19:50
 * @version: 1.0
 */
public class 提莫攻击 {
    public static void main(String[] args) {
        int[] timeSeries = {1, 2};
        System.out.println(findPoisonedDuration(timeSeries, 2));
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        // 中毒时间
        int time = 0;
        // 中毒过期时间
        int expiredTime = 0;
        // 遍历数组时间
        for (int i = 0; i < timeSeries.length; ++i) {
            // 时间 小于等于 中毒过期时间
            // 第一次没有中毒一定成立
            if (timeSeries[i] >= expiredTime) {
                // 中毒时间
                time += duration;
            } else {
                // 在中毒期间再次中毒 要减过期时间再算
                time += timeSeries[i] + duration - expiredTime;
            }
            //新的过期时间
            expiredTime = timeSeries[i] + duration;
        }
        //返回最后的中毒时间
        return time;
    }

}
