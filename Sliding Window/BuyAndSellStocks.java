public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] stock_prices = { 10, 1, 5, 6, 7, 1 };

        System.out.println(maxProfit(stock_prices));
    }

    static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0;
        int right = 1;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
