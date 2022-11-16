package algorithm8_01_31.day_8_06.leetcode_441;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_06.leetcode_441
 * @className: 排列硬币
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/6 19:37
 * @version: 1.0
 */
public class 排列硬币 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(1));
    }
    public static int arrangeCoins(int n) {
        int count = n;
        int i = 1;
        while (count >= i){
            count -= i;
            i++;
        }
        return i - 1;
    }
}
