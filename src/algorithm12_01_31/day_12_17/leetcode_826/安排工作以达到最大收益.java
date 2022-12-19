package algorithm12_01_31.day_12_17.leetcode_826;

public class 安排工作以达到最大收益 {
    public static void main(String[] args) {
        int[] difficulty = {2, 4, 6, 8, 10}, profit = {10, 20, 30, 40, 50}, worker = {4, 5, 6, 9};
        System.out.println(maxProfitAssignment(difficulty, profit, worker));
    }

    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int sum = 0, N = difficulty.length;
        for (int w : worker) {
            int p = 0;
            for (int i = 0; i < N; i++) {
                if (difficulty[i] > w) continue;
                p = Math.max(p, profit[i]);
            }
            sum += p;
        }
        return sum;
    }
}
