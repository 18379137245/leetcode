package algorithm9_01_30.day_9_28.leetcode_299;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_28.leetcode_299
 * @className: 猜数字游戏
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/28 19:12
 * @version: 1.0
 */

public class 猜数字游戏 {
    public static void main(String[] args) {
        System.out.println(getHint("1123", "0111"));
    }

    public static String getHint(String secret, String guess) {
        int n = secret.length();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                count1++;
            } else {
                arr1[secret.charAt(i) - '0']++;
                arr2[guess.charAt(i) - '0']++;
            }
        }
        for (int i = 0; i < 10; i++) {
            count2 += Math.min(arr1[i], arr2[i]);
        }
        return count1 + "A" + count2 + "B";
    }

}
