class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            int left = i,right = i+1;
            while(right < prices.length){
                profit = prices[right++]-prices[left];
                if(profit < 0){
                    left = right++;
                }
                maxProfit = Math.max(maxProfit,profit);
            }
            
        }
        return maxProfit;
    }
}
