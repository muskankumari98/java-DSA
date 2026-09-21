 public class BuySellStocks {
    public static int buySellStocks(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){ 
            //profit=(sp-cp)
            //cp=buyprices and sp=  prices[i]

            if(buyprice<prices[i]){
                int profit=prices[i]-buyprice;
               maxprofit=Math.max(profit, maxprofit);
            }
            else{
                buyprice=prices[i];
            }   
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        //int maxprofit=BuySellStocks(prices);
        //System.out.println("max profit is: "+maxprofit);
        System.out.println("max profit is: "+buySellStocks(prices));
        
    }
}
//T(n) = O(n) and S(n) = O(1) for buyprice and maxprofit
//profit=sp-cp
//cp=buyprice and sp=  prices[i]