package LeetCode.TwoHundrendsTo3;

/**
 * @ClassName: No121
 * @Description: leetcode第121题，Best Time to Buy and Sell Stock
 * @Author: Achilles
 * @Date: 06/01/2020  21:40
 * @Version: 1.0
 **/

public class No121 {
    public int maxProfit(int[] prices) {
//        int max = 0;
//        int min = prices[0];
//        for (int i = 1; i < prices.length; i++) {
//            min = Math.min(min, prices[i - 1]);
//            max = Math.max(max, prices[i] - min);
//        }
//        return max;
        // dp数组，第一列表示天数，第二列表示是否卖出，其中1表示持有，0表示没有
        // 最终结果为dp[prices.length][0]
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = - prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
//            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
//            因为只允许交易一次，所以前一天不可能有多的资金，即前一天资金必定为0
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
        }
        return dp[prices.length - 1][0];
    }

    public static void main(String[] args) {
        System.out.println(new No121().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
