package algorithm7_01_31.day_7_02.leetcode_139;

import java.util.*;

public class 单词拆分 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String s = sc.nextLine();
        list.add("l");
        list.add("e");
        list.add("c");
        Collections.addAll(list,"11","22","33");
        System.out.println("wordBreak(s,list) = " + wordBreak(s, list));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        HashSet<String> hashSet = new HashSet();
        for (String t : wordDict) hashSet.add(t);
        boolean[] f = new boolean[n + 1];
        f[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                String t = s.substring(j, i);
                if (f[j] == true && hashSet.contains(t)) {
                    f[i] = true;
                    break;
                }
            }
        }
        return f[n];
    }
}