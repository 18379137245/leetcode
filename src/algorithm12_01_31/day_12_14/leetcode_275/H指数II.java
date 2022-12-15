package algorithm12_01_31.day_12_14.leetcode_275;

public class H指数II {
    public static void main(String[] args) {
        int[] citations = {0,1,3,5,6};
        System.out.println(hIndex(citations));
    }

    public static int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            //找出中间索引位置 对半查找
            int mid = left + (right - left) / 2;
            //以中间索引位置元素为目标
            //大于等于数组长度减去当前索引 右边赋值为中间减1
            if (citations[mid] >= n - mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return n - left;
    }
}
