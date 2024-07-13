public class BuyAndSellStocks_Brute_Force {
    public static void main(String[] args) {
        int[] stock_prices = { 10, 1, 5, 6, 7, 1 };

        System.out.println(maxProfit(stock_prices));
    }

    static int maxProfit(int[] prices) {

        int size = prices.length;
        int profit = 0;

        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                profit = Math.max(profit, prices[j] - prices[i]);
            }
        }
        return profit;
    }
}
