package easy;

public class BuyAndSellStocks {
    public static int maxProfit(int[] prices) {
        if(prices.length < 2){
            return 0;
        }
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minValue){
                minValue = prices[i];
            } else if (prices[i] - minValue > maxProfit){
                maxProfit = prices[i] - minValue;
            }
        }
        return maxProfit;
    }
}