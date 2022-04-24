package leetcode.editor.cn;

/**
 * @author yangxuan
 */
public class BestTimeToBuyAndSellStockIi {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // TO TEST
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] secondPrices = {1, 2, 3, 4, 5};
        int maxProfit = solution.maxProfit(prices);
        System.out.println("最大利润是：" + maxProfit);

        int secondMaxProfit = solution.maxProfit(secondPrices);
        System.out.println("最大利润是：" + secondMaxProfit);

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public int maxProfit(int[] prices) {
            // 动态规划
//            if (prices == null || prices.length < 2)
//                return 0;
//
//            int length = prices.length;
//            int[][] dp = new int[length][2];
//            //初始条件
//            dp[0][1] = -prices[0];
//            dp[0][0] = 0;
//            for (int i = 1; i < length; i++) {
//                //递推公式
//                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
//                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
//            }
//            //最后一天肯定是手里没有股票的时候，利润才会最大，
//            //只需要返回dp[length - 1][0]即可
//            return dp[length - 1][0];
            // 贪心算法
            int max = 0;
            for (int i = 0; i < prices.length - 1; i++) {
                int d = prices[i + 1] - prices[i];
                if (d >= 0) {
                    max += d;
                }
            }
            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
