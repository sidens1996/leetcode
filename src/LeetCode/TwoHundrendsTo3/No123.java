package LeetCode.TwoHundrendsTo3;

/**
 * @ClassName: No123
 * @Description: leetcode第123题，Best Time to Buy and Sell Stock III
 * @Author: Achilles
 * @Date: 07/01/2020  16:53
 * @Version: 1.0
 **/

public class No123 {
    public int maxProfit(int[] prices) {
//        int[][][] dp = new int[prices.length][3][2];
//        for (int i = 0; i < prices.length; i++) {
//            for (int k = 2; k >= 1; k--) {
//                if (i == 0) {
//                    dp[i][k][0] = 0;
//                    dp[i][k][1] = -prices[i];
//                    continue;
//                }
//                dp[i][k][0] = Math.max(dp[i - 1][k][0], dp[i - 1][k][1] + prices[i]);
//                //买入的时候k-1
//                dp[i][k][1] = Math.max(dp[i - 1][k][1], dp[i - 1][k - 1][0] - prices[i]);
//            }
//        }
//        return dp[prices.length - 1][2][0];
        int dp_i10 = 0, dp_i11 = Integer.MIN_VALUE;
        int dp_i20 = 0, dp_i21 = Integer.MIN_VALUE;
        for (int price : prices) {
            dp_i20 = Math.max(dp_i20, dp_i21 + price);
            dp_i21 = Math.max(dp_i21, dp_i10 - price);
            dp_i10 = Math.max(dp_i10, dp_i11 + price);
            dp_i11 = Math.max(dp_i11, -price);
        }
        return dp_i20;
    }

    public static void main(String[] args) {
        System.out.println(new No123().maxProfit(new int[]
                {3, 3, 5, 0, 0, 3, 1, 4}));
    }
}
