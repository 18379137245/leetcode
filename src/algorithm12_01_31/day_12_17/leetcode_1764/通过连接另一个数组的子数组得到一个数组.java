package algorithm12_01_31.day_12_17.leetcode_1764;

public class 通过连接另一个数组的子数组得到一个数组 {
    public static void main(String[] args) {
        int[][] groups = {{1, -1, -1}, {3, -2, 0}};
        int[] nums = {1, -1, 0, 1, -1, -1, 3, -2, 0};
        System.out.println(canChoose(groups, nums));
    }

    public static boolean canChoose(int[][] groups, int[] nums) {
        int n = groups.length;
        int groupsIdx = 0, nStart = 0;//分别定义groups的索引和nums子数组的起点
        while (groupsIdx < n && nStart < nums.length) {
            int i = 0, j = nStart;//分别从各自的起点开始查询
            while (i < groups[groupsIdx].length && j < nums.length) {
                /*若不匹配，则group[groupIdx]的起点回到0，将nums的起点后移一位；
                 * 若匹配，则继续查询各自的下一位*/
                if (groups[groupsIdx][i] != nums[j]) {
                    i = 0;
                    j = ++nStart;
                } else {
                    i++;
                    j++;
                }
            }
            nStart = j;//查询完group[groupsIdx]后，重设nums的起点为j继续查询group[groupsIdx+1]
            if (i == groups[groupsIdx].length) groupsIdx++;//继续查询group[groupsIdx+1]
            else break;
        }
        return groupsIdx == n;//若能将groups所有数字均匹配，则返回true
    }
}
