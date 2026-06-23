class Solution {
    public int maxProfit(int[] prices) {
       int maxp=0;
       int buyp = Integer.MAX_VALUE;
       for(int i=0;i<prices.length;i++){
           if(buyp<prices[i]){
            int profit = prices[i]- buyp;
            maxp = Math.max(maxp,profit);
           }
           else{
            buyp= prices[i];
           }
       }
        return maxp;
    }
}