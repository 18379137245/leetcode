package algorithm7_01_31.day_7_07.leetcode_58;

public class 最后一个单词的长度 {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));

    }
    public static int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        int length = s1[s1.length - 1].length();
        return length;
    }
}
