//LC 121
class Solution {
    public int maxProfit(int[] prices) {

        int MinPrice = prices[0];
        int Profit =  0 ;
        for(int i = 1 ; i < prices.length ; i++){
            int LocalProfit = prices[i]-MinPrice;
            if(LocalProfit > Profit){ Profit = LocalProfit; }
            if(prices[i] < MinPrice){ MinPrice = prices[i];}
        }
        return Profit;
    }
}
