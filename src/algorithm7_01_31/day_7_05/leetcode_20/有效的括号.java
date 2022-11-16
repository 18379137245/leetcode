package algorithm7_01_31.day_7_05.leetcode_20;

public class 有效的括号 {
    public static void main(String[] args) {
        String s = "(]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        while (true) {
            int len = s.length();
            s = s.replace("{}", "");
            s = s.replace("()", "");
            s = s.replace("[]", "");
            if (len == s.length()) {
                return len == 0;
            }
        }
    }
}
