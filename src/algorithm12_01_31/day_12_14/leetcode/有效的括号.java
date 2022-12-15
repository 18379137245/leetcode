package algorithm12_01_31.day_12_14.leetcode;

public class 有效的括号 {
    public static void main(String[] args) {
        String s = "{}{}{}}{}{}{}{}{}{}{}[][][][][]]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        int i = 0;
        while (true) {
            int l = s.length();
            s = s.replace("{}", "");
            s = s.replace("()", "");
            s = s.replace("[]", "");
            if (s.length() == l) {
                return l == 0;
            }
        }
    }
}
