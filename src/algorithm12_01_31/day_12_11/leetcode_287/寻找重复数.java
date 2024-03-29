package algorithm12_01_31.day_12_11.leetcode_287;

public class 寻找重复数 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};

        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        int n = nums.length;
        int l = 1, r = n - 1, ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            int cnt = 0;
            for (int num : nums) {
                if (num <= mid) {
                    cnt++;
                }
            }
            if (cnt <= mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
                ans = mid;
            }
        }
        return ans;
    }
}
