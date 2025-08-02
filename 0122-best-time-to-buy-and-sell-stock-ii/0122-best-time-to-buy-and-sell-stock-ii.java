class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = 0;
        for(int i=1; i< prices.length; i++){

            if(prices[i]> prices[i-1]){
                minPrice = prices[i-1];
                maxProfit = maxProfit + prices[i] - minPrice;
                
            } 
            minPrice = prices[i];
            

        }

        return maxProfit;
    }
}