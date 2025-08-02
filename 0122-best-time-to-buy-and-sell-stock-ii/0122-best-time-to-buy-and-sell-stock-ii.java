class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i=0; i< prices.length; i++){
            
            int actualProfit = 0;
            int current = prices[i];
            if( current > minPrice) {
               
                actualProfit = current - minPrice;
                maxProfit+=actualProfit;
            }
            minPrice = current;

        }

        return maxProfit;
    }
}