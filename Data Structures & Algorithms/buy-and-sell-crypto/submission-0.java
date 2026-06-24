class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int profit = 0;

        for (int i = 0; i < n-1; i++){
            for (int j = i+1; j <n; j++){
                int currProfit = prices[j] - prices[i];
                if (profit < currProfit){
                    profit = currProfit;
                }
            }

        }

        return profit;
        
    }
}
