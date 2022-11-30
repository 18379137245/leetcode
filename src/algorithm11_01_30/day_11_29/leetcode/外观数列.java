package algorithm11_01_30.day_11_29.leetcode;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_29.leetcode
 * @className: 外观数列
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/29 18:53
 * @version: 1.0
 */

public class 外观数列 {
    public static void main(String[] args) {
        System.out.println(countAndSay(6));
    }
    public static String countAndSay(int n) {
        String res = "1";
        for (int i = 2; i <= n; ++i) {
            StringBuilder stringBuilder = new StringBuilder();
            int index = 0;
            while (index < res.length()) {
                int count = 1;
                // 统计当前字符的个数，和下一个比较是否相等
                while (index < res.length() - 1 && res.charAt(index) == res.charAt(index + 1)) {
                    index++;
                    count++;
                }
                // 把当前字符的个数和当前字符一起保存起来
                stringBuilder.append(count).append(res.charAt(index));
                // 统计下一个字符
                index++;
            }
            res = stringBuilder.toString();
        }
        return res;
    }
}
