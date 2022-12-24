package algorithm12_01_31.day_12_24.leetcode_1754;

public class 构造字典序最大的合并字符串 {
    public static void main(String[] args) {
        String word1 = "cabaa", word2 = "bcaaa";
        System.out.println(largestMerge(word1, word2));
    }

    public static String largestMerge(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        while (word1.length() + word2.length() > 0) {
            if (word1.compareTo(word2) > 0) {
                sb.append(word1.charAt(0));
                word1 = word1.substring(1);
            } else {
                sb.append(word2.charAt(0));
                word2 = word2.substring(1);
            }
        }
        return sb.toString();
    }
}
