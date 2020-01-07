package LeetCode.TwoHundrendsTo3;

/**
 * @ClassName: No122
 * @Description: leetcode第122题，Best Time to Buy adn Sell Stock II
 * @Author: Achilles
 * @Date: 07/01/2020  15:29
 * @Version: 1.0
 **/

public class No122 {
    public int maxProfit(int[] prices) {
        //dp[i][j][k]，其中
        // i表示第i天，
        // j表示可以买卖j次，
        // k表示是否持有，1表示持有，0表示不持有
        int[][] dp = new int[prices.length][2];
        dp[0][1] = -prices[0];
        dp[0][0] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[prices.length - 1][0];
    }

    public static void main(String[] args) {
        System.out.println(new No122().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
