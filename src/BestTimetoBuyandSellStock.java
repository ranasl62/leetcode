public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int min = prices[0], profit = -1;
        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(profit, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return Math.max(profit, 0);
    }

    public static void main(String[] args) {
        System.out.println(new BestTimetoBuyandSellStock().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(new BestTimetoBuyandSellStock().maxProfit(new int[]{9, 90, 0, 1, 5, 3, 8, 4}));
        System.out.println(new BestTimetoBuyandSellStock().maxProfit(new int[]{9, 8, 7, 2}));
    }
}
