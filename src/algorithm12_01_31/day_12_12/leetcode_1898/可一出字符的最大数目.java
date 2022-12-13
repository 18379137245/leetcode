package algorithm12_01_31.day_12_12.leetcode_1898;

public class 可一出字符的最大数目 {
    public static void main(String[] args) {
        String s = "abcacb", p = "ab";
        int[] removable = {3, 1, 0};
        System.out.println(maximumRemovals(s, p, removable));

    }

    public static int maximumRemovals(String s, String p, int[] removable) {
        char[] str0 = s.toCharArray();
        char[] str1 = p.toCharArray();
        int ans = 0;//我们要返回的值，答案
        int left = 1;//左边界
        int right = removable.length;//右边界
        while (left <= right) {//开始循环找答案
            int mid = left + right >> 1;//位运算高效求中点
            //这里调用的方法下面讲，他的作用就是删除前mid个removable所指的位置的字符后
            if (search1(mid, str0, str1, removable)) {//是否还能满足p是s的子序列，如果满足返回true
                ans = mid;//进入条件则说明满足，当前的mid就是候选答案之一，最后一个满足要求的mid就一定是答案
                left = mid + 1;//当前mid满足的话我们就要去尝试更大的数值，以缩小答案的范围
            } else {//不满足
                right = mid - 1;//那我们就要去尝试更小的数，寻找能满足的
            }
            str0 = s.toCharArray();//我们在search1方法中改变了str0的值，所以要重新赋值
        }
        return ans;
    }

    private static boolean search1(int mid, char[] str0, char[] str1, int[] removable) {
        for (int i = 0; i < mid; i++) {//这里做的就是将前mid个removable中所指的字符"删除"
            str0[removable[i]] = '1';
        }
        int j = 0;
        for (int i = 0; i < str0.length; i++) {//判断p是不是s的子序列
            if (j < str1.length) {
                if (str1[j] == str0[i]) {
                    j++;
                }
            } else {//已经遍历完p，即可说明p是s的子序列
                return true;
            }
        }
        if (j == str1.length) {//已经遍历完p，即可说明p是s的子序列
            return true;
        }
        return false;//已经遍历完s但是没有完全找到p对应的字符，即p不是s的子序列。
    }
}
