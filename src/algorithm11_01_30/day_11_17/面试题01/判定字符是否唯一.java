package algorithm11_01_30.day_11_17.面试题01;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_17.面试题01
 * @className: 判定字符是否唯一
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/17 19:48
 * @version: 1.0
 */

public class 判定字符是否唯一 {
    public static void main(String[] args) {
        String astr = "leetcode";
        System.out.println(isUnique(astr));
    }

    public static boolean isUnique(String astr) {
        byte[] arr = new byte[26];
        for (int i = 0; i < astr.length(); i++) {
            if(arr[astr.charAt(i)-'a'] > 0){
                return false;
            }
            arr[astr.charAt(i)-'a']++;
        }
        return true;
    }
}
