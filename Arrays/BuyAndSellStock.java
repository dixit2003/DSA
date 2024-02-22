package Arrays;

public class BuyAndSellStock {

    // Buy and sell stock - I
    static int maxProfit(int[] arr) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int price: arr) {
            if (price < minPrice) {
                minPrice = price;
            }
            else {
                profit = Math.max(profit, price - minPrice);
            }
        }
        return profit;
    }


    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
