// you are given an arrays prices where prices[i] is the 
//price of a given stocks on the i th days .
// Return the maximum profit you can achieve fron this transaction .if you cannot achieve any profit return 0;
package Array;

public class PracticeQuestion3 {
    public static int Profitmax(int prices []){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] = buyPrice;
                maxProfit = Math.max(maxProfit, buyPrice);
            }
            else{
                buyPrice = prices[i];
            }

        }
        return 0;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(Profitmax(prices));
    }

    
}
