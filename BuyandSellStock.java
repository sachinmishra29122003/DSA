public class BuyandSellStock {
    public static int buyandSell(int[] price){
        int buyingPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<price.length;i++){
            if(buyingPrice<price[i]){
                int profit=price[i]-buyingPrice;
                maxProfit=Math.max(maxProfit, profit);
            }
            else{
                buyingPrice=price[i];
            }
        }
        return maxProfit;
    }
    public static int maxProfit(int[] price){
        int profit=0;
        for(int i=1;i<price.length;i++){
          if(price[i]>price[i-1]){
            profit+=price[i]-price[i-1];
          }
        }
        return profit;
      }
    public static void main(String args[]){
        int[] price={7,1,5,3,6,4};
        System.out.println(buyandSell(price));
    }
}
