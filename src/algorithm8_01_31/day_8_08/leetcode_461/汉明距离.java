package algorithm8_01_31.day_8_08.leetcode_461;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_08.leetcode_461
 * @className: 汉明距离
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/8 20:25
 * @version: 1.0
 */
public class 汉明距离 {
    public static void main(String[] args) {
        System.out.println(hammingDistance1(3, 1));
    }

    public static int hammingDistance(int x, int y) {
        //模2取余 余数不等的即距离加一 (也就是二进制对应位不一样)
        int distance = 0;
        //两个数都为0时结束
        while (x != 0 || y != 0) {
            //不断对2取余 不一样加一
            if (x % 2 != y % 2){
                distance++;
            }
            //不断除2 两个都为零结束
            x /= 2;
            y /= 2;
        }
        //返回最后不重复的值数量
        return distance;
    }

    public static int hammingDistance1(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
