//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

// Compare the lowest and highest profit
class Solution {
    public int maxProfit(int[] prices) {
        int least = Integer.MAX_VALUE;
        int maxprofit = 0;
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < least){
                least = prices[i];
            }
            maxprofit = prices[i] - least;
            if(result < maxprofit){
                result = maxprofit;
            }
        }
        return result;
    }
}