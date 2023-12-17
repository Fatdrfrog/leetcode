class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int[] dp = new int[prices.length];
        for (int i = 0; i < prices.length - 1; i++) {

            dp[i] = prices[i + 1] - prices[i];
            if (dp[i] > 0) {
                sum += dp[i];
            }
        }
        return sum;
    }
}