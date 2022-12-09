package algorithm12_01_31.day_12_09.leetcode_1760;

public class 袋子里最少数目的球 {
    public static void main(String[] args) {
        int[] nums = {2, 4, 8, 2};
        int maxOperations = 4;
        System.out.println(minimumSize(nums, maxOperations));
    }

    public static int minimumSize(int[] nums, int maxOperations) {
        int ans = 0;
        int l = 1, r = 1000000000;
        while (l <= r) {
            int m = l + ((r - l) >> 1);
            int cut = 0;
            for (int num : nums) {
                if (num > m) {
                    cut += num / m;
                    if (num % m == 0) {
                        cut -= 1;
                    }
                    if (cut > maxOperations) {
                        break;
                    }
                }
            }
            if (cut > maxOperations) {
                l = m + 1;
            } else {
                ans = m;
                r = m - 1;
            }
        }
        return ans;
    }
}
