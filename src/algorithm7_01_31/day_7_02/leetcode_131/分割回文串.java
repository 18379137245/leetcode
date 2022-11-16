package algorithm7_01_31.day_7_02.leetcode_131;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class 分割回文串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("partition(s) = " + partition(s));
    }
    static List<List<String>> res = new ArrayList<>();
    static List<String> path = new ArrayList<>();

    public static List<List<String>> partition(String s) {
        backtracking(s,0);
        return res;
    }

    private static void backtracking(String s, int index) {
        //如果起始位置大于s的大小，说明找到了一组分割方案
        if (index == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s,index,i)){
                //如果是回文子串，则记录
                path.add(s.substring(index,i + 1));
                //起始位置后移，保证不重复
                backtracking(s,i + 1);
                path.remove(path.size() - 1);
            }
        }
    }

    //判断是否是回文串
    private static boolean isPalindrome(String s, int start, int end){
        while (start < end){
            if (s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
}
