package algorithm12_01_31.day_12_26.leetcode;

public class 实现strStr {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }
    public static int strStr(String haystack, String needle) {
        //比较两个字符串是否相同 相同 返回0
        if(haystack.equals(needle)){
            return 0;
            // 判断第一个字符串是否包含第二个字符串
        }else if (haystack.contains(needle)){
            // 返回包含的字符串索引位置
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
