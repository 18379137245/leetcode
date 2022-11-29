package algorithm11_01_30.day_11_28.leetcode;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_28.leetcode
 * @className: 字符串中的第一个唯一字符
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/28 19:14
 * @version: 1.0
 */

public class 字符串中的第一个唯一字符 {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        int[] arr = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            arr[s.charAt(i)-'a']++ ;
        }
        for (int i = 0; i < n; i++) {
            if (arr[s.charAt(i)-'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
