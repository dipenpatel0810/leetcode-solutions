public class BestTimeToSellStock2 {
//Best time to sell Stock II
  public int Solution(int[] prices){
    int totalProfit = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i=0;i<prices.length;i++){
      if (prices[i] < minPrice){
        minPrice = prices[i];
      }
      else if (prices[i] - minPrice > 0){
        totalProfit = totalProfit + prices[i] - minPrice;
        minPrice = prices[i];
      }
    }
    return totalProfit;
  }

  public static void main(String[] args) {
    int[] rates = {7,1,5,3,6,4};
    BestTimeToSellStock2 l = new BestTimeToSellStock2();
    l.Solution(rates);
  }
}
