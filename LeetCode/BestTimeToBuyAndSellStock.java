/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int sale = 0;
        int buy = prices[0];
        int buyIndex = 0;
        int oldMax = 0;
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy && i < prices.length - 1) {
                sale = 0;
                buy = prices[i];
                buyIndex = i;
            }

            if (prices[i] > sale && i > buyIndex) {
                sale = prices[i];
                max = Math.max(sale - buy, oldMax);
                oldMax = max;
            }
        }
        return Math.max(max, oldMax);
    }
}