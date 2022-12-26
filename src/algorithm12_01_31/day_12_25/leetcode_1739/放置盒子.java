package algorithm12_01_31.day_12_25.leetcode_1739;

public class 放置盒子 {
    public static void main(String[] args) {
        minimumBoxes(10);
    }

    public static int minimumBoxes(int n) {
        int ans = 0, maxN = 0;
        for (int i = 1; maxN + ans + i <= n; ++i) {
            ans += i;
            maxN += ans;
        }
        for (int j = 1; maxN < n; ++j) {
            ++ans;
            maxN += j;
        }
        return ans;
    }
}
