package algorithm8_01_31.day_8_01.leetcode_338;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_01.leetcode_338
 * @className: 赎金信
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/1 19:45
 * @version: 1.0
 */
public class 赎金信 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aab", "baa"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        //第一个字符串长度大于第二个字符串长度 直接false
        //因为第二个字符串要能包住第一个字符串 包不住 就没有继续的必要
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        //定义一个长度为26的数字数组 默认值0
        int[] cnt = new int[26];
        //遍历第二个字符串 magazine的字符
        for (char c : magazine.toCharArray()) {
            //c - 'a' 可以得到一个数字 数字出现一次就加一
            System.out.println(c - 'a');
            cnt[c - 'a']++;
        }
        //遍历第二个字符串 ransomNote的字符
        for (char c : ransomNote.toCharArray()) {
            //c - 'a' 可以得到一个数字 数字出现一次就减一
            cnt[c - 'a']--;
            //判断cnt[c - 'a'] 小于 0
            //成立 代表中数组这个数字没出现过 被上面减一了 所以变成负数
            if(cnt[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
