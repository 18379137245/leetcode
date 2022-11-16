package algorithm8_01_31.day_8_11.leetcode_492;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_11.leetcode_492
 * @className: 构造矩形
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/11 19:23
 * @version: 1.0
 */
public class 构造矩形 {
    public static void main(String[] args) {
        int[] ints = constructRectangle(122122);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] constructRectangle(int area) {
        // 如果面积为零, 直接返回{0, 0}
        if (area == 0){
            return new int[]{0, 0};
        }
        // 求面积的平方根的int值
        int sqrt = (int) (Math.sqrt(area));
        // 如果平方根之积 与 面积相等, 直接返回
        if (sqrt * sqrt == area){
            return new int[]{sqrt, sqrt};
        }
        // 从平方根开始 遍历检查第一个整除的数
        for (int i = sqrt; i > 0; i--) {
            // 如果整除
            if (area % i == 0) {
                // 返回结果 {最大的除数, 另一个除数}
                return new int[]{Math.max(i, area / i), Math.min(i, area / i)};
            }
        }
        //返回最不可能的结果
        return new int[]{area, 1};
    }
}
