package arrays.e;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int mp = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = 1; j < prices.length; j++) {
                int currPrice = prices[j] - prices[i];
                if (currPrice > 0 && currPrice > mp && i < j) {
                    mp = currPrice;
                }
            }
        }

        return mp;
    }
}
