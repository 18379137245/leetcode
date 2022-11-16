package algorithm9_01_30.day_9_01.leetcode_717;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_01.leetcode_717
 * @className: 一比特与二比特字符
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/1 19:26
 * @version: 1.0
 */

public class 一比特与二比特字符 {
    public static void main(String[] args) {
        int[] bits ={1, 0, 0};
        System.out.println(isOneBitCharacter(bits));
    }

    public static boolean isOneBitCharacter(int[] bits) {
        int n = bits.length, i = 0;
        while (i < n - 1) {
            i += bits[i] + 1;
        }
        return i == n - 1;
    }
}
