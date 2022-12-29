package algorithm12_01_31.day_12_27.leetcode_2027;

public class 转换字符串的最少操作次数 {
    public static void main(String[] args) {
        String s = "XXOX";
        System.out.println(minimumMoves(s));
    }

    public static int minimumMoves(String s) {
        int covered = -1, res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X' && i > covered) {
                res++;
                covered = i + 2;
            }
        }
        return res;
    }
}
